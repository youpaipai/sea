/**
 * Created by Administrator on 2016/6/20.
 */

function showImg(index) {

//    var scWidth = $(".scrollcon").width();

    $(".scrollul").stop(false, false).animate({
            left: -264 * index
        },
        500);
}


$(function () {
    //行业分类
    $(".classification-list").find("li:lt(10)").css('border-bottom', '1px dashed #E3E3E3');

    //右侧 返回顶部（插件）
    $('.backtop').mousemove(function () {
        $(this).find('img').attr('src', 'images/backtop1.png');
    })

    $('.backtop').mouseleave(function () {
        $(this).find('img').attr('src', 'images/backtop.png');
    })

    $('.backtop a').toTop();

    //登录成功后显示的信息
    $(".loginbox").on("click", ".logoon", function () {

        var logsucinfo = '<div class="logsuc"><p>Hi，下午好！</p><p>王先生[招标机构]</p></div>'
        $(".loginbox").html(logsucinfo);
    })

    //tab切换(通用)
    $(".righttab").on("click", "li", function () {


//        var tabi = $(this).index(".righttab li:not('.arrow')");
        var tabi =$(this).index();
//        alert(tabi);

        $(".annoitem", $(this).parent().next()).addClass("tabnone");
        $(this).siblings().removeClass("ractive");

        $(".annoitem:eq(" + tabi + ")",$(this).parent().next()).removeClass("tabnone");
        $(this).addClass("ractive");
    })

    //tab切换(有左右箭头的一组tab)
    $(".scrollul").on("click", "li", function () {


//        var tabi = $(this).index(".righttab li:not('.arrow')");
        var tabi =$(this).index();
//        alert(tabi);

        $(".annoitem", $(this).parents(".itemr").next()).addClass("tabnone");
        $(this).siblings().removeClass("ractive");

        $(".annoitem:eq(" + tabi + ")",$(this).parents(".itemr").next()).removeClass("tabnone");
        $(this).addClass("ractive");
    })


    //头部导航滚动


    var len = $("li", ".scrollul").length;
    var widthAll = 66 * len;

    if(widthAll>264){
        $(".scrollL").show();
        $(".scrollR").show();
        $(".scrollul").width(widthAll);
        $(".scrollcon").width(264);
    }
    else{
        $(".scrollcon").width(widthAll);
    }


    $(window).resize(function() {

        var len = $("li", ".scrollul").length;
        var widthAll = 66 * len;

        if(widthAll>264){
            $(".scrollL").show();
            $(".scrollR").show();
            $(".scrollul").width(widthAll);
            $(".scrollcon").width(264);
        }
        else{
            $(".scrollcon").width(widthAll);
        }
    })

    var index = 0;
    var numI = 0;
    $("li", ".scrollul").each(function(i) {
        $(this).css("margin-left", 66 * i)
    });

    $(".scrollR").click(function() {
        numI++;

        if ( - parseInt($(".scrollul").css("left")) >= widthAll - $(".scrollcon").width()) {
            numI = 0;
            showImg(0);
        } else {
            showImg(numI);

        }

    });

    $(".scrollL").click(function() {
        numI--;
        if (numI < 0) {
            numI = 0

        } else {
            showImg(numI)
        }
    });




})