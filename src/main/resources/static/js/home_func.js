// ----------------------------navigation bar-------------------------------
window.onscroll = function() {scrollFunction()};

function scrollFunction() {
    if (document.body.scrollTop > 80 || document.documentElement.scrollTop > 80) {
        document.getElementById("navbar").style.padding = "20px 10px";
        document.getElementById("logo").style.fontSize = "10px";
    } else {
        document.getElementById("navbar").style.padding = "25px 10px";
        document.getElementById("logo").style.fontSize = "10px";
    }
}

// --------------side panel--------------------
function openNav() {
    document.getElementById("mySidepanel").style.width = "125px";
}

function closeNav() {
    document.getElementById("mySidepanel").style.width = "0";
}

// -----------------------------carousel bar---------------------------------
$('#carouselExample').on('slide.bs.carousel', function (e) {


    var $e = $(e.relatedTarget);
    var idx = $e.index();
    var itemsPerSlide = 4;
    var totalItems = $('.carousel-item').length;

    if (idx >= totalItems-(itemsPerSlide-1)) {
        var it = itemsPerSlide - (totalItems - idx);
        for (var i=0; i<it; i++) {
            // append slides to end
            if (e.direction=="left") {
                $('.carousel-item').eq(i).appendTo('.carousel-inner');
            }
            else {
                $('.carousel-item').eq(0).appendTo('.carousel-inner');
            }
        }
    }
});


$('#carouselExample').carousel({
    interval: 2000
});


$(document).ready(function() {
    /* show lightbox when clicking a thumbnail */
    $('a.thumb').click(function(event){
        event.preventDefault();
        var content = $('.modal-body');
        content.empty();
        var title = $(this).attr("title");
        $('.modal-title').html(title);
        content.html($(this).html());
        $(".modal-profile").modal({show:true});
    });

});
/*--------------------------art table----------------------------*/