/*
*Math对象
*   1、创建：
*       1、特点：Math对象不用创建，直接使用。Math.方法名();
*
*   2、方法：
*        1、PI：圆周率
*        2、random：产生0~1之间的随机数（含0不包含1）
*        3、ceil：对数进行上舍入
*        4、floor：对数进行下舍入
*        5、round：把数四舍五入为最接近的整数
* */


document.write(Math.PI + "<br>");
document.write(Math.random() + "<br>");
document.write(Math.round(3.4) + "<br>");
document.write(Math.ceil(3.14) + "<br>");//4
document.write(Math.floor(3.14) + "<br>");//3

/*
* 取1~100之间的随机整数
* */

document.write(Math.floor((Math.random() * 100)+1) + "<br>");
