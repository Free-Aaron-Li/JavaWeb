/*
*编写99乘法表
* */

//0、定义表格
document.write("<table>");

//1、完成基本的for循环嵌套，展示乘法表
var numLeft = 1;
for (; numLeft <= 9; numLeft++) {
    document.write("<tr>")
    for (var numRight = 1; numRight <= numLeft; numRight++) {
        document.write("<td>");
        document.write(numLeft + '*' + numRight + "=" + numLeft * numRight);
        document.write("</td>");
    }
    /*  document.write("<br>")*/
    document.write("</tr>");
}

//2、完成表格嵌套


document.write("</table>");