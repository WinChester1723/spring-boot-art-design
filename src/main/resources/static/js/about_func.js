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
