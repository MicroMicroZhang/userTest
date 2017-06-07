//$(document).ready(function() {

	
//})
	
function show(){
	$('#dg').datagrid({
		url : 'getCustomer',
		method : 'get',
		fitColumns : true,
		//设置为 true，则把数据显示在一行里。设置为 true 可提高加载性能。
		nowrap : true,
		toolbar: [{
			iconCls: 'icon-edit',
			handler: function(){
				//update one customer information
				
			}
		},'-',{
			iconCls: 'icon-help',
			handler: function(){alert('please contact administrator')}
		},'-',{
			iconCls: 'icon-add',
			handler: function(){
				//add a customer infor into Database 
				//by Sophia 2017/06/05
				popupDiv("test");
				$("<form id='addCustomerForm'>" +
						/*"<input id='id'/>" +*/
						"id : <input id='id' name = 'id'/>" +
						"name : <input id='name' name = 'name'/>" +
						"balance : <input id='balance' name = 'balance'/>" +
						"preferrence : <input id='preferrence' name = 'preferrence'/>" +
						"tel : <input id='tel' name = 'tel'/>" +
						"address : <input id='address' name = 'address'/>" +
						"email : <input id='email' name = 'email'/>" +
						"age : <input id='age' name = 'age'/>" +
						"sex : <input id='sex' name = 'sex'/>" +
						"password : <input id='password' name = 'password'/>" +
						"flag : <input id='flag' name = 'flag'/>" +

						"</form>").appendTo(".pop-box-body");

		
				/*$("<form id='ff' method='post'>"+
				"<div>"+
				"<label for='name'>Name:</label>"+
				"<input  type='text' name='name' data-options='required:true' />" +
				"</div>"+
				"<div>"+
				"<label for='email'>Email:</label>"+
				"<input class='easyui-validatebox' type='text' name='email' data-options='validType:'email'' />"+
				"</div>"+
							  
				"</form>").appendTo(".pop-box-body");*/
				
				}
		},'-',{
			iconCls: 'icon-remove',
			handler: function(){
				//delete one customer information in the list but the customer still in the database
			}
		},'-',{
			iconCls: 'icon-search',
			handler: function(){
				
			}
		}],
		columns : [ [ {
			field : 'id',
			title : 'id',
			width : 100
		}, {
			field : 'name',
			title : 'Name',
			width : 100
		}, {
			field : 'balance',
			title : 'balance',
			width : 100
		}, {
			field : 'preferrence',
			title : 'preferrence',
			width : 100
		}, {
			field : 'tel',
			title : 'tel',
			width : 100
		}, {
			field : 'address',
			title : 'address',
			width : 100
		}, {
			field : 'email',
			title : 'email',
			width : 100
		}, {
			field : 'age',
			title : 'age',
			width : 100
		}, {
			field : 'sex',
			title : 'sex',
			width : 100
		} ] ],

	})
	}

function popupDiv(div_id) { 
    var div_obj = $("#"+div_id);  
    var windowWidth = document.body.clientWidth;       
    var windowHeight = document.body.clientHeight;  
    var popupHeight = div_obj.height();       
    var popupWidth = div_obj.width();    
    //添加并显示遮罩层   
 /*   $("<div id='mask'></div>").addClass("mask")   
                              .width(windowWidth + document.body.scrollWidth)   
                              .height(windowHeight + document.body.scrollHeight)   
                              .click(function() {hideDiv(div_id); })   
                              .appendTo("body")   
                              .fadeIn(200);   */
    div_obj.css({"position": "absolute"})   
           .animate({left: windowWidth/2-popupWidth/2,    
                     top: windowHeight/2-popupHeight/2, opacity: "show" }, "slow");   
                    
}   
  
function hideDiv(div_id) {   
    $("#mask").remove();   
    $("#" + div_id).animate({left: 0, top: 0, opacity: "hide" }, "slow");   
}  
function addCustomer(){
	var customer = {};
	var name = $('#name').val();
	var id = $('#id').val();
	var name = $('#name').val();
	var balance = $('#balance').val();
	var preferrence = $('#preferrence').val();
	var tel = $('#tel').val();
	var address = $('#address').val();
	var email = $('#email').val();
	var age = $('#age').val();
	var sex = $('#sex').val();
	var password = $('#password').val();
	var flag = $('#flag').val();
	 customer.name = name;
	 customer.id = id;
	 customer.name = name;
	 customer.balance = balance;
	 customer.preferrence = preferrence;
	 customer.tel = tel;
	 customer.address = address;
	 customer.email = email;
	 customer.age = age;
	 customer.sex = sex;
	 customer.password = password;
	 customer.flag = flag;
	 $.ajax({
		 url:"addCustomer",
		 type:"post",
		 data:"customer",
		 success:function(data){
			 alert("success");
			 console.log(data);
		 },
		 error:function(msg){
			 console.log(msg);
		 }
	 })


}