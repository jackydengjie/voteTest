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
<%@page import="util.*" %> <%--导入util包下的所有java文件--%>
<%@page import="java.net.*" %>
<%@page import="java.lang.*" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>投票</title>
    <script src="https://cdn.staticfile.org/jquery/1.10.2/jquery.min.js"></script>
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
    <script type="text/javascript">
        /*用于控制checkbox复选框可选择的数量*/
        $(document).ready(function() {

            $('input[type=checkbox]').click(function() {
                $("input[name='type']").attr('disabled', true);
                if ($("input[name='type']:checked").length >= 3) {
                    $("input[name='type']:checked").attr('disabled', false);
                } else {
                    $("input[name='type']").attr('disabled', false);
                }
            });

        })
    </script>


</head>
<body>
<div class="project-content" >
    <div class="answer-title">KINGSUN2020年度奖项评选投票</div>

    <form action="${pageContext.request.contextPath}/toSavePs" method="post">
        <div class="question-title">Q1：优秀主管（1人三票，请统一填英文名）</div>
        <input type="hidden" name="action" value="register">
        <table style="margin-top: 25px;">
            <tr>
                <td class="td_left">
                    <label> （1）</label>
                </td>
                <td class="td_right">
                    <input type="text"  name="supervisor1" class="form-control" placeholder="请输入优秀主管英文名" >
                </td>
            </tr>
            <tr>
                <td class="td_left">
                    <label > （2）</label>
                </td>
                <td class="td_right">
                    <input type="text"  name="supervisor2" class="form-control" placeholder="请输入优秀主管英文名" >
                </td>
            </tr>
            <tr>
                <td class="td_left">
                    <label > （3）</label>
                </td>
                <td class="td_right">
                    <input type="text"  name="supervisor3" class="form-control" placeholder="请输入优秀主管英文名" >
                </td>
            </tr>
        </table>



        <div class="question-title">Q2：优秀员工（1人三票，请统一填英文名）</div>
        <input type="hidden" name="action" value="register">
        <table style="margin-top: 25px;">
            <tr>
                <td class="td_left">
                    <label > （1）</label>
                </td>
                <td class="td_right">
                    <input type="text"  name="employees1" class="form-control" placeholder="请输入优秀员工英文名" >
                </td>
            </tr>
            <tr>
                <td class="td_left">
                    <label > （2）</label>
                </td>
                <td class="td_right">
                    <input type="text"  name="employees2" class="form-control" placeholder="请输入优秀员工英文名" >
                </td>
            </tr>
            <tr>
                <td class="td_left">
                    <label > （3）</label>
                </td>
                <td class="td_right">
                    <input type="text" id="supervisor3" name="employees3" class="form-control" placeholder="请输入优秀员工英文名" >
                </td>
            </tr>
        </table>



        <div class="question-title">Q3：敬业之星（1人六票，请统一填英文名）</div>
        <input type="hidden" name="action" value="register">
        <table style="margin-top: 25px;">
            <tr>
                <td class="td_left">
                    <label > （1）</label>
                </td>
                <td class="td_right">
                    <input type="text"  name="professional1" class="form-control" placeholder="请输入敬业之星英文名" >
                </td>
            </tr>
            <tr>
                <td class="td_left">
                    <label > （2）</label>
                </td>
                <td class="td_right">
                    <input type="text"  name="professional2" class="form-control" placeholder="请输入敬业之星英文名" >
                </td>
            </tr>
            <tr>
                <td class="td_left">
                    <label > （3）</label>
                </td>
                <td class="td_right">
                    <input type="text"  name="professional3" class="form-control" placeholder="请输入敬业之星英文名" >
                </td>
            </tr>
            <tr>
                <td class="td_left">
                    <label > （4）</label>
                </td>
                <td class="td_right">
                    <input type="text"  name="professional4" class="form-control" placeholder="请输入敬业之星英文名" >
                </td>
            </tr>
            <tr>
                <td class="td_left">
                    <label > （5）</label>
                </td>
                <td class="td_right">
                    <input type="text"  name="professional5" class="form-control" placeholder="请输入敬业之星英文名" >
                </td>
            </tr>
            <tr>
                <td class="td_left">
                    <label > （6）</label>
                </td>
                <td class="td_right">
                    <input type="text"  name="professional6" class="form-control" placeholder="请输入敬业之星英文名" >
                </td>
            </tr>
        </table>

    <div class="question-content">
        <div class="question-title">Q4：优秀团队（1人三票）</div>
        <div class="question-option">
            <div id='qwe' class='matrix'>
                <div class="icheckbox_div">
                    <span><input type="checkbox" value="FinancialAffairs" id="checkbox1" name="type"><lable> Financial Affairs </lable></span>
                </div>
                <div class="icheckbox_div">
                    <span><input type="checkbox" value="A&HR" id="checkbox2" name="type"><lable> A&HR </lable></span>
                </div>
                <div class="icheckbox_div">
                    <span><input type="checkbox" value="SALES1" id="checkbox3" name="type"><lable> SALES 1 </lable></span>
                </div>
                <div class="icheckbox_div">
                    <span><input type="checkbox" value="SALES2" id="checkbox4" name="type"><lable> SALES 2 </lable></span>
                </div>
                <div class="icheckbox_div">
                    <span><input type="checkbox" value="SALES6" id="checkbox5" name="type"><lable> SALES 6 </lable></span>
                </div>
                <div class="icheckbox_div">
                    <span><input type="checkbox" value="SALES7" id="checkbox6" name="type"><lable> SALES 7 </lable></span>
                </div>
                <div class="icheckbox_div">
                    <span><input type="checkbox" value="PM1" id="checkbox7" name="type"><lable>   PM1  </lable></span>
                </div>
                <div class="icheckbox_div">
                    <span><input type="checkbox" value="PM2" id="checkbox8" name="type"><lable> PM2 </lable></span>
                </div>
                <div class="icheckbox_div">
                    <span><input type="checkbox" value="ProductMarketing" id="checkbox9" name="type"><lable> Product Marketing </lable></span>
                </div>
                <div class="icheckbox_div">
                    <span><input type="checkbox" value="shipping" id="checkbox10" name="type"><lable> shipping </lable></span>
                </div>
                <div class="icheckbox_div">
                    <span><input type="checkbox" value="QC" id="checkbox11" name="type"><lable> QC </lable></span>
                </div>
                <div class="icheckbox_div">
                    <span><input type="checkbox" value="NinBoBranch" id="checkbox12" name="type"><lable> NinBo Branch </lable></span>
                </div>
            </div>
        </div>
    </div>
        <tr><td><input type="submit"  id="regist" value="提交" /></td></tr>
    </form>

</div>

</div>

</body>
</html>
