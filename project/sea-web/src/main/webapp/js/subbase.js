$(function(){
    /*招标公告 竖向导航*/
	$("li",".header-quickNav-list").hover(function(){
									   
				$(this).addClass("lichange");	
				$(this).children(".i-mc").show();
												   
												   },function(){
								$(this).removeClass("lichange");					   
								$(this).children(".i-mc").hide();
													   
													   })
    //左侧点击 展开二级菜单
	
$(".side-tit").on("click",function(){
    if($(this).hasClass("nav-on"))
    {
        $(this).next(".left-nav").hide();
        $(this).removeClass("nav-on");
        $(this).children().removeClass("arrow-down").addClass("arrow-right");
    }
    else{
        $(this).next(".left-nav").show();
        $(this).addClass("nav-on");
        $(this).children().removeClass("arrow-right").addClass("arrow-down");
    }


})


	
})