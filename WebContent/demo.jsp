<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=UTF-8"%>
<html>
<head>
<meta charset="utf-8">
<title>无标题文档</title>
<script src="diyUpload/js/jquery-1.7.1.min.js"></script>

<link rel="stylesheet" type="text/css" href="diyUpload/css/webuploader.css">
<link rel="stylesheet" type="text/css" href="diyUpload/css/diyUpload.css">
<script type="text/javascript" src="diyUpload/js/webuploader.html5only.min.js"></script>
<script type="text/javascript" src="diyUpload/js/diyUpload.js"></script>
</head>
<style>
*{ margin:0; padding:0;}
#box{ margin:50px auto; width:540px; min-height:400px; background:#FF9}
#demo{ margin:50px auto; width:540px; min-height:800px; background:#CF9}
</style>
<body>
<div id="box">
	<div id="test" ></div>
</div>

<div id="demo">
	<div id="as" ></div>
</div>
</body>
<script type="text/javascript">

/*
* 服务器地址,成功返回,失败返回参数格式依照jquery.ajax习惯;
* 其他参数同WebUploader
*/

$('#test').diyUpload({
	url:'server/fileupload.php',
	success:function( data ) {
		console.info( data );
	},
	error:function( err ) {
		console.info( err );	
	}
});

$('#as').diyUpload({
	url:'http://localhost:2222/expis/expisinfo/issueCreate.action',
	success:function( data ) {
		console.info( data );
	},
	error:function( err ) {
		console.info( err );	
	},
	buttonText : '选择要上传的图片',
	chunked:true,
	// 分片大小
	chunkSize:512 * 1024,
	//最大上传的文件数量, 总文件大小,单个文件大小(单位字节);
	fileNumLimit:5,
	fileSizeLimit:500000 * 1024,
	fileSingleSizeLimit:50000 * 1024,
	accept: {}
});
</script>
</html>
