window.onscroll = function() {scrollFunction()};

function scrollFunction() {
    if (document.body.scrollTop > 80 || document.documentElement.scrollTop > 80) {
        document.getElementById("navbar").style.padding = "55px 10px";
        document.getElementById("logo").style.fontSize = "25px";
    } else {
        document.getElementById("navbar").style.padding = "65px 10px";
        document.getElementById("logo").style.fontSize = "25px";
    }
}

function openNav() {
    document.getElementById("mySidepanel").style.width = "125px";
}

function closeNav() {
    document.getElementById("mySidepanel").style.width = "0";
}
