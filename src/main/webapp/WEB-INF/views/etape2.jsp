<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>Ippon Recrute 3</title>
    <meta name="author" content="Julien Dubois" />
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width">

    <link rel="stylesheet" href="resources/css/bootstrap.min.css">
    <style>
        body {
            padding-top: 60px;
            padding-bottom: 40px;
        }
    </style>
    <link rel="stylesheet" href="resources/css/bootstrap-responsive.min.css">
    <link rel="stylesheet" href="resources/css/main.css">

    <script src="resources/js/vendor/modernizr-2.6.2-respond-1.1.0.min.js"></script>
</head>
<body>
<!--[if lt IE 7]>
<p class="chromeframe">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> or <a href="http://www.google.com/chromeframe/?redirect=true">activate Google Chrome Frame</a> to improve your experience.</p>
<![endif]-->

<!-- This code is taken from http://twitter.github.com/bootstrap/examples/hero.html -->

<div class="navbar navbar-inverse navbar-fixed-top">
    <div class="navbar-inner">
        <div class="container">
            <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </a>
            <div class="nav-collapse collapse">
                <ul class="nav">
                    <li>
                        <a class="brand" href="/">Ippon Recrute 3</a>
                    </li>
                    <li>
                        <a href="/etape1">Etape 1</a>
                    </li>
                    <li>
                        <a href="/etape2" class="active">Etape 2</a>
                    </li>
                    <li>
                        <a href="/etape3">Etape 3</a>
                    </li>
                </ul>
            </div>
        </div>
    </div>
</div>

<div class="container">

    <h1>Etape 2 - MU Puzzle</h1>

<p>
    Connaissez-vous le livre &quot;G&ouml;del, Escher, Bach : les brins d'une guirlande &eacute;ternelle&quot; de Douglas Hofstadter (le GEB
    pour les intimes) ?
    <br>
    Il s'agit de plus de 800 pages de math&eacute;matiques, d'algorithmes, de dessins &eacute;tranges, de jeux de langage, de th&eacute;orie
    musicale...
    Pas du plus simple acc&egrave;s mais extr&ecirc;mement int&eacute;ressant.
</p>

<p>
    Au d&eacute;but du livre, l'auteur pose une petite &eacute;nigme bas&eacute;e sur un syst&egrave;me simple :
    <a href="http://en.wikipedia.org/wiki/MU_puzzle">http://en.wikipedia.org/wiki/MU_puzzle</a>
</p>

<p>
    Nous allons r&eacute;utiliser le syst&egrave;me d&eacute;crit pour cette deuxi&egrave;me &eacute;tape de notre jeu :<br>
    A partir des 4 r&egrave;gles de transformation d&eacute;crites dans la page de wikipedia,
    &eacute;crire un algorithme pour trouver les <b>plus petites</b> s&eacute;quences de transformation permettant d'arriver &agrave;
    &quot;MUIIU&quot; en partant de &quot;MI&quot;.<br>
    Et contrairement au puzzle original, celui-l&agrave; a bien une r&eacute;ponse ... ;-)<br>
    D'ailleurs attention : il existe plusieurs s&eacute;quences de tailles identiques mais minimales, il faut donc toutes les
    trouver ...

</p>

<p>
    Une fois les solutions trouv&eacute;es, prenez les listes des num&eacute;ros des r&egrave;gles de ces s&eacute;quences et choississez celle qui
    forme le plus petit nombre.
    <br>
    A vous ensuite de trouver comment cette s&eacute;quence peut vous aider &agrave; d&eacute;coder cette <a
        href="${request.contextPath}/etape3">page</a>
</p>

    <hr>

    <footer>
        <p>&copy; Ippon Technologies 2013</p>
    </footer>

</div> <!-- /container -->

<script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<script>window.jQuery || document.write('<script src="resources/js/vendor/jquery-1.9.1.min.js"><\/script>')</script>

<script src="resources/js/vendor/bootstrap.min.js"></script>

<script src="resources/js/main.js"></script>

</body>
</html>
