<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=UTF-8"%>
 
<html lang="zh-CN"><head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>
            演示 - Web Uploader
        </title>

    <link rel="shortcut icon" href="http://fex.baidu.com/webuploader/images/favicon.ico">
    <link rel="stylesheet" type="text/css" href="webuploder/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="webuploder/bootstrap-theme.css">
    <link rel="stylesheet" type="text/css" href="webuploder/font-awesome.css">
    <link rel="stylesheet" type="text/css" href="webuploder/syntax.css">
    <link rel="stylesheet" type="text/css" href="webuploder/style.css">
    
    <link rel="stylesheet" type="text/css" href="webuploder/webuploader.css">
    
    <link rel="stylesheet" type="text/css" href="webuploder/demo.css">
    
</head>

<body>
         <div class="page-body">

<div id="post-container" class="container">
    

    

    

    <div class="page-container">
        

<p>您可以尝试文件拖拽，使用QQ截屏工具，然后激活窗口后粘贴，或者点击添加图片按钮，来体验此demo.</p>

<div id="uploader" class="wu-example">
    <div class="queueList">
        <div id="dndArea" class="placeholder">
            <div class="webuploader-container" id="filePicker"><div class="webuploader-pick">点击选择图片</div><div style="position: absolute; top: 0px; left: 448px; width: 168px; height: 44px; overflow: hidden; bottom: auto; right: auto;" id="rt_rt_19c3kj909h49io1909bb0a791"><input accept="image/*" multiple="multiple" class="webuploader-element-invisible" name="file" type="file"><label style="opacity: 0; width: 100%; height: 100%; display: block; cursor: pointer; background: none repeat scroll 0% 0% rgb(255, 255, 255);"></label></div></div>
            <p>或将照片拖到这里，单次最多可选300张</p>
        </div>
    <ul class="filelist"></ul></div>
    <div class="statusBar" style="display:none;">
        <div style="display: none;" class="progress">
            <span class="text">0%</span>
            <span style="width: 0%;" class="percentage"></span>
        </div><div class="info">共0张（0B），已上传0张</div>
        <div class="btns">
            <div class="webuploader-container" id="filePicker2"><div class="webuploader-pick">继续添加</div><div style="position: absolute; top: 0px; left: 0px; width: 1px; height: 1px; overflow: hidden;" id="rt_rt_19c3kj90em3d1hrdcjk11ri45c6"><input accept="image/*" multiple="multiple" class="webuploader-element-invisible" name="file" type="file"><label style="opacity: 0; width: 100%; height: 100%; display: block; cursor: pointer; background: none repeat scroll 0% 0% rgb(255, 255, 255);"></label></div></div><div class="uploadBtn state-pedding">开始上传</div>
        </div>
    </div>
</div>

    </div>
 
</div>
    </div>
    <script type="text/javascript">
    // 添加全局站点信息
    var BASE_URL = '/webuploader';
    </script>
    <script type="text/javascript" src="webuploder/jquery-1.js"></script>
    <script type="text/javascript" src="webuploder/bootstrap.js"></script>
    <script type="text/javascript" src="webuploder/global.js"></script>
    
        <script type="text/javascript" src="webuploder/webuploader.js"></script>
    
        <script type="text/javascript" src="webuploder/demo.js"></script>
    
    <script type="text/javascript">
    var _bdhmProtocol = (("https:" == document.location.protocol) ? " https://" : " http://");
    document.write(unescape("%3Cscript src='" + _bdhmProtocol + "hm.baidu.com/h.js%3F67c4841095cbee8275705e1f6224a3c7' type='text/javascript'%3E%3C/script%3E"));
    </script>
	
	


</body></html>