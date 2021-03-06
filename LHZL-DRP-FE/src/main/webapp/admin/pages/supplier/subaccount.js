/**
 * Created by huhaosumail on 16/4/2.
 */
//var initDataOper = function () {
//    var gridApi = $("#codeTable").grid({
//        ennableSelect: true,
//        columns: [
//            {name: "id", display: "id", hidden: true},
//            {name: "userid", display: "userid", hidden: true},
//            {name: "userid", "display": "所属供应商"},
//            {name: "oppacct", "display": "操作员账户"},
//            {name: "opername", "display": "操作员姓名"},
//            {name: "gender", "display": "操作员性别"}
//        ],
//        ajax: {
//            url: "http://localhost:8080/LHZL-DRP-BE/rest/supplierController/queryOper",
//            params: {}
//        }
//    });
//
//
//}
var initDataOper = function () {

    //初始化codeGrid
    var codeGridApi = $("#codeTable").grid({
        ennableSelect: true,
        columns: [
            {name: "id", display: "id", hidden: true},
            {name: "userPid", display: "userPid", hidden: true},
            {name: "puserName", "display": "所属供应商"},
            {name: "username", "display": "会员姓名"},
            {name: "mobile", "display": "电话"},
            {name: "idcard", "display": "会员证件"},
        ],
        ajax: {
            url: window.serviceUrl + "supplierController/querySupplierUser?token=" + (localStorage.getItem("token") || ""),
            params: {}
        },
        callback: function () {
            $("#valueTable").html("");
            $("#insertValue").unbind();
            $("#updateValue").unbind();
            $("#deleteValue").unbind();
        }
    });


    //查询code
    $("#queryCode").click(function () {
        codeGridApi.reload($("#codeForm").form2object());
    });


    //新增code
    $("#insertCode").click(function () {
        $("#codeModal").modal('show');
        //保存codeModal
        $("#saveSupplier").unbind().click(function () {
            $.ajax({
                url: window.serviceUrl + "supplierController/insertSupplier?token=" + localStorage.getItem("token"),
                type: "post",
                dataType: "json",
                contentType: "application/json",
                data: JSON.stringify($("#codeModal form").form2object()),
                success: function (result) {
                    codeGridApi.reload();
                    $('#codeModal').modal('hide');
                }
            })
        });
    });

    //修改code
    $("#updateCode").unbind().click(function () {
        if (codeGridApi.getSelectedRows().length != 1) {
            alert("请选择一条数据");
            return false;
        }
        //打开codeModal
        $("#codeModal").modal('show');
        //加载数据
        var data = codeGridApi.getSelectedRows()[0];
        $("#codeModal form").object2form(data);
        //保存codeModal
        $("#saveSupplier").unbind().click(function () {
            $.ajax({
                url: window.serviceUrl + "supplierController/updateSupplier?token=" + localStorage.getItem("token"),
                type: "post",
                dataType: "json",
                contentType: "application/json",
                data: JSON.stringify($("#codeModal form").form2object()),
                success: function (result) {
                    codeGridApi.reload();
                    $('#codeModal').modal('hide');
                }
            })
        });
    });

    //删除code
    $("#deleteCode").click(function () {
        if (codeGridApi.getSelectedRows().length == 0) {
            alert("请选择至少一条数据");
            return false;
        }
        var ids = [];
        for (var i = 0; i < codeGridApi.getSelectedRows().length; i++) {
            ids.push(codeGridApi.getSelectedRows()[i]["id"]);
        }
        $.ajax({
            url: window.serviceUrl + "supplierController/deleteSupplier?token=" + localStorage.getItem("token"),
            type: "post",
            dataType: "json",
            contentType: "application/json",
            data: JSON.stringify(ids),
            success: function (result) {
                codeGridApi.reload();
                $('#codeModal').modal('hide');
            }
        })
    });

    //关闭codeModal
    $("#codeModal").on("hidden.bs.modal", function () {
        $(this).find("input,textarea,select").val('').end();
    });

}
