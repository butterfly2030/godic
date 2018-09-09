$(function(){
			$('#test').datagrid({
				title:'My DataGrid',
				iconCls:'icon-save',
				width:400,
				height:800,
				//fit:true,
				nowrap: true,
				autoRowHeight: false,
				striped: true,
				collapsible:true,
				url:'../queryDhandball',
	/*			sortName: 'code',
				sortOrder: 'desc',*/
				remoteSort: false,
				columns:[[{field:'tid',hidden:'true'}
				],[
					{field:'vNumber',title:'期号',width:50,align:'center'}
				],[
					{field:'vPerPosition1',title:'红一',width:50}
				],[
				   {field:'vPerPosition2',title:'红二',width:50}
				],[
                    {field:'vPerPosition3',title:'红三',width:50}
				],[
                     {field:'vPerPosition4',title:'红四',width:50}
				],[
                   {field:'vPerPosition5',title:'红五',width:50}
				],[
                   {field:'vPerPosition6',title:'红六',width:50}
				],[
                   {field:'vSufPosition1',title:'蓝球',width:50}
				]],
				pagination:true,
				rownumbers:true,
				toolbar:[{
					id:'btnadd',
					text:'Add',
					iconCls:'icon-add',
					handler:function(){
						$('#btnsave').linkbutton('enable');
						alert('add')
					}
				},{
					id:'btncut',
					text:'Cut',
					iconCls:'icon-cut',
					handler:function(){
						$('#btnsave').linkbutton('enable');
						alert('cut')
					}
				},'-',{
					id:'btnsave',
					text:'Save',
					disabled:true,
					iconCls:'icon-save',
					handler:function(){
						$('#btnsave').linkbutton('disable');
						alert('save')
					}
				}]
			});
			var p = $('#test').datagrid('getPager');
			$(p).pagination({
				onBeforeRefresh:function(){
					alert('before refresh');
				}
			});
		});
