<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/4/22
  Time: 22:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="util.*" %>> <%--导入util包下的所有java文件--%>
<%@page import="java.net.*" %>
<%@page import="java.lang.*" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>投票</title>
    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="css/common.css">
    <link rel="stylesheet" type="text/css" href="css/index.css">

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="js/jquery-3.3.1.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
    <!--导入布局js，共享header和footer-->
    <script type="text/javascript" src="js/include.js"></script>
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <style>
        .project-content{
            width: 35%;
            height: 100%;
            /*border: 1px solid blue;*/
            margin: 0 auto;
            font-size: 20px;
        }
        .answer-title{
            font-size:40px;
            margin: 0 auto;

        }
        .kuan{
            width: auto;
        }
    </style>


</head>
<body>
<div class="project-content" >
    <div class="answer-title">KINGSUN2020年度奖项评选投票</div>

    <form id="registerForm" action="user">
        <div class="question-title">Q1：优秀主管（1人三票，请统一填英文名）</div>
        <input type="hidden" name="action" value="register">
        <table style="margin-top: 25px;">
            <tr>
                <td class="td_left">
                    <label for="username"> （1）</label>
                </td>
                <td class="td_right">
                    <input type="text" id="directorname1" name="username" class="form-control" placeholder="请输入优秀主管英文名" >
                </td>
            </tr>
            <tr>
                <td class="td_left">
                    <label for="username"> （2）</label>
                </td>
                <td class="td_right">
                    <input type="text" id="directorname2" name="username" class="form-control" placeholder="请输入优秀主管英文名" >
                </td>
            </tr>
            <tr>
                <td class="td_left">
                    <label for="username"> （3）</label>
                </td>
                <td class="td_right">
                    <input type="text" id="directorname3" name="username" class="form-control" placeholder="请输入优秀主管英文名" >
                </td>
            </tr>
        </table>



        <div class="question-title">Q2：优秀员工（1人三票，请统一填英文名）</div>
        <input type="hidden" name="action" value="register">
        <table style="margin-top: 25px;">
            <tr>
                <td class="td_left">
                    <label for="username"> （1）</label>
                </td>
                <td class="td_right">
                    <input type="text" id="username" name="username" class="form-control" placeholder="请输入优秀员工英文名" >
                </td>
            </tr>
            <tr>
                <td class="td_left">
                    <label for="username"> （2）</label>
                </td>
                <td class="td_right">
                    <input type="text" id="username" name="username" class="form-control" placeholder="请输入优秀员工英文名" >
                </td>
            </tr>
            <tr>
                <td class="td_left">
                    <label for="username"> （3）</label>
                </td>
                <td class="td_right">
                    <input type="text" id="username" name="username" class="form-control" placeholder="请输入优秀员工英文名" >
                </td>
            </tr>
        </table>



        <div class="question-title">Q3：敬业之星（1人六票，请统一填英文名）</div>
        <input type="hidden" name="action" value="register">
        <table style="margin-top: 25px;">
            <tr>
                <td class="td_left">
                    <label for="username"> （1）</label>
                </td>
                <td class="td_right">
                    <input type="text" id="username" name="username" class="form-control" placeholder="请输入敬业之星英文名" >
                </td>
            </tr>
            <tr>
                <td class="td_left">
                    <label for="username"> （2）</label>
                </td>
                <td class="td_right">
                    <input type="text" id="username" name="username" class="form-control" placeholder="请输入敬业之星英文名" >
                </td>
            </tr>
            <tr>
                <td class="td_left">
                    <label for="username"> （3）</label>
                </td>
                <td class="td_right">
                    <input type="text" id="username" name="username" class="form-control" placeholder="请输入敬业之星英文名" >
                </td>
            </tr>
            <tr>
                <td class="td_left">
                    <label for="username"> （4）</label>
                </td>
                <td class="td_right">
                    <input type="text" id="username" name="username" class="form-control" placeholder="请输入敬业之星英文名" >
                </td>
            </tr>
            <tr>
                <td class="td_left">
                    <label for="username"> （5）</label>
                </td>
                <td class="td_right">
                    <input type="text" id="username" name="username" class="form-control" placeholder="请输入敬业之星英文名" >
                </td>
            </tr>
            <tr>
                <td class="td_left">
                    <label for="username"> （6）</label>
                </td>
                <td class="td_right">
                    <input type="text" id="username" name="username" class="form-control" placeholder="请输入敬业之星英文名" >
                </td>
            </tr>
        </table>

    <div class="question-content">
        <div class="question-title">Q4：优秀团队（1人三票）</div>
        <div class="question-option">
            <div id='qwe' class='matrix'>
                <div class="icheckbox_div">
                    <span><input type="checkbox" aria-label="..."><lable> Financial Affairs </lable></span>
                </div>
                <div class="icheckbox_div">
                    <span><input type="checkbox" aria-label="..."><lable> AHR </lable></span>
                </div>
                <div class="icheckbox_div">
                    <span><input type="checkbox" aria-label="..."><lable> SALES 1 </lable></span>
                </div>
                <div class="icheckbox_div">
                    <span><input type="checkbox" aria-label="..."><lable> SALES 2 </lable></span>
                </div>
                <div class="icheckbox_div">
                    <span><input type="checkbox" aria-label="..."><lable> SALES 6 </lable></span>
                </div>
                <div class="icheckbox_div">
                    <span><input type="checkbox" aria-label="..."><lable> SALES 7 </lable></span>
                </div>
                <div class="icheckbox_div">
                    <span><input type="checkbox" aria-label="..."><lable>   PM1  </lable></span>
                </div>
                <div class="icheckbox_div">
                    <span><input type="checkbox" aria-label="..."><lable> PM2 </lable></span>
                </div>
                <div class="icheckbox_div">
                    <span><input type="checkbox" aria-label="..."><lable> Product Marketing </lable></span>
                </div>
                <div class="icheckbox_div">
                    <span><input type="checkbox" aria-label="..."><lable> shipping </lable></span>
                </div>
                <div class="icheckbox_div">
                    <span><input type="checkbox" aria-label="..."><lable> QC </lable></span>
                </div>
                <div class="icheckbox_div">
                    <span><input type="checkbox" aria-label="..."><lable> NinBo Branch </lable></span>
                </div>
            </div>
        </div>
    </div>
    </form>

</div>

</div>

</body>
</html>
