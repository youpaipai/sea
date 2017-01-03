		$(function(){
			$('.leftnav ul a').click(function(){
				$('.leftnav ul a').css('background-color','#f4f4f4');
				$('.leftnav ul a').find('span').css('color','#95A1A8');
				$('.leftnav ul li ul a').find('li').removeClass('dd');
				$('.leftnav ul li ul a').find('li').css('color','#95A1A8');
				$('.set1-1').find('li').find('img').attr('src','images/2.png');
				$('.set1-2').find('li').find('img').attr('src','images/3.png');
				$('.set1-3').find('li').find('img').attr('src','images/4.png');
				$('.set1-4').find('li').find('img').attr('src','images/5.png');
				$('.set3-1').find('li').find('img').attr('src','images/15.png');
				$('.set3-2').find('li').find('img').attr('src','images/16.png');
				$('.set3-3').find('li').find('img').attr('src','images/17.png');
				$('.set2-1').find('li').find('img').attr('src','images/7.png');
				$('.set2-2').find('li').find('img').attr('src','images/8.png');
				$('.set2-3').find('li').find('img').attr('src','images/9.png');
				$('.set2-4').find('li').find('img').attr('src','images/10.png');
				$('.set2-5').find('li').find('img').attr('src','images/11.png');
				$('.set2-6').find('li').find('img').attr('src','images/12.png');
				$('.set2-7').find('li').find('img').attr('src','images/13.png');
				if($(this).next('ul').is(':hidden')){
					$(this).css('background-color','#FF8B00');
					$(this).find('span').css('color','#fff');
					$(this).find('span').find('img').attr('src','images/arrowd.png');
					$(this).next('ul').slideToggle();
				}else{
					$(this).css('background-color','#FF8B00');
					$(this).find('span').css('color','#fff');
					$(this).find('span').find('img').attr('src','images/arrowr.png');
					$(this).next('ul').slideToggle();
				}
			})
			
			$('.leftnav ul li ul a').click(function(){
				$('.set1').find('img:first').attr('src','images/1.png');
				$('.set2').find('img:first').attr('src','images/6.png');
				$('.set3').find('img:first').attr('src','images/14.png');
				$(this).find('li').addClass('dd').parent().siblings().find('li').removeClass('dd');
				$(this).find('li').css('color','#fff').parent().siblings().find('li').css('color','#95A1A8');
			})
			
			$('.set1').click(function(){
				$(this).find('img:first').attr('src','images/1-1.png');
				$('.set2').find('img:first').attr('src','images/6.png');
				$('.set3').find('img:first').attr('src','images/14.png');
			})
			
		/*	$('.set2').click(function(){
				$(this).find('img:first').attr('src','images/6-1.png');
				$('.set1').find('img:first').attr('src','images/1.png');
				$('.set3').find('img:first').attr('src','images/14.png');
			})
			
			$('.set3').click(function(){
				$(this).find('img:first').attr('src','images/14-1.png');
				$('.set1').find('img:first').attr('src','images/1.png');
				$('.set2').find('img:first').attr('src','images/6.png');
			})
			*/
			$('.set1-1').click(function(){
				$(this).find('li').find('img').attr('src','images/2-1.png');
				$('.set1-2').find('li').find('img').attr('src','images/3.png');
				$('.set1-3').find('li').find('img').attr('src','images/4.png');
				$('.set1-4').find('li').find('img').attr('src','images/5.png');
			})
		/*	$('.set1-2').click(function(){
				$(this).find('li').find('img').attr('src','images/3-1.png');
				$('.set1-1').find('li').find('img').attr('src','images/2.png');
				$('.set1-3').find('li').find('img').attr('src','images/4.png');
				$('.set1-4').find('li').find('img').attr('src','images/5.png');
			})
			$('.set1-3').click(function(){
				$(this).find('li').find('img').attr('src','images/4-1.png');
				$('.set1-2').find('li').find('img').attr('src','images/3.png');
				$('.set1-1').find('li').find('img').attr('src','images/2.png');
				$('.set1-4').find('li').find('img').attr('src','images/5.png');
			})
			$('.set1-4').click(function(){
				$(this).find('li').find('img').attr('src','images/5-1.png');
				$('.set1-2').find('li').find('img').attr('src','images/3.png');
				$('.set1-3').find('li').find('img').attr('src','images/4.png');
				$('.set1-1').find('li').find('img').attr('src','images/2.png');
			})
			
			$('.set3-1').click(function(){
				$(this).find('li').find('img').attr('src','images/15-1.png');
				$('.set3-2').find('li').find('img').attr('src','images/16.png');
				$('.set3-3').find('li').find('img').attr('src','images/17.png');
			})
			$('.set3-2').click(function(){
				$(this).find('li').find('img').attr('src','images/16-1.png');
				$('.set3-1').find('li').find('img').attr('src','images/15.png');
				$('.set3-3').find('li').find('img').attr('src','images/17.png');
			})
			$('.set3-3').click(function(){
				$(this).find('li').find('img').attr('src','images/17-1.png');
				$('.set3-2').find('li').find('img').attr('src','images/16.png');
				$('.set3-1').find('li').find('img').attr('src','images/15.png');
			})
			
			$('.set2-1').click(function(){
				$(this).find('li').find('img').attr('src','images/7-1.png');
				$('.set2-2').find('li').find('img').attr('src','images/8.png');
				$('.set2-3').find('li').find('img').attr('src','images/9.png');
				$('.set2-4').find('li').find('img').attr('src','images/10.png');
				$('.set2-5').find('li').find('img').attr('src','images/11.png');
				$('.set2-6').find('li').find('img').attr('src','images/12.png');
				$('.set2-7').find('li').find('img').attr('src','images/13.png');
			})
			$('.set2-2').click(function(){
				$(this).find('li').find('img').attr('src','images/8-1.png');
				$('.set2-1').find('li').find('img').attr('src','images/7.png');
				$('.set2-3').find('li').find('img').attr('src','images/9.png');
				$('.set2-4').find('li').find('img').attr('src','images/10.png');
				$('.set2-5').find('li').find('img').attr('src','images/11.png');
				$('.set2-6').find('li').find('img').attr('src','images/12.png');
				$('.set2-7').find('li').find('img').attr('src','images/13.png');
			})
			$('.set2-3').click(function(){
				$(this).find('li').find('img').attr('src','images/9-1.png');
				$('.set2-2').find('li').find('img').attr('src','images/8.png');
				$('.set2-1').find('li').find('img').attr('src','images/7.png');
				$('.set2-4').find('li').find('img').attr('src','images/10.png');
				$('.set2-5').find('li').find('img').attr('src','images/11.png');
				$('.set2-6').find('li').find('img').attr('src','images/12.png');
				$('.set2-7').find('li').find('img').attr('src','images/13.png');
			})
			$('.set2-4').click(function(){
				$(this).find('li').find('img').attr('src','images/10-1.png');
				$('.set2-2').find('li').find('img').attr('src','images/8.png');
				$('.set2-3').find('li').find('img').attr('src','images/9.png');
				$('.set2-1').find('li').find('img').attr('src','images/7.png');
				$('.set2-5').find('li').find('img').attr('src','images/11.png');
				$('.set2-6').find('li').find('img').attr('src','images/12.png');
				$('.set2-7').find('li').find('img').attr('src','images/13.png');
			})
			$('.set2-5').click(function(){
				$(this).find('li').find('img').attr('src','images/11-1.png');
				$('.set2-2').find('li').find('img').attr('src','images/8.png');
				$('.set2-3').find('li').find('img').attr('src','images/9.png');
				$('.set2-4').find('li').find('img').attr('src','images/10.png');
				$('.set2-1').find('li').find('img').attr('src','images/7.png');
				$('.set2-6').find('li').find('img').attr('src','images/12.png');
				$('.set2-7').find('li').find('img').attr('src','images/13.png');
			})
			$('.set2-6').click(function(){
				$(this).find('li').find('img').attr('src','images/12-1.png');
				$('.set2-2').find('li').find('img').attr('src','images/8.png');
				$('.set2-3').find('li').find('img').attr('src','images/9.png');
				$('.set2-4').find('li').find('img').attr('src','images/10.png');
				$('.set2-5').find('li').find('img').attr('src','images/11.png');
				$('.set2-1').find('li').find('img').attr('src','images/7.png');
				$('.set2-7').find('li').find('img').attr('src','images/13.png');
			})
			$('.set2-7').click(function(){
				$(this).find('li').find('img').attr('src','images/13-1.png');
				$('.set2-2').find('li').find('img').attr('src','images/8.png');
				$('.set2-3').find('li').find('img').attr('src','images/9.png');
				$('.set2-4').find('li').find('img').attr('src','images/10.png');
				$('.set2-5').find('li').find('img').attr('src','images/11.png');
				$('.set2-6').find('li').find('img').attr('src','images/12.png');
				$('.set2-1').find('li').find('img').attr('src','images/7.png');
			})
			*/
			$('.shousuo').click(function(){
				if($('.leftnav').is(':visible')){
					$('.leftnav').hide();
					$(this).css('left','0px');
					$(this).find('img').attr('src','images/shou-1.png');
					$('.reminder').css('margin','25px 15px 0px 22px');
					$('.reminder').css('width','96.4%');
				}else{
					$('.leftnav').show();
					$(this).css('left','248px');
					$(this).find('img').attr('src','images/shou.png');
					$('.reminder').css('margin','25px 15px 0px 270px');
					$('.reminder').css('width','78%');
				}
				
			})
			
			
            
            $('.prompt1').mouseenter(function(){
            	$('.poptip').show();
            })
            
             $('.prompt1').mouseleave(function(){
            	if($('.poptip').hasClass('gg')){
            		$('.poptip').show();
            	}else{
            		$('.poptip').hide();
            	}
            })
             
            $('.poptip').hover(function(){
          		$(this).show();
            	$('.poptip').addClass('gg');
            },function(){
            	$('.poptip').removeClass('gg');
            	$(this).hide();
            })
            
           
           
			
			
			
	        $('.openandcut').click(function(){
				var dtab=$(this).parents('tr').next().find('td').find('table');
				if(dtab.is(':hidden')){
					$(this).find('img').attr('src','images/arrowd.png');
					dtab.show();
				}else{
					$(this).find('img').attr('src','images/arrowr.png');
					dtab.hide();
				}
			})
            
            $('.adad').click(function(){
            	$(this).parent().parent().parent().before("<tr style=\"text-align: center; BACKGROUND-COLOR: #fff;\" class=\"newadd\"><td></td><td><input type=\"text\" name=\"\" id=\"\" value=\"\" placeholder=\"请填写key\"/></td><td><input type=\"text\" name=\"\" id=\"\" value=\"\" placeholder=\"请填写字典值\"/></td><td><a href=\"javascript:void(0);\">确定</a>&nbsp;&nbsp;|<a href=\"javascript:void(0);\" class=\"cancel\">取消</a></td></tr>");
            	$('input, textarea').placeholder({customClass:'my-placeholder'});
            })
            
             $(document).on("click",".cancel",function(){
		           $(this).parent().parent("tr").remove();
		    });
			
			$('.addrow1 button').click(function(){
				$(this).parent().parent().parent().before("<tr style=\"text-align: center; BACKGROUND-COLOR: #fff;\" class=\"industry\"><td></td><td><input type=\"text\" name=\"\" id=\"\" value=\"\" placeholder=\"添加一个分类\"/></td><td><a href=\"javascript:void(0);\">确定</a>&nbsp;&nbsp;|<a href=\"javascript:void(0);\" class=\"cancel\">取消</a></td></tr>");
				$('input, textarea').placeholder({customClass:'my-placeholder'});
			})
          
		})
		
		