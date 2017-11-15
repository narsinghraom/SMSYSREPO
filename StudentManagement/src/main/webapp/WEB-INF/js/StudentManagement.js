$(document).on
('click','#accordion>li>a',
	function(){
			$(this).siblings('.box').addClass('active');
			$(this).closest('li').siblings('li').find('.box').removeClass(
					'active');

			$('#accordion').on('click', 'li>a', function() {
				$('#accordion li a.active').removeClass('active');
				$(this).addClass('active');
			});
		});



$(document).ready(
		function() {
			// Tooltip only Text
			$('.masterTooltip').hover(
					function() {
						// Hover over code
						var title = $(this).attr('title');
						$(this).data('tipText', title).removeAttr('title');
						$('<p class="tooltip"></p>').text(title).appendTo(
								'body').fadeIn('slow');

					}, function() {
						// Hover out code
						$(this).attr('title', $(this).data('tipText'));
						$('.tooltip').remove();
					}); 
		});






