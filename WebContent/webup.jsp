<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=UTF-8"%>
 

<script type="text/javascript" src="webup/upjquery.js" ></script>
<script type="text/javascript" src="webup/webuploader.js"></script>
<script type="text/javascript" src="webup/upload.js"></script>

<link rel="stylesheet" type="text/css" href="webup/webuploader.css" />
<link rel="stylesheet" type="text/css" href="webup/uploadstyle.css" />

<div id="container" >
<div id="uploader" >
                <div class="queueList">
                    <div id="dndArea" class="placeholder">
                        <div id="filePicker"></div>
                        <p>或将照片拖到这里，单次最多可选9张，单个文件大小不超过2M</p>
                    </div>
                </div>
                <div class="statusBar" style="display:none;">
                    <div class="progress">
                        <span class="text">0%</span>
                        <span class="percentage"></span>
                    </div><div class="info"></div>
                    <div class="btns">
                        <div id="filePicker2"></div><div class="uploadBtn">发表</div>
                    </div>
                </div>
 </div>
 </div>

<script type="text/javascript">

uploader = WebUploader.create({
    pick: {      //选择图片按钮
        id: '#filePicker',
        label: '点击选择图片'
    },
    formData: {     //上传图片时附带的参数
        uid: 123
    },
    dnd: '#dndArea',       //指定可拖拽的容器
    paste: '#uploader',      //监听粘贴事件的容器
    swf: './Uploader.swf',   //swf
    chunked: false,           //是否分片上传
    chunkSize: 512 * 1024,   //分片大小
    server: '/Gagbbs/uploadfile', //上传文件服务端

    accept: {      //允许的文件类型
        title: 'Images',
        extensions: 'gif,jpg,jpeg,bmp,png',
        mimeTypes: 'image/*'
    },
   
    disableGlobalDnd: true,       // 禁掉全局的拖拽功能。这样不会出现图片拖进页面的时候，把图片打开。
    fileNumLimit: 9,      //上传文件个数
    fileSizeLimit: 200 * 1024 * 1024,    // 200 M     上传文件总大小
    fileSingleSizeLimit: 2 * 1024 * 1024    // 2 M    单个文件大小
});

</script>