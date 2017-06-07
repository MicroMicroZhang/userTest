var test;
$('document').ready(function(){
	$('#dg').datagrid({
		url:'getstudentsList',
		method:'get',
		
		columns : [ [ {
			field : 'id',
			title : 'Student Id',
			width : 100
		}, {
			field : 'name',
			title : 'Student Name',
			width : 100
		}, {
			field : 'sex',
			title : 'Student Sex',
			width : 100
		}, {
			field : 'score',
			title : 'Student Score',
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
		nowrap: true
		
	})
})
function crtChart(){
	
	$.ajax({ 
		url: 'getstudents',
		cache: false,
		async: false,
		success: function (data) {
			console.log(data);
			var girl1=[];
			var girl2=[];
			var girl3=[];
			var boys1=[];
			var boys2=[];
			var boys3=[];
//			 var Data=data;
             for(var key in data) { 
            	 if(key=="girl"){
            		 for(var i=0;i<data.girl.length;i++){
            			 if(data.girl[i].score>=90){
            				 girl1.push(data.girl[i]);
            			 }else if(data.girl[i].score>=60){
            				 girl2.push(data.girl[i]);
            				 }
            			 else{
            				 girl3.push(data.girl[i]);
            			 }
            			 }
            	 }else{
            		 for(var i=0;i<data.boys.length;i++){
            			 if(data.boys[i].score>=90){
            				 boys1.push(data.boys[i]);
            			 }else if(data.boys[i].score>=60){
            				 boys2.push(data.boys[i]);
            				 }
            			 else{
            				 boys3.push(data.boys[i]);
            			 }
            			 }
            	 }
                  
               }
			
			var chart = Highcharts.chart('container', {

			    chart: {
			        type: 'column'
			    },

			    title: {
			        text: 'Student Score chart'
			    },

			    subtitle: {
			        text: 'Resize the frame or click buttons to change appearance'
			    },

			    legend: {
			        align: 'right',
			        verticalAlign: 'middle',
			        layout: 'vertical'
			    },

			    xAxis: {
			        categories: ['score>90','90>score>60','score<60'],
			        labels: {
			            x: -10
			        }
			    },

			    yAxis: {
			        allowDecimals: false,
			        title: {
			            text: 'renshu'
			        }
			    },

			    series: [{
			        name: 'girl',
			        data: [girl1.length,girl2.length,girl3.length]
			    }, {
			        name: 'boy',
			        data: [boys1.length,boys2.length,boys3.length]
			    }],

			    responsive: {
			        rules: [{
			            condition: {
			                maxWidth: 500
			            },
			            chartOptions: {
			                legend: {
			                    align: 'center',
			                    verticalAlign: 'bottom',
			                    layout: 'horizontal'
			                },
			                yAxis: {
			                    labels: {
			                        align: 'left',
			                        x: 0,
			                        y: -5
			                    },
			                    title: {
			                        text: null
			                    }
			                },
			                subtitle: {
			                    text: null
			                },
			                credits: {
			                    enabled: false
			                }
			            }
			        }]
			    }
			});

			$('#small').click(function () {
			    chart.setSize(400, 300);
			});

			$('#large').click(function () {
			    chart.setSize(600, 300);
			});
			
		}
})
}