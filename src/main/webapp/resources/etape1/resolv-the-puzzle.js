eval(function(p,a,c,k,e,d){e=function(c){return(c<a?'':e(parseInt(c/a)))+((c=c%a)>35?String.fromCharCode(c+29):c.toString(36))};if(!''.replace(/^/,String)){while(c--){d[e(c)]=k[c]||e(c)}k=[function(e){return d[e]}];e=function(){return'\\w+'};c=1};while(c--){if(k[c]){p=p.replace(new RegExp('\\b'+e(c)+'\\b','g'),k[c])}}return p}('(n(){f 1n=0;f X=[\'21\',\'2h\',\'2l\',\'o\'];M(f x=0;x<X.2g&&!w.Y;++x){w.Y=w[X[x]+\'2f\'];w.1e=w[X[x]+\'2m\']||w[X[x]+\'2c\']}b(!w.Y)w.Y=n(1y,2e){f 1d=h 2b().2a();f 17=28.29(0,16-(1d-1n));f 18=w.1S(n(){1y(1d+17)},17);1n=1d+17;E 18};b(!w.1e)w.1e=n(18){2j(18)}}());n 1F(){a.x=c;a.y=c;a.2i=n(e){f e=e||w.27;a.x=e.25-H.1Y;a.y=e.1X-H.1W};a.1U=n(e){a.x=c;a.y=c}}n F(1B,1I){a.C=1B;a.D=1I;a.1A=n(15,1c){b(a.C<15)a.C+=Q;B b(a.C>15)a.C-=Q;b(a.D<1c)a.D+=Q;B b(a.D>1c)a.D-=Q;b(a.C==15&&a.D==1c){1M(O);O=c}}}n 1G(){a.g=h 1D();a.g[0]=0;a.g[1]=z;a.g[2]=K;a.g[3]=1r;a.k=h 1D();a.k[0]=h F(0,0);a.k[1]=h F(z,K);a.k[2]=h F(z,z);a.k[3]=h F(0,z);a.k[4]=h F(K,K);a.k[5]=h F(K,0);a.k[6]=h F(z,0);a.k[7]=h F(K,z);a.k[8]=h F(0,K);a.10=n(J,L){f p=h S();b(J>=a.g[0]&&J<a.g[1])p.x=0;B b(J>=a.g[1]&&J<a.g[2])p.x=1;B b(J>=a.g[2]&&J<a.g[3])p.x=2;B E c;b(L>=a.g[0]&&L<a.g[1])p.y=0;B b(L>=a.g[1]&&L<a.g[2])p.y=1;B b(L>=a.g[2]&&L<a.g[3])p.y=2;B E c;E p};a.1J=n(p){b(O==c){M(i=1;i<9;i++){f t=h S();f q=h S();f u=h S();f m=h S();f 1x=a.10(a.k[i].C,a.k[i].D);b(p.x==1x.x&&p.y==1x.y){t.P=i;q.P=i;u.P=i;m.P=i;b(p.x==0){t.x=c;q.x=0;u.x=1;m.x=0}b(p.x==1){t.x=0;q.x=1;u.x=2;m.x=1}b(p.x==2){t.x=1;q.x=2;u.x=c;m.x=2}b(p.y==0){t.y=0;q.y=c;u.y=0;m.y=1}b(p.y==1){t.y=1;q.y=0;u.y=1;m.y=2}b(p.y==2){t.y=2;q.y=1;u.y=2;m.y=c}b(t.x==c||t.y==c)t=c;b(q.x==c||q.y==c)q=c;b(u.x==c||u.y==c)u=c;b(m.x==c||m.y==c)m=c;M(j=1;j<9;j++){f G=a.10(a.k[j].C,a.k[j].D);b(t!=c){b(G.x==t.x&&G.y==t.y)t=c}b(q!=c){b(G.x==q.x&&G.y==q.y)q=c}b(u!=c){b(G.x==u.x&&G.y==u.y)u=c}b(m!=c){b(G.x==m.x&&G.y==m.y)m=c}}b(t!=c)E t;b(q!=c)E q;b(u!=c)E u;b(m!=c)E m}}}E c}}f H=V.1a(\'H\');H.12=1r;H.13=1r;f 1R=H.1C(\'2d\');f I=V.2K(\'2M\');I.12=H.12;I.13=H.13;f A=I.1C(\'2d\');f T=h 1F();f O=c;f N=c;f v=h 1G();f 1K=1s;f 1w=c;f R=\'1L\';f 19=h 1u();19.1v=\'1q/1i/1o/19.1k\';f W=h 1u();W.1v=\'1q/1i/1o/W.1k\';f 1p=h 1u();1p.1v=\'1q/1i/1o/c.1k\';f 14=V.1a(\'14\');f 11=0;f 1t=c;f Z=0;f 1l=1j;n 2o(){V.1a("2p").1O=\'2q\';R=\'1h\';1t=1z(\'11++;\',1E)}n 1H(){f 1m=1T;M(i=0,y=0;y<3;y++)M(x=0;x<3;x++,i++)b(v.k[i].C!=v.g[x]||v.k[i].D!=v.g[y])1m=1j;E 1m}n 1h(){b(1H()==1j){b(O==c&&T.x!=c&&T.y!=c){N=v.1J(v.10(T.x,T.y));b(N!=c){O=1z(\'v.k[N.P].1A(v.g[N.x], v.g[N.y]);\',1E/1K);Z++;b(Z>=1s||11>=1s){1l=1T;2A("2z ! 2y 2B 2C 1Q 2F.")}}}14.1P=\'2E d&1f;2D&1f;<1g>2x: \'+11+\'s<1g>2w: \'+Z;A.2r=\'#2s\';A.2v(0,0,I.12,I.13);M(i=0,y=0;y<3;y++)M(x=0;x<3;x++,i++){b(x==0&&y==0)A.U(1p,0,0);B{A.U(W,v.g[x],v.g[y],z,z,v.k[i].C,v.k[i].D,z,z);A.2u();A.2H=2;A.2t="#2G";A.2N(v.k[i].C+0.5,v.k[i].D+0.5,z-0.5,z-0.5);A.2I()}}}B{R=\'2J\';b(!1l){14.1P+="<1g><1g><1b>2L r&1f;2k !</1b> 2n 22 1Q 23 &24; l\'&1f;20 2 26 :<1b>1Z</1b>"}V.1a(\'1V\').1O=\'\';A.U(W,0,0)}}n 1N(){1S(n(){1w=w.Y(1N)},Q);b(R==\'1L\')A.U(19,0,0);B b(R==\'1h\')1h();B{w.1e(1w);1M(1t)}1R.U(I,0,0)}',62,174,'||||||||||this|if|null|||var|points|new|||squares||bottomCell|function||cell|topCell|||leftCell|rightCell|board|window|||180|bufferContext|else|xPos|yPos|return|Square|seek2|gameScreen|bufferCanvas|xPixel|360|yPixel|for|target|squareMoving|index|30|gameState|Object|mouse|drawImage|document|judo|vendors|requestAnimationFrame|movements|getCell|time|width|height|lblInfo|lastX||timeToCall|id|dark|getElementById|h5|lastY|currTime|cancelAnimationFrame|eacute|br|game|etape1|false|png|perdu|isFit|lastTime|img|nullSquare|resources|540|60|timeIntervalId|Image|src|gameLoopId|seek1|callback|setInterval|setPosition|xPosition|getContext|Array|1000|MouseListener|Board|imageIsFit|yPosition|canMove|fps|begin|clearInterval|gameLoop|className|innerHTML|pour|screen|setTimeout|true|listenMouseup|lblEndGame|offsetTop|pageY|offsetLeft|IppEvent|tape|ms|code|passer|agrave|pageX|est|event|Math|max|getTime|Date|CancelRequestAnimationFrame||element|RequestAnimationFrame|length|moz|listenMousedown|clearTimeout|ussi|webkit|CancelAnimationFrame|Le|startGame|btnStartGame|hide|fillStyle|FFFFFF|strokeStyle|beginPath|fillRect|Mouvements|Temps|Rechargez|Perdu|alert|la|page|marr|Jeu|recommencer|aaaaFF|lineWidth|stroke|end|createElement|Puzzle|canvas|rect'.split('|'),0,{}))
