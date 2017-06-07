var user = {};
$('document').ready(
		function getData() {
			
			$('#dg').datagrid({
				title : "Sophia's user list",
				pagination : true,
				pageSize : 5,
				pageList : [ 5, 10, 15 ],
				pageNumber : 1,
				iconCls : "icon-search",
				url : 'getUserList1',
				// url:'datagrid_data.json',
				method : 'get',
				columns : [ [ {
					field : 'id',
					title : 'User Id',
					width : 100
				}, {
					field : 'name',
					title : 'User Name',
					width : 100
				}, {
					field : 'password',
					title : 'User Password',
					width : 100
				} ] ],
				toolbar : [ {
					iconCls : 'icon-edit',
					handler : function() {

					}
				}, '-', {
					iconCls : 'icon-help',
					handler : function() {
						alert('help')
					}
				} ],
				loadFilter : 			function pagerFilter(data) {
				if (typeof data.length == 'number'
						&& typeof data.splice == 'function') { // is array
					data = {
						total : data.length,
						rows : data
					}
				}
				var dg = $(this);
				var opts = dg.datagrid('options');
				var pager = dg.datagrid('getPager');
				pager.pagination({
					onSelectPage : function(pageNum, pageSize) {
						opts.pageNumber = pageNum;
						opts.pageSize = pageSize;
						pager.pagination('refresh', {
							pageNumber : pageNum,
							pageSize : pageSize
						});
						dg.datagrid('loadData', data);
					}
				});
				if (!data.originalRows) {
					data.originalRows = (data.rows);
				}
				var start = (opts.pageNumber - 1) * parseInt(opts.pageSize);
				var end = start + parseInt(opts.pageSize);
				data.rows = (data.originalRows.slice(start, end));
				return data;
			}

			});

		
		})

function getSelected() {
	var row = $('#dg').datagrid('getSelected');

	if (row) {
		$.messager.alert('Info', row.id + ":" + row.name + ":" + row.password);
	}
}
function getSelections() {
	var ss = [];
	var rows = $('#dg').datagrid('getSelections');
	for (var i = 0; i < rows.length; i++) {
		var row = rows[i];
		ss.push('<span>' + row.id + ":" + row.name + ":" + row.password
				+ '</span>');
	}
	$.messager.alert('Info', ss.join('<br/>'));
}

function ChangeToTable(){
    var tableString = '<table cellspacing="0" class="pb">';  
    var frozenColumns = $('#dg').datagrid("options").frozenColumns;  // 得到frozenColumns对象     // 得到columns对象  
    var nameList = new Array();
	var columns = $('#dg').datagrid("options").columns;  
	 if (typeof columns != 'undefined' && columns != '') {  
	        $(columns).each(function (index) {  
	            tableString += '\n<tr>';  
	            if (typeof frozenColumns != 'undefined' && typeof frozenColumns[index] != 'undefined') {  
	                for (var i = 0; i < frozenColumns[index].length; ++i) {  
	                    if (!frozenColumns[index][i].hidden) {  
	                        tableString += '\n<th width="' + frozenColumns[index][i].width + '"';  
	                        if (typeof frozenColumns[index][i].rowspan != 'undefined' && frozenColumns[index][i].rowspan > 1) {  
	                            tableString += ' rowspan="' + frozenColumns[index][i].rowspan + '"';  
	                        }  
	                        if (typeof frozenColumns[index][i].colspan != 'undefined' && frozenColumns[index][i].colspan > 1) {  
	                            tableString += ' colspan="' + frozenColumns[index][i].colspan + '"';  
	                        }  
	                        if (typeof frozenColumns[index][i].field != 'undefined' && frozenColumns[index][i].field != '') {  
	                            nameList.push(frozenColumns[index][i]);  
	                        }  
	                        tableString += '>' + frozenColumns[0][i].title + '</th>';  
	                    }  
	                }  
	            }  
	            for (var i = 0; i < columns[index].length; ++i) {  
	                if (!columns[index][i].hidden) {  
	                    tableString += '\n<th width="' + columns[index][i].width + '"';  
	                    if (typeof columns[index][i].rowspan != 'undefined' && columns[index][i].rowspan > 1) {  
	                        tableString += ' rowspan="' + columns[index][i].rowspan + '"';  
	                    }  
	                    if (typeof columns[index][i].colspan != 'undefined' && columns[index][i].colspan > 1) {  
	                        tableString += ' colspan="' + columns[index][i].colspan + '"';  
	                    }  
	                    if (typeof columns[index][i].field != 'undefined' && columns[index][i].field != '') {  
	                        nameList.push(columns[index][i]);  
	                    }  
	                    tableString += '>' + columns[index][i].title + '</th>';  
	                }  
	            }  
	            tableString += '\n</tr>';  
	        });  
	    }  ;
	    var rows = $('#dg').datagrid("getRows"); // 这段代码是获取当前页的所有行  
	    for (var i = 0; i < rows.length; ++i) {  
	        tableString += '\n<tr>';  
	        for (var j = 0; j < nameList.length; ++j) {  
	            var e = nameList[j].field.lastIndexOf('_0');  
	  
	            tableString += '\n<td';  
	            if (nameList[j].align != 'undefined' && nameList[j].align != '') {  
	                tableString += ' style="text-align:' + nameList[j].align + ';"';  
	            }  
	            tableString += '>';  
	            if (e + 2 == nameList[j].field.length) {  
	                tableString += rows[i][nameList[j].field.substring(0, e)];  
	            }  
	            else  
	                tableString += rows[i][nameList[j].field];  
	            tableString += '</td>';  
	        }  
	        tableString += '\n</tr>';  
	    }  
	    tableString += '\n</table>';  
	    console.log(tableString);
	    return tableString;  
}
function Export(strXlsName) {  
/*    var f = $('<form action="/export.aspx" method="post" id="fm1"></form>');  
    var i = $('<input type="hidden" id="txtContent" name="txtContent" />');  
    var l = $('<input type="hidden" id="txtName" name="txtName" />');  
    i.val(ChangeToTable());  
    i.appendTo(f);  
    l.val(strXlsName);  
    l.appendTo(f);  
    f.appendTo(document.body).submit();  
    document.body.removeChild(f); */ 
	//only export the rows which is display in the current page
//	var a = $("#dg").datagrid("getRows");
	$.ajax({
		  url: 'exportExcel',
		  type: 'GET',
//		  data: data,
		  success: function (){
			  
			  console.log("success");
		  	},
		  error: function (msg) {  
              console.log(msg); 
            } 
		});
	
}  


