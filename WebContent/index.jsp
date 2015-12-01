<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=UTF-8"%>
 

<link rel="stylesheet" type="text/css" href="diyUpload/css/webuploader.css">
<link rel="stylesheet" type="text/css" href="diyUpload/css/diyUpload.css">
<script type="text/javascript" src="diyUpload/js/jquery-1.7.1.min.js"></script>
<script type="text/javascript" src="diyUpload/js/webuploader.html5only.min.js"></script>
<script type="text/javascript" src="diyUpload/js/diyUpload.js"></script>

<style>
*{ margin:0; padding:0;}
#filesArea{ margin:0px auto; width:100%; min-height:20px;}
.upload_drag_area{z-index:99; display:inline-block; width:840px; padding:4em 0; margin-left:.5em; border:1px dashed #ddd; background:#fff url(http://rescdn.qqmail.com/zh_CN/htmledition/images/func/dragfile07bf38.gif) no-repeat 20px center; color:#999; text-align:center; vertical-align:middle;}
</style>

<div id="filesArea"><div id="files_show" ></div></div>

<script type="text/javascript">
/*
* 服务器地址,成功返回,失败返回参数格式依照jquery.ajax习惯;
* 其他参数同WebUploader
*/
function initUpload(){
	$('#files_show').diyUpload({
		url:'uploadFiles.action',
		success:function( data ) {
			console.info( data );
		},
		error:function( err ) {
			console.info( err );	
		},
		buttonText : '点击此处选择图片或者将图片拖到此处',
		chunked:true,
		// 分片大小
		chunkSize:512 * 1024,
		//最大上传的文件数量, 总文件大小,单个文件大小(单位字节);
		fileNumLimit:22,
		fileSizeLimit:500000 * 1024,
		fileSingleSizeLimit:1000 * 1024,
		accept:{
			title:"Images",
			extensions:"gif,jpg,jpeg,bmp,png",
			mimeTypes:"image/*"
		}
	});
}

initUpload();
</script>