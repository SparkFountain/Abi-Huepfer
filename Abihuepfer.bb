AppTitle("Abi-Huepfer 1.1") ; Title of the game and version

; Graphics, Buffer and Random generator
Graphics(640,480,32,0)
SetBuffer (BackBuffer())
SeedRnd(MilliSecs())

Global frameTimer = CreateTimer(30)	; frametime: 30 Hz

; all non-moving graphics
Global coin = LoadImage("gfx/1Coin.bmp")			; 1 coin
MaskImage(coin, 255, 0, 255)
Global coin_5 = LoadImage("gfx/5Coin.bmp")			; 5 coins
MaskImage(coin_5, 255, 0, 255)
Global coin_10 = LoadImage("gfx/10Coin.bmp")		; 10 coins
MaskImage(coin_10, 255, 0, 255)
Global purse = LoadImage("gfx/Purse.bmp")			; Purse
MaskImage(purse, 255, 0, 255)
Global creditcard = LoadImage("gfx/Creditcard.bmp")	; Credit card
MaskImage(creditcard, 255, 0, 255)
Global toilet = LoadImage("gfx/Toilet.bmp")			; dirty toilet
MaskImage(toilet, 255, 0, 255)
Global food = LoadImage("gfx/Apetito.bmp")			; toxic school food
MaskImage(food, 255, 0, 255)
Global sandwich = LoadImage("gfx/Sandwich.bmp")		; sandwich
MaskImage(sandwich, 255, 0, 255)
Global ashtray = LoadImage("gfx/Ashtray.bmp")		; an ashtray
MaskImage(ashtray, 255, 0, 255)
Global cheatpaper = LoadImage("gfx/Cheatpaper.bmp") ; cheat paper
MaskImage(cheatpaper, 255, 0, 255)
Global energy = LoadImage("gfx/Energy.bmp")			; little energy coin
MaskImage(energy, 255, 0, 255)
Global brick = LoadImage("gfx/Brick.bmp")			; the wall brick
MaskImage(brick, 255, 0, 255)
Global door = LoadAnimImage("gfx/Door.bmp",32,32,0,2)	; the level door
MaskImage(door, 255, 0, 255	)
Global book = LoadImage("gfx/Book.bmp")				; book that one throws
MaskImage(book, 255, 0, 255)

;math items
Global root = LoadImage("gfx/Root.bmp")				; Square Root
MaskImage(root, 255, 0, 255)
Global function0 = LoadImage("gfx/Function0.bmp")	; Function 1
MaskImage(function0, 255, 0, 255)
Global function1 = LoadImage("gfx/Function1.bmp")	; Function 2
MaskImage(function1, 255, 0, 255)
Global function2 = LoadImage("gfx/Function2.bmp")	; Function 3
MaskImage(function2, 255, 0, 255)
Global function3 = LoadImage("gfx/Function3.bmp")	; Function 4
MaskImage(function3, 255, 0, 255)
Global function4 = LoadImage("gfx/Function4.bmp")	; Function 5
MaskImage(function4, 255, 0, 255)
Global function5 = LoadImage("gfx/Function5.bmp")	; Function 6
MaskImage(function5, 255, 0, 255)
Global function6 = LoadImage("gfx/Function6.bmp")	; Function 7
MaskImage(function6, 255, 0, 255)
Global function7 = LoadImage("gfx/Function7.bmp")	; Function 8
MaskImage(function7, 255, 0, 255)
Global urn = LoadImage("gfx/Urn.bmp")				; Urn
MaskImage(urn, 255, 0, 255)

;german items
Global goethe = LoadImage("gfx/Goethe.bmp")			; Goethe
MaskImage(goethe, 255, 0, 255)
Global schiller = LoadImage("gfx/Schiller.bmp")		; Schiller
MaskImage(schiller, 255, 0, 255)
Global lessing = LoadImage("gfx/Lessing.bmp")		; Lessing
MaskImage(lessing, 255, 0, 255)
Global parataxis = LoadImage("gfx/Parataxis.bmp")	; Parataxis - Hypotaxis
MaskImage(parataxis, 255, 0, 255)
Global blackboard = LoadImage("gfx/Blackboard.bmp")	; Blackboard
MaskImage(blackboard, 255, 0, 255)
Global duden = LoadImage("gfx/Duden.bmp")			; Duden-pupil
MaskImage(duden, 255, 0, 255)

;music items
Global note = LoadImage("gfx/Note.bmp")				; The two notes
MaskImage(note, 255, 0, 255)
Global guitar = LoadImage("gfx/Guitar.bmp")			; broken guitar
MaskImage(guitar, 255, 0, 255)
Global notepaper = LoadImage("gfx/Notepaper.bmp")	; note paper
MaskImage(notepaper, 255, 0, 255)
Global loudspeaker = LoadImage("gfx/Loudspeaker.bmp")	;loud speaker
MaskImage(loudspeaker, 255, 0, 255)
Global piano = LoadImage("gfx/Piano.bmp")			; piano
MaskImage(piano, 255, 0, 255)
Global conductor = LoadImage("gfx/Conductor.bmp")	; conductor
MaskImage(conductor, 255, 0, 255)
Global buzz = LoadImage("gfx/Buzz.bmp")				; pupil with fingers in his ears
MaskImage(buzz, 255, 0, 255)
Global clefs = LoadImage("gfx/Clefs.bmp")			; two clefs
MaskImage(clefs, 255, 0, 255)

;history items
Global hitler = LoadImage("gfx/Hitler.bmp")			; Hitler
MaskImage(hitler, 255, 0, 255)
Global napoleon = LoadImage("gfx/Napoleon.bmp")		; Napoleon
MaskImage(napoleon, 255, 0, 255)
Global honecker = LoadImage("gfx/Honecker.bmp")		; Honecker
MaskImage(honecker, 255, 0, 255)
Global fight = LoadImage("gfx/Historicbattle.bmp")	; two men fighting
MaskImage(fight, 255, 0, 255)
Global dates = LoadImage("gfx/Historicdates.bmp")	; list with historic numbers
MaskImage(dates, 255, 0, 255)
Global germany = LoadImage("gfx/Germany.bmp")		; East and West Germany
MaskImage(germany, 255, 0, 255)
Global sed = LoadImage("gfx/SED.bmp")				; SED sign
MaskImage(sed, 255, 0, 255)

;english items
Global yeswecan = LoadImage("gfx/Yeswecan.bmp")		; "Yes we can"-sign
MaskImage(yeswecan, 255, 0, 255)
Global teatime = LoadImage("gfx/Teatime.bmp")		; Cup of tea
MaskImage(teatime, 255, 0, 255)
Global spo = LoadImage("gfx/Spo.bmp")				; S-P-O - rule
MaskImage(spo, 255, 0, 255)
Global bigben = LoadImage("gfx/Bigben.bmp")			; Big Ben
MaskImage(bigben, 255, 0, 255)
Global usa = LoadImage("gfx/USA.bmp")				; flagg of the USA
MaskImage(usa, 255, 0, 255)

;chemistry items
Global burner = LoadImage("gfx/Burner.bmp")			; Bunsen Burner
MaskImage(burner, 255, 0, 255)
Global testglass = LoadImage("gfx/Testglass.bmp")	; Test glass
MaskImage(testglass, 255, 0 ,255)
Global nh3 = LoadImage("gfx/NH3.bmp")				; NH3-sign
MaskImage(nh3, 255, 0, 255)
Global goggles = LoadImage("gfx/Goggles.bmp")		; goggles
MaskImage(goggles, 255, 0, 255)
Global kettle = LoadImage("gfx/Kettle.bmp")			; kettle
MaskImage(kettle, 255, 0, 255)
Global c4 = LoadImage("gfx/C4.bmp")					; C4
MaskImage(c4, 255, 0, 255)

;sports items
Global bars = LoadImage("gfx/Parallelbars.bmp")		; parallel bars
MaskImage(bars, 255, 0, 255)
Global rings = LoadImage("gfx/Rings.bmp")			; rings
MaskImage(rings, 255, 0, 255)
Global badminton = LoadImage("gfx/Badminton.bmp")	; badminton bat
MaskImage(badminton, 255, 0, 255)
Global football = LoadImage("gfx/Football.bmp")		; football
MaskImage(football, 255, 0, 255)
Global run = LoadImage("gfx/Running.bmp")			; three people running
MaskImage(run, 255, 0, 255)
Global wallbars = LoadImage("gfx/Wallbars.bmp")		; wall bars
MaskImage(wallbars, 255, 0, 255)
Global stand = LoadImage("gfx/Stand.bmp")			; stand
MaskImage(stand, 255, 0, 255)
Global winnersteps = LoadImage("gfx/Winnersteps.bmp")	; Steps for the three winners
MaskImage(winnersteps, 255, 0, 255)

;geography items
Global globe = LoadImage("gfx/Globe.bmp")			; globe
MaskImage(globe, 255, 0, 255)
Global atlas = LoadImage("gfx/Atlas.bmp")			; atlas
MaskImage(atlas, 255, 0, 255)
Global weather = LoadImage("gfx/Weather.bmp")		; weather card
MaskImage(weather, 255, 0, 255)
Global friends = LoadImage("gfx/Friends.bmp")		; friends of all kinds of people
MaskImage(friends, 255, 0, 255)
Global geyser = LoadImage("gfx/Geyser.bmp")			; fountain of a geyser
MaskImage(geyser, 255, 0, 255)
Global watercyclus = LoadImage("gfx/Watercyclus.bmp")	; water cyclus
MaskImage(watercyclus, 255, 0, 255)

;computer science items
Global playray = LoadImage("gfx/Playray.bmp")		; Playray :)
MaskImage(playray, 255, 0, 255)
Global joystick = LoadImage("gfx/Joystick.bmp")		; joystick
MaskImage(joystick, 255, 0, 255)
Global pc_back = LoadImage("gfx/PCback.bmp")		; back side of a PC
MaskImage(pc_back, 255, 0, 255)
Global www = LoadImage("gfx/WWW.bmp")				; WWW-sign
MaskImage(www, 255, 0, 255)
Global google = LoadImage("gfx/Google.bmp")			; Google website
MaskImage(google, 255, 0, 255)
Global printer = LoadImage("gfx/Printer.bmp")		; printer
MaskImage(printer, 255, 0, 255)

;Abitur stuff
Global abihelp = LoadImage("gfx/Abihelp.bmp")		; helping book
MaskImage(abihelp, 255, 0, 255)
Global schillershead = LoadImage("gfx/Schillershead.bmp")	; Schiller's head
MaskImage(schillershead, 255, 0, 255)
Global mephisto = LoadImage("gfx/Mephisto.bmp")		; Mephisto figure
MaskImage(mephisto, 255, 0, 255)
Global calculator = LoadImage("gfx/Calculator.bmp")	; the perfect calculator
MaskImage(calculator, 255, 0, 255)
Global infinite = LoadImage("gfx/Eternal.bmp")		; Infinite symbol
MaskImage(infinite, 255, 0, 255)
Global henning = LoadImage("gfx/Henning.bmp")		; the best math prof in the world!
MaskImage(henning, 255, 0, 255)
Global dictionary = LoadImage("gfx/Dictionary.bmp")	; bilingual dictionary
MaskImage(dictionary, 255, 0, 255)
Global bratwurst = LoadImage("gfx/Bratwurst.bmp")	; original German Bratwurst
MaskImage(bratwurst, 255, 0, 255)
Global holyshit = LoadImage("gfx/Holyshit.bmp")		; the Holy Shit
MaskImage(holyshit, 255, 0, 255)
Global electricapple = LoadImage("gfx/Electricapple.bmp")	; electric apple experiment
MaskImage(electricapple, 255, 0, 255)
Global acid = LoadImage("gfx/Acid.bmp")				; the acid symbol
MaskImage(acid, 255, 0, 255)
Global pse = LoadImage("gfx/PSE.bmp")				; the ultimate PSE!
MaskImage(pse, 255, 0, 255)
Global europe = LoadImage("gfx/Europe.bmp")			; europe card
MaskImage(europe, 255, 0, 255)
Global asia = LoadImage("gfx/Asia.bmp")				; asia card
MaskImage(asia, 255, 0, 255)
Global africa = LoadImage("gfx/Africa.bmp")			; africa card
MaskImage(africa, 255, 0, 255)
Global northamerica = LoadImage("gfx/Northamerica.bmp")	; northern america card
MaskImage(northamerica, 255, 0, 255)
Global southamerica = LoadImage("gfx/Southamerica.bmp")	; southern america card
MaskImage(southamerica, 255, 0, 255)
Global australia = LoadImage("gfx/Australia.bmp")	; australia card
MaskImage(australia, 255, 0, 255)
Global antarctica = LoadImage("gfx/Antarctica.bmp")	; antarctica card
MaskImage(antarctica, 255, 0, 255)

;breaks
Global quarterpause = LoadImage("gfx/Quarterpause.bmp")	; quarter minute break
MaskImage(quarterpause, 255, 0, 255)
Global eighthpause = LoadImage("gfx/Eighthpause.bmp")	; eighth minute break
MaskImage(eighthpause, 255, 0, 255)


;player, teacher and sneak
Global player = LoadAnimImage("gfx/Player_anim.bmp",32,32,0,8)	; player, movable
MaskImage(player, 255, 0, 255 )
Global teacher = LoadAnimImage("gfx/Teacher.bmp",32,32,0,6)	; teacher, movable
MaskImage(teacher, 255, 0, 255)
Global sneak = LoadAnimImage("gfx/Sneak.bmp",32,32,0,6)	; the evil sneak, movable
MaskImage(sneak, 255, 0, 255)

;Monster
Global monster_Lazy = LoadAnimImage("gfx/Monster_Lazy.bmp",32,32,0,4)	; lazy monster
MaskImage(monster_Lazy, 255, 0, 255)
Global monster_Honk = LoadAnimImage("gfx/Monster_Honk.bmp",32,32,0,6)	; honk, movable
MaskImage(monster_Honk, 255, 0, 255)
Global monster_Naughty = LoadAnimImage("gfx/Monster_Naughty.bmp",32,32,0,9)	; naughty, movable
MaskImage(monster_Naughty, 255, 0, 255)
Global monster_Zero = LoadAnimImage("gfx/Monster_Zerobock.bmp",32,32,0,4)	; 0-bock-monster
MaskImage(monster_Zero, 255, 0, 255)


; dimensionate the surface for the bricks
Dim actualLevel(182,25)
Global brickx, bricky ; coordinates of the bricks


;in the Trade Function
Global choice$
Global doTrade = 1 ; whether it's allowed to trade or not
Global nextStep = 0 ; next step in the function
Global point = 0 ; how many points the player can get

; the two fonts
Global tutFont = LoadFont("Comic Sans MS",13) ; number = size in dpi
Global normFont = LoadFont("Arial",12)

; level specific variables
Global level = 1 ;start with the tutorial
Global start = 0
Global didCollide = 0; variable to make sure that player cant press "enter" without having reached next target

; monster variables
Global monster_Frametime 
Global m_lazy_frame, m_naughty_frame, m_zero_frame, m_honk_frame
Global m_lazy_time, m_naughty_time, m_zero_time, m_honk_time
Global m_lazy_move, m_naughty_move, m_zero_move, m_honk_move
Global new_monster.Monster ; to use this var in other functions too

; general variables
Global moveAny = 1 ; all other objects moving
Global player_move = 0 ; the player moving
Global player_Energy = 50 ; player energy
Global score = 0	; player score in coins
Global lives = 5	; number of lives
Global creditPoints ; ... and credit points
Global pointMinimum ; the minimum of points to finish the level

; variables for the jump function
Global jump
Global gravity
Global posy_temp
Global jumpAllow = 1

;variables for the tutorial
Global tut = 0 ; whether tutorial level is played now
Global text_var = 0 ; what text shall be shown
Global doTut = 1 ; start with the tutorial? (1=yes, 0=no)

; player specific variables
Global doDrawPlayer = 1  ; shall the program draw the player?
Global player_posx = 320 ; \ positioned in the middle of the screen
Global player_posy = 256 ; /
Global frame = 0		 ; the frame 
Global time = 0			 ; checks when a frame has to be changed
Global movingRight ; whether he moves in right or left direction
Global movx = -288 ; these variables change if the player is moving
Global movy = 480 ; starting point level 1: right bottom

Global xyz ; just a variable to set the actual level coordinates

; Abi-specific
Global mark#	; what mark gets the player at the end?
Global abiMessage	; shows the message before the two Abi-levels

;checks if the player can shoot
Global shootAble = 1 
Global shootTime = 0

; messages on the screen
Global mathTime ; how long an item message is shown on the screen
Global msg_Item$ ;variable shows the message for each item
Global message
Global start_message = 0 

; to control the pauses in the Abi-Levels
Global pauseTime
Global timeValue

; the sounds
Global jumpSound = LoadSound("sfx/sfx/Jump.wav") ; jump
Global coinCollect = LoadSound("sfx/CoinCollect.wav") ; player collecting coin
Global itemCollect = LoadSound("sfx/ItemCollect.wav") ; player collecting item
Global levelChange = LoadSound("sfx/LevelChange.wav") ; changing level
Global throwBook = LoadSound("sfx/ThrowBook.wav")	  ; book is thrown
Global eat = LoadSound("sfx/Eat.wav")				  ; eats a sandwich
Global monsterDie = LoadSound("sfx/MonsterDie.wav")	  ; monster disappears
Global levelAgain = LoadSound("sfx/LevelAgain.wav")	  ; when restarting a level
Global backGround = PlayMusic("Back.mid") ; background melody

;the following constants include the text for the tutorial-level
Const TUT0$ = "Herzlich willkommen beim Abi-Hüpfer!"
Const Tut1$ = "In diesem Tutorial, der so genannten Einführungsphase, wirst du mit den wichtigsten Elementen des Spiels vertraut gemacht."
Const TUT2$ = "Bist du bereit? Drücke auf [Enter], um fortzufahren."
Const TUT3$ = "(Hinweis: Du kannst dieses Tutorial mit einem Cheat überspringen, indem du Strg+C drückst und dann 'Level+' eingibst.)"
Const TUT4$ = "Du solltest erst einmal einige grundlegende Dinge über das Abitur wissen."
Const TUT5$ = "Wie im richtigen Leben besteht der Weg zum Abitur aus vier Kurshalbjahren und den Abi-Prüfungen."
Const TUT6$ = "Für jedes Halbjahr gibt es einen Level, in dem du Punkte sammelst, die du später für das Abitur brauchst."
Const TUT7$ = "Die Schwierigkeitsstufe steigt mit jedem Level an."
Const TUT8$ = "Wenn du alle vier Kurshalbjahre abgeschlossen hast, wirst du zum letzten Level, dem Abitur, zugelassen."
Const TUT9$ = "Du brauchst nach jedem Kurshalbjahr eine bestimmte Anzahl an Punkten, um weiter zu kommen."
Const TUT10$ = "Solltest du nicht genügend Punkte haben, musst du versuchen, den Level noch einmal zu absolvieren."
Const TUT11$ = "Du hast für alle vier Kurshalbjahre insgesamt fünf Versuche."
Const TUT12$ = "Kommen wir nun zur Steuerung."
Const TUT13$ = "Du kannst deinen Spieler mit den Pfeiltasten nach links und rechts bewegen."
Const TUT14$ = "Gehe nun zu dem Wurzelzeichen."
Const TUT15$ = "Es gibt neun Fächer, für die du unabhängig voneinander Punkte sammelst."
Const TUT16$ = "Du benötigst nach jedem Level eine bestimmte Punktzahl, um weiter zu kommen."
Const TUT17$ = "Wenn du durch solch ein Symbol wie dieses Wurzelzeichen läufst, sammelst du es automatisch auf."
Const TUT18$ = "Dir wird angezeigt, zu welchem Unterrichtsthema das Symbol passt und für welches Fach es dir Punkte bringt."
Const TUT19$ = "Gehe nun zu dem Sandwich."
Const TUT20$ = "Jeder Schüler braucht Energie, um gute Leistungen zu erbringen."
Const TUT21$ = "Du hast links oben am Bildschirm eine Energieanzeige in Prozent."
Const TUT22$ = "Achte darauf, dass deine Energie nie auf 0% sinkt, denn dann wirst du ohnmächtig und musst den Level noch einmal wiederholen."
Const TUT23$ = "Momentan ist deine Energie bei 50%. Wenn du nun das Sandwich isst, siehst du, wie deine Energie zunimmt."
Const TUT24$ = "Siehst du diese dreckige Toilette vor dir?"
Const TUT25$ = "Es soll Schulen geben, wo die Toiletten regelmäßig mutwillig verschmutzt werden..."
Const TUT26$ = "Wenn du mal ganz dringend musst und drei dreckverschmierte Klos zur Auswahl hast, kann dir schon mal übel werden."
Const TUT27$ = "Da du nun das Toiletten-Symbol berührt hast, wirst du gleich sehen, wie deine Energie schwindet."
Const TUT28$ = "Außer Ekel erregenden Toiletten gibt es auch Monster in der Schule, die einen überfallen und Energie abziehen."
Const TUT29$ = "Rechts von dir siehst du ein faules, verschlafenes Monster, das furchtbare Langeweile ausstrahlt und den munteren Schüler"
Const TUT30$ = "schnell trostlos und gleichgültig werden lässt..."
Const TUT31$ = "Du kannst ein Monster jedoch bekämpfen, indem du mit Strg-rechts ein Schulbuch nach ihm wirfst."
Const TUT32$ = "Probier' es mal aus! Wenn das Monster verschwunden ist, gehe weiter nach rechts."
Const TUT33$ = "Andere Monster sorgen dafür, dass dir Punkte abgezogen werden, wenn du mit ihnen in Kontakt kommst."
Const TUT34$ = "So beispielsweise dieser verkommene Gymnasiast, der mit Zigarette und Bier durchs Schulhaus läuft."
Const TUT35$ = "Versuche ihn zu eliminieren! Gehe danach weiter nach rechts."
Const TUT36$ = "Nun zu etwas anderem. Es wird dir vielleicht nicht immer möglich sein, allein durch das Sammeln"
Const TUT37$ = "von Objekten genug Punkte zu kriegen, um den Level zu verlassen."
Const TUT38$ = "Deshalb kannst du zusätzlich Geldmünzen einheimsen, die im ganzen Schulhaus verteilt sind."
Const TUT39$ = "Wofür du sie gebrauchen kannst, dazu kommen wir später."
Const TUT40$ = "Um auf diese Mauer zu kommen, musst du hochspringen. Drücke auf die Leertaste, um zu springen."
Const TUT41$ = "Du kannst dann die restlichen Coins einsammeln."
Const TUT42$ = "Du wirst später feststellen, dass es noch andere Möglichkeiten gibt, an Geld zu kommen."
Const TUT43$ = "Siehst du diese Personen dort oben? Spring zu ihnen hoch und berühre die erste."
Const TUT44$ = "Das ist ein Lehrer. Lehrer kannst du daran erkennen, dass sie immer einen Stapel Klausurhefte unter dem Arm mit sich tragen."
Const TUT45$ = "Außerdem sind sie größer als die Schüler. Mit einem Lehrer kannst du handeln, um dir mehr Punkte zu verschaffen."
Const TUT46$ = "Für je fünfzehn Coins bekommst du einen Punkt von ihm geschenkt."
Const TUT47$ = "Solche Bestechungen gibt es natürlich offiziell überhaupt nicht."
Const TUT48$ = "Sobald sie passiert sind, verschwindet der betroffene Lehrer plötzlich wie vom Erdboden verschluckt..."
Const TUT49$ = "So wie jetzt. - Moment mal, da steht ja noch jemand neben dir. Geh zu ihm hin."
Const TUT50$ = "Man könte denken, dass das ein weiterer Lehrer ist. Aber siehst du, dass er kleiner ist und hinterhältiger guckt?"
Const TUT51$ = "Das ist eine ganz gemeine Petze! Ein Fünftklässler, der sich als Lehrer verkleidet hat und dich veräppeln will."
Const TUT52$ = "Wenn du mit ihm handelst, dann nimmt er dir dein ganzes Geld weg und rennt sofort zum Schulleiter."
Const TUT53$ = "Und der zieht dir für den Bestechungsversuch auch noch einige deiner wertvollen Punkte ab! Ein schlechtes Geschäft..."
Const TUT54$ = "Also merke dir: Handle NIEMALS(!) mit einer Petze!"
Const TUT55$ = "Gehe nun zur Tür."
Const TUT56$ = "Du hast es geschafft, die Einführungsphase ist hiermit beendet."
Const TUT57$ = "Wenn du nun durch diese Tür gehst, kommst du ins erste Kurshalbjahr und es gibt kein Zurück mehr."
Const TUT59$ = "Dein Geld und deine Punkte werden auf 0, deine Energie auf 100% zurückgesetzt."
Const TUT60$ = "Viel Spaß und vor allem viel Glück auf deinem Weg zum (virtuellen) Abitur!"

; these constants show the text for the Abi-message
Const ABI01$ = "Gratuliere! Du hast alle vier Kurshalbjahre erfolgreich absolviert und wirst hiermit zum Abitur zugelassen."
Const ABI02$ = "Bevor du jedoch gleich in die letzte große Herausforderung startest, hier noch ein paar wichtige Hinweise:"
Const ABI03$ = "- Du wirst im Abiturlevel mehr Energie verlieren als sonst, wenn du mit Monstern und anderen Items zusammenstößt."
Const ABI04$ = "Aus diesem Grund gibt es an einigen Orten Energiedrops. Sie sehen aus wie gewöhnliche Münzen mit einem E in der Mitte."
Const ABI05$ = "Ein Energiedrop gibt dir viermal so viel Energie wie ein einfaches Sandwich."
Const ABI06$ = "- Es gibt ein neues Monster, den HONK (Hauptschüler ohne nennenswerte Kenntnisse). Er zieht dir sowohl Energie als auch"
Const ABI07$ = "Punkte ab, wenn du mit ihm zusammenläufst. Außerdem sind Honks schwerer zu besiegen und treten oftmals in Gruppen auf."
Const ABI08$ = "- Die Lehrer haben während der Abiprüfungen die Aufgabe, die Schüler zu beobachten und sie am Schummeln zu hindern."
Const ABI09$ = "Es wäre natürlich zu auffällig, wenn du einen Lehrer während der Prüfung versuchen würdest zu bestechen."
Const ABI10$ = "Aus diesem Grund laufen im Abilevel keine Lehrer herum; du musst dir also deine Punkte ganz alleine beschaffen!"
Const ABI11$ = "(Das bedeutet natürlich auch, dass kein Geld im Schulhaus herumliegt wie üblich, und da lästige Fünftklässler im Abitur"
Const ABI12$ = "nichts zu suchen haben, wird es auch keine Petzen geben.)"
Const ABI13$ = "- Du wirst insgesamt fünf Prüfungen zu absolvieren haben, die schriftlichen in Deutsch, Mathematik, Englisch und Chemie"
Const ABI14$ = "und eine mündliche Prüfung in Geografie."
Const ABI15$ = "In den schriftlichen Prüfungen gibt es pro Fach drei neue Symbole, die du suchen musst."
Const ABI16$ = "Am Ende des Levels musst du von den insgesamt 12 Symbolen mindestens 8 eingesammelt haben, sonst hast du nicht bestanden."
Const ABI17$ = "In der mündlichen Prüfung sind Symbole aller 7 Kontinente unserer Erde versteckt. Du musst sie ALLE finden, um"
Const ABI18$ = "zu bestehen!"
Const ABI19$ = "-Schon eine einzige Abiturprüfung kann sehr lang werden... Aus diesem Grund sind an einigen Stellen in den beiden"
Const ABI20$ = "Abiturleven kurze Pausen eingebaut. Sie sehen aus wie Viertel- und Achtelpausen in der Notationsschrift."
Const ABI21$ = "Sobald du ein Pausenzeichen berührst, bleiben ALLE Monster im ganzen Level für einen kurzen Moment dort stehen, wo sie"
Const ABI22$ = "gerade sind. Dir wird in dieser Zeit auch keine Energie abgezogen, wenn du gegen ein Monster oder eine Toilette oder"
Const ABI23$ = "etwas dergleichen läufst. Je nach Art der Pause erhälst du eine Viertel- oder eine Achtelminute lang diesen Bonus."
Const ABI24$ = "- Falls es dir beim ersten Mal nicht gelingen sollte, das Abitur zu bestehen, macht nichts: Du hast für jeden der beiden"
Const ABI25$ = "Abiturlevel jeweils 3 Versuche! Also bloß keine Panik :)"
Const ABI26$ = "So, jetzt weißt du bescheid. Bleibt nur noch eins: VIEL ERFOLG BEIM ABITUR!!!"

; the level coordinates
Const MOVX_LVL1 = (-288)
Const Movy_Lvl1 = 480
Const MOVX_LVL2 = 5440
Const Movy_Lvl2 = 480
Const MOVX_LVL3 = (-288)
Const Movy_Lvl3 = (-96)
Const MOVX_LVL4 = 5440
Const Movy_Lvl4 = 480
Const MOVX_LVLAbi1 = (-288)
Const Movy_LvlAbi1 = 480
Const MOVX_LVLAbi2 = 156
Const Movy_LvlAbi2 = (-32)

ClsColor(Rnd(0,255),Rnd(0,255),Rnd(0,255)) ;sets a random background

;=== MAIN LOOP
Repeat
	Cls()
	WaitTimer(frameTimer)
	ChooseLevel()
	DrawPlayer()
	MovePlayer()
	DrawCoin()
	CoinCollision()
	DrawMap()
	DrawEnergyItems()
	EnergyItemsCollision()
	DrawSchoolItems()
	SchoolItemsCollision()
	DrawLessEnergyItems()
	LessEnergyItemsCollision()
	DrawMonsters()
	MoveMonsters()
	MonsterCollision()
	DrawTeacher()
	MoveTeacher()
	TeacherTrade()
	DrawSneak()
	MoveSneak()
	SneakTrade()
	DrawPause()
	PauseCollision()
	PlayerJump()
	PlayerShoot()
	DrawShoot()
	ShootCollision()
	DrawLevelDoor()
	LevelDoorCollision() 
	TextTutorial()
	WriteScore()
	ShowMessages()
	Cheat()
	SelectBackGround()
	SaveGame()
	LoadGame()
	Flip(0) 		; change the two buffers
Until(KeyHit(1)) ;until esc is hit
End()
;=== END OF MAIN LOOP


;draws the player and checks his lives and energy
Function DrawPlayer()
	If doDrawPlayer = 1 Then
		DrawImage player, player_posx, player_posy, frame
	EndIf 
	If player_Energy > 100 Then player_Energy = 100 ; no more than 100% energy
	If creditPoints < 0 Then creditPoints = 0 ; no less than 0 points
End Function


Function MovePlayer()
	If player_move <> 0 Then
		If(KeyDown(205)) Then 
			Anim_Player_Right() ; animates the player
			movingRight = 1
			If actualLevel((player_posx+32+movx)/32, (player_posy+movy)/32) = 0 Then
				movx = movx + 4 ;Right
			EndIf
		ElseIf KeyDown(203) Then 
			Anim_Player_Left()
			movingRight = 0
			If actualLevel((player_posx+movx)/32, (player_posy+movy)/32) = 0 Then
				movx = movx - 4 ;Left
			EndIf
		EndIf
	EndIf 
End Function


Function Anim_Player_Right()
	If(MilliSecs()-time>150) Then
		time = MilliSecs()
		frame = frame+1
	EndIf
	If(frame>3) Then frame = 0
End Function


Function Anim_Player_Left()
	If frame < 4 Then frame = 4
	If MilliSecs()-time > 150 Then
		time = MilliSecs()
		frame = frame + 1
	EndIf
If frame > 7 Then frame = 4
End Function


Function DrawCoin()
	For newcoin.Coins = Each Coins
		If newcoin\sort = 1 Then ;ask which coin it is (1,5,10,50-euro or credit card)
		DrawImage coin, ((newcoin\coinx)-movx), ((newcoin\coiny)-movy)
		ElseIf newcoin\sort = 2 Then
		DrawImage coin_5, ((newcoin\coinx)-movx), ((newcoin\coiny)-movy)
		ElseIf newcoin\sort = 3 Then
		DrawImage coin_10, ((newcoin\coinx)-movx), ((newcoin\coiny)-movy)
		ElseIf newcoin\sort = 4 Then
		DrawImage purse,((newcoin\coinx)-movx),((newcoin\coiny)-movy)
		ElseIf newcoin\sort = 5 Then
		DrawImage creditcard,((newcoin\coinx)-movx),((newcoin\coiny)-movy)
		EndIf 
	Next
End Function


Function CoinCollision()
	For newcoin.Coins = Each Coins
		Select(newcoin\sort)
		Case 1
		If ImagesCollide (coin, ((newcoin\coinx)-movx), ((newcoin\coiny)-movy), 0, player, player_posx, player_posy, frame) Then
			Delete newcoin.Coins
			PlaySound coinCollect
			score = score + 1
		EndIf	
		Case 2
		If ImagesCollide (coin_5, ((newcoin\coinx)-movx), ((newcoin\coiny)-movy), 0, player, player_posx, player_posy, frame) Then
			Delete newcoin.Coins
			PlaySound coinCollect
			score = score + 5
		EndIf		
		Case 3
		If ImagesCollide (coin_10, ((newcoin\coinx)-movx), ((newcoin\coiny)-movy), 0, player, player_posx, player_posy, frame) Then
			Delete newcoin.Coins
			PlaySound coinCollect
			score = score + 10
		EndIf
		Case 4
		If ImagesCollide(purse, ((newcoin\coinx)-movx), ((newcoin\coiny)-movy), 0, player, player_posx, player_posy, frame) Then
			Delete newcoin.Coins
			PlaySound coinCollect
			score = score + 50
		EndIf 
		Case 5
		If ImagesCollide(creditcard, ((newcoin\coinx)-movx), ((newcoin\coiny)-movy), 0, player, player_posx, player_posy, frame) Then
			Delete newcoin.Coins
			PlaySound coinCollect
			score = score+Rnd(100,250) ; a number between 100 and 250 "euros"
		EndIf 	
		End Select 
	Next
End Function


Function DrawMap()
	For bricky = 0 To 24 
		For brickx = 0 To 181
			If actualLevel(brickx,bricky) = 1 Then
				DrawImage brick,((brickx*32)-movx),((bricky*32)-movy) ; because the tile has the size of 32*32 pixels
			EndIf
		Next
	Next
End Function


Function DrawEnergyItems()
	For new_energy_object.energys = Each Energys
		Select (new_energy_object\sort)
			; 1: Sandwich, 2: Spicker
			Case 1
				DrawImage(sandwich,((new_energy_object\en_x)-movx),((new_energy_object\en_y)-movy))
			Case 2
				DrawImage(cheatpaper,((new_energy_object\en_x)-movx),((new_energy_object\en_y)-movy))
			Case 3
				DrawImage(energy,((new_energy_object\en_x)-movx),((new_energy_object\en_y)-movy))
		End Select
	Next
End Function 


Function EnergyItemsCollision()
	If(tut=0) Then 	; if current level is NOT tutorial level
		For new_energy_object.energys = Each Energys
			Select(new_energy_object\sort)
				Case 1
					If ImagesCollide(sandwich,((new_energy_object\en_x)-movx),((new_energy_object\en_y)-movy),0,player,player_posx,player_posy,0) Then
						player_Energy = player_Energy + 10
						PlaySound eat
						Delete new_energy_object
					EndIf
				Case 2
					If ImagesCollide(cheatpaper,((new_energy_object\en_x)-movx),((new_energy_object\en_y)-movy),0,player,player_posx,player_posy,0) Then
						player_Energy = player_Energy + 15
						Delete new_energy_object
					EndIf
				Case 3
					If ImagesCollide(energy,((new_energy_object\en_x)-movx),((new_energy_object\en_y)-movy),0,player,player_posx,player_posy,0) Then
						player_Energy = player_Energy + 40
						Delete new_energy_object
					EndIf
			End Select
		Next
	EndIf 
End Function 


Function DrawSchoolItems()
	For newitem.school = Each School
		Select(newitem\school_sort)
		; 1-10: Math; 11-14: English, 15-21: History and so on
		Case 1
			DrawImage root,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 2
			DrawImage urn,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 3
			DrawImage function0,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 4
			DrawImage function1,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 5
			DrawImage function2,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 6
			DrawImage function3,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 7
			DrawImage function4,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 8
			DrawImage function5,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 9
			DrawImage function6,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 10
			DrawImage function7,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 11
			DrawImage yeswecan,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 12
			DrawImage teatime,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 13
			DrawImage spo,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 14
			DrawImage usa,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 15
			DrawImage napoleon,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 16
			DrawImage hitler,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 17
			DrawImage honecker,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 18
			DrawImage fight,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 19
			DrawImage dates,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 20
			DrawImage germany,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 21
			DrawImage sed,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 22
			DrawImage goethe,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 23
			DrawImage schiller,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 24
			DrawImage lessing,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 25
			DrawImage parataxis,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 26
			DrawImage blackboard,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 27
			DrawImage duden,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 28
			DrawImage bars,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 29
			DrawImage rings,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 30
			DrawImage badminton,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 31
			DrawImage football,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 32
			DrawImage run,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 33
			DrawImage wallbars,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 34
			DrawImage stand,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 35
			DrawImage winnersteps,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 36
			DrawImage globe,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 37
			DrawImage atlas,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 38
			DrawImage weather,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 39
			DrawImage friends,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 40
			DrawImage geyser,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 41
			DrawImage watercyclus,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 42
			DrawImage note,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 43
			DrawImage guitar,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 44
			DrawImage notepaper,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 45
			DrawImage loudspeaker,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 46
			DrawImage piano,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 47
			DrawImage conductor,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 48
			DrawImage buzz,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 49
			DrawImage clefs,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 50
			DrawImage burner,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 51
			DrawImage testglass,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 52
			DrawImage nh3,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 53
			DrawImage goggles,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 54
			DrawImage kettle,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 55
			DrawImage c4,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 56
			DrawImage playray,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 57
			DrawImage joystick,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 58
			DrawImage pc_back,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 59
			DrawImage www,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 60
			DrawImage google,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 61
			DrawImage printer,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 62
			DrawImage abihelp,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 63
			DrawImage schillershead,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 64
			DrawImage mephisto,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 65
			DrawImage calculator,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 66
			DrawImage infinite,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 67
			DrawImage henning,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 68
			DrawImage dictionary,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 69
			DrawImage bratwurst,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 70
			DrawImage holyshit,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 71
			DrawImage electricapple,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 72
			DrawImage acid,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 73
			DrawImage pse,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 74
			DrawImage asia,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 75
			DrawImage europe,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 76
			DrawImage northamerica,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 77
			DrawImage southamerica,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 78
			DrawImage australia,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 79
			DrawImage africa,((newitem\school_x)-movx),((newitem\school_y)-movy)
		Case 80
			DrawImage antarctica,((newitem\school_x)-movx),((newitem\school_y)-movy)
		End Select
	Next
End Function 


Function SchoolItemsCollision()
	If tut = 0 Then
	For newitem.school = Each School
		Select (newitem\school_sort)
		Case 1
		If ImagesCollide(root,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 1
			creditPoints = creditPoints + 3
			PlaySound itemCollect
			Delete newitem.school 
		EndIf 
		Case 2
		If ImagesCollide(urn,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 2
			creditPoints = creditPoints + 4
			PlaySound itemCollect
			Delete newitem.school 
		EndIf
		Case 3
		If ImagesCollide(function0,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 3
			creditPoints = creditPoints + 5
			PlaySound itemCollect
			Delete newitem.school 
		EndIf
		Case 4
		If ImagesCollide(function1,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 4
			creditPoints = creditPoints + 7
			PlaySound itemCollect
			Delete newitem.school 
		EndIf
		Case 5
		If ImagesCollide(function2,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 5
			creditPoints = creditPoints + 6
			PlaySound itemCollect
			Delete newitem.school 
		EndIf
		Case 6
			If ImagesCollide(function3,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 6
			creditPoints = creditPoints + 8
			PlaySound itemCollect
			Delete newitem.school 
		EndIf
		Case 7
			If ImagesCollide(function4,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 7
			creditPoints = creditPoints + 9
			PlaySound itemCollect
			Delete newitem.school 
		EndIf
		Case 8
			If ImagesCollide(function5,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 8
			creditPoints = creditPoints + 10
			PlaySound itemCollect
			Delete newitem.school 
			EndIf
		Case 9
		If ImagesCollide(function6,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 9
			creditPoints = creditPoints + 12
			PlaySound itemCollect
			Delete newitem.school 
		EndIf
		Case 10
			If ImagesCollide(function7,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 10
			creditPoints = creditPoints + 15
			PlaySound itemCollect
			Delete newitem.school 
		EndIf
		Case 11
		If ImagesCollide(yeswecan,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 11
			creditPoints = creditPoints + 4
			PlaySound itemCollect
			Delete newitem.school
		EndIf 
		Case 12
		If ImagesCollide(teatime,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 12
			creditPoints = creditPoints + 6
			PlaySound itemCollect
			Delete newitem.school
		EndIf 
		Case 13
		If ImagesCollide(spo,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 13
			creditPoints = creditPoints + 9
			PlaySound itemCollect
			Delete newitem.school
		EndIf 
		Case 14
		If ImagesCollide(usa,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 14
			creditPoints = creditPoints + 11
			PlaySound itemCollect
			Delete newitem.school
		EndIf 
		Case 15
		If ImagesCollide(napoleon,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 15
			creditPoints = creditPoints + 4
			PlaySound itemCollect
			Delete newitem.school
		EndIf 
		Case 16
		If ImagesCollide(hitler,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 16
			creditPoints = creditPoints + 4
			PlaySound itemCollect
			Delete newitem.school
		EndIf 
		Case 17
		If ImagesCollide(honecker,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 17
			creditPoints = creditPoints + 4
			PlaySound itemCollect
			Delete newitem.school
		EndIf 
		Case 18
		If ImagesCollide(fight,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 18
			creditPoints = creditPoints + 7
			PlaySound itemCollect
			Delete newitem.school
		EndIf 
		Case 19
		If ImagesCollide(dates,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 19
			creditPoints = creditPoints + 9
			PlaySound itemCollect
			Delete newitem.school
		EndIf 
		Case 20
		If ImagesCollide(germany,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 20
			creditPoints = creditPoints + 13
			PlaySound itemCollect
			Delete newitem.school
		EndIf 
		Case 21
		If ImagesCollide(sed,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 21
			creditPoints = creditPoints + 8
			PlaySound itemCollect
			Delete newitem.school
		EndIf 
		Case 22
		If ImagesCollide(goethe,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 22
			creditPoints = creditPoints + 3
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 23
		If ImagesCollide(schiller,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 23
			creditPoints = creditPoints + 5
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 24
		If ImagesCollide(lessing,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 24
			creditPoints = creditPoints + 6
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 25
		If ImagesCollide(parataxis,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 25
			creditPoints = creditPoints + 8
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 26
			If ImagesCollide(blackboard,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 26
			creditPoints = creditPoints + 16
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 27
			If ImagesCollide(duden,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 27
			creditPoints = creditPoints + 9
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 28
		If ImagesCollide(bars,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 28
			creditPoints = creditPoints + 5
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 29
		If ImagesCollide(rings,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 29
			creditPoints = creditPoints + 5
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 30
		If ImagesCollide(badminton,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 30
			creditPoints = creditPoints + 8
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 31
		If ImagesCollide(football,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 31
			creditPoints = creditPoints + 10
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 32
		If ImagesCollide(run,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 32
			creditPoints = creditPoints + 11
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 33
		If ImagesCollide(wallbars,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 33
			creditPoints = creditPoints + 15
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 34
		If ImagesCollide(stand,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 34
			creditPoints = creditPoints + 13
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 35
		If ImagesCollide(winnersteps,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 35
			creditPoints = creditPoints + 9
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 36
		If ImagesCollide(globe,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 36
			creditPoints = creditPoints + 6
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 37
		If ImagesCollide(atlas,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 37
			creditPoints = creditPoints + 9
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 38
		If ImagesCollide(weather,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 38
			creditPoints = creditPoints + 14
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 39
		If ImagesCollide(friends,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 39
			creditPoints = creditPoints + 20
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 40
		If ImagesCollide(geyser,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 40
			creditPoints = creditPoints + 11
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 41
		If ImagesCollide(watercyclus,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 41
			creditPoints = creditPoints + 12
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 42
		If ImagesCollide(note,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 42
			creditPoints = creditPoints + 4
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 43
		If ImagesCollide(guitar,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 43
			creditPoints = creditPoints + 7
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 44
		If ImagesCollide(notepaper,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 44
			creditPoints = creditPoints + 8
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 45
		If ImagesCollide(loudspeaker,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 45
			creditPoints = creditPoints + 11
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 46
		If ImagesCollide(piano,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 46
			creditPoints = creditPoints + 10
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 47
		If ImagesCollide(conductor,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 47
			creditPoints = creditPoints + 12
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 48
		If ImagesCollide(buzz,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 48
			creditPoints = creditPoints + 9
			PlaySound itemCollect
			Delete newitem.school
		EndIf	
		Case 49
		If ImagesCollide(clefs,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 49
			creditPoints = creditPoints + 14
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 50
		If ImagesCollide(testglass,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 50
			creditPoints = creditPoints + 9
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 51
		If ImagesCollide(burner,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 51
			creditPoints = creditPoints + 4
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 52
		If ImagesCollide(nh3,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 52
			creditPoints = creditPoints + 12
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 53
		If ImagesCollide(goggles,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 53
			creditPoints = creditPoints + 10
			PlaySound itemCollect
			Delete newitem.school
			EndIf
		Case 54
		If ImagesCollide(kettle,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 54
			creditPoints = creditPoints + 14
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 55
		If ImagesCollide(c4,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 55
			creditPoints = creditPoints + 7
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 56
			If ImagesCollide(playray,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 56
			creditPoints = creditPoints + 13
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 57
		If ImagesCollide(joystick,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 57
			creditPoints = creditPoints + 7
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 58
		If ImagesCollide(pc_back,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 58
			creditPoints = creditPoints + 8
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 59
		If ImagesCollide(www,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 59
			creditPoints = creditPoints + 7
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 60
		If ImagesCollide(google,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 60
			creditPoints = creditPoints + 10
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 61
		If ImagesCollide(printer,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 61
			creditPoints = creditPoints + 13
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 62
		If ImagesCollide(abihelp,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 62
			creditPoints = creditPoints + 30
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 63
		If ImagesCollide(schillershead,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 63
			creditPoints = creditPoints + 30
			PlaySound itemCollect
			Delete newitem.school
		EndIf	
		Case 64
		If ImagesCollide(mephisto,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 64
			creditPoints = creditPoints + 30
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 65
		If ImagesCollide(dictionary,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 65
			creditPoints = creditPoints + 30
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 66
		If ImagesCollide(bratwurst,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 66
			creditPoints = creditPoints + 30
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 67
		If ImagesCollide(holyshit,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 67
			creditPoints = creditPoints + 30
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 68
		If ImagesCollide(calculator,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 68
			creditPoints = creditPoints + 30
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 69
		If ImagesCollide(infinite,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 69
			creditPoints = creditPoints + 30
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 70
		If ImagesCollide(henning,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 70
			creditPoints = creditPoints + 30
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 71
		If ImagesCollide(electricapple,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 71
			creditPoints = creditPoints + 30
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 72
		If ImagesCollide(acid,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 72
			creditPoints = creditPoints + 30
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 73
		If ImagesCollide(pse,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 73
			creditPoints = creditPoints + 30
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 74
		If ImagesCollide(asia,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 74
			creditPoints = creditPoints + 10
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 75
		If ImagesCollide(europe,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 75
			creditPoints = creditPoints + 10
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 76
		If ImagesCollide(northamerica,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 76
			creditPoints = creditPoints + 10
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 77
		If ImagesCollide(southamerica,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 77
			creditPoints = creditPoints + 10
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 78
		If ImagesCollide(australia,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 78
			creditPoints = creditPoints + 10
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 79
		If ImagesCollide(africa,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 79
			creditPoints = creditPoints + 10
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 80
		If ImagesCollide(antarctica,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
			message = 80
			creditPoints = creditPoints + 10
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		End Select
	Next
	EndIf 
End Function


Function DrawLessEnergyItems()
	For new_less_energy_object.less_energys = Each less_energys
		Select (new_less_energy_object\less_en_sort)
		; 1=Toilet, 2=Food, 3=Ashtray
		Case 1
		DrawImage Toilet,((new_less_energy_object\less_en_x)-Movx),((new_less_energy_object\less_en_y)-Movy)
		Case 2
		DrawImage Food,((new_less_energy_object\less_en_x)-Movx),((new_less_energy_object\less_en_y)-Movy)
		Case 3
		DrawImage Ashtray,((new_less_energy_object\less_en_x)-Movx),((new_less_energy_object\less_en_y)-Movy)
		End Select
	Next
End Function 


Function LessEnergyItemsCollision()
If Tut = 0 Then
If (MilliSecs()-PauseTime > TimeValue) Then
For new_less_energy_object.less_energys = Each less_energys
	Select (new_less_energy_object\less_en_sort)
	Case 1
		If ImagesCollide(Toilet,((new_less_energy_object\less_en_x)-Movx),((new_less_energy_object\less_en_y)-Movy),0,Player,Player_posx,Player_posy,0) Then
		Player_Energy = Player_Energy - 10
		Delete new_less_energy_object.less_energys
		EndIf 
	Case 2
		If ImagesCollide(food,((new_less_energy_object\less_en_x)-movx),((new_less_energy_object\less_en_y)-movy),0,player,player_posx,player_posy,0) Then
		player_Energy = player_Energy - 15
		Delete new_less_energy_object.less_energys
		EndIf 
	Case 3
		If ImagesCollide(ashtray,((new_less_energy_object\less_en_x)-movx),((new_less_energy_object\less_en_y)-movy),0,player,player_posx,player_posy,0) Then
		player_Energy = player_Energy - 20
		Delete new_less_energy_object.less_energys
		EndIf
	End Select
Next
EndIf 
EndIf 
End Function 

;drawing the monsters
Function DrawMonsters()
	For new_monster.Monster = Each Monster
	
		If new_monster\Monster_type = 1 Then
			DrawImage monster_Lazy, (new_monster\Pos_x)-movx, (new_monster\Pos_y)-movy, new_monster\Frame
		ElseIf new_monster\Monster_type = 2 Then
			DrawImage monster_Naughty, (new_monster\Pos_x)-movx, (new_monster\Pos_y)-movy, new_monster\Frame
		ElseIf new_monster\Monster_type = 3 Then
			DrawImage monster_Zero, (new_monster\Pos_x)-movx, (new_monster\Pos_y)-movy, new_monster\Frame
		ElseIf new_monster\Monster_type = 4 Then
			DrawImage monster_Honk, (new_monster\Pos_x)-movx, (new_monster\Pos_y)-movy, new_monster\Frame
		EndIf
		
	Next 	
End Function 


Function MoveMonsters()
If moveAny = 1 Then
If (MilliSecs()-pauseTime > timeValue)

	For new_monster.Monster = Each Monster
		If new_monster\Monster_type = 1 Then 
			If new_monster\Direction = 1 Then
			
			If (new_monster\Pos_x - new_monster\Start_x <= 80) Then
				
				new_monster\Pos_x = new_monster\Pos_x + 2
				If new_monster\Frame >3 Then new_monster\Frame = 0
				new_monster\Anim_counter = new_monster\Anim_counter -1
				If new_monster\Anim_counter = 0 Then
					new_monster\Anim_counter = 8
					new_monster\Frame = new_monster\Frame +1
					If new_monster\Frame = 4 Then new_monster\Frame = 0
				EndIf 
				EndIf 
			
			If (new_monster\Pos_x - new_monster\Start_x > 80) Then new_monster\Direction = 0 ; change left
			
			ElseIf new_monster\Direction = 0 Then
				
				If (new_monster\Pos_x - new_monster\Start_x >= -80) Then 

				new_monster\Pos_x = new_monster\Pos_x - 2
				If new_monster\Frame >3 Then new_monster\Frame = 0
				new_monster\Anim_counter = new_monster\Anim_counter -1
				If new_monster\Anim_counter = 0 Then
					new_monster\Anim_counter = 8
					new_monster\Frame = new_monster\Frame +1
					If new_monster\Frame > 3 Then new_monster\Frame = 0
				EndIf 
				EndIf
				
				If (new_monster\Pos_x - new_monster\Start_x < -80) Then new_monster\Direction = 1 ; change right
				EndIf 	
	
		ElseIf new_monster\Monster_type = 2 Then
			If new_monster\Direction = 1 Then

			If (new_monster\Pos_x - new_monster\Start_x <= 70) Then
	
				new_monster\Pos_x = new_monster\Pos_x + 2
				If new_monster\Frame >4 Then new_monster\Frame = 0
				new_monster\Anim_counter = new_monster\Anim_counter -1
				If new_monster\Anim_counter = 0 Then
					new_monster\Anim_counter = 8
					new_monster\Frame = new_monster\Frame +1
					If new_monster\Frame > 4 Then new_monster\Frame = 0
				EndIf 
				EndIf 
				
			If (new_monster\Pos_x - new_monster\Start_x > 70) Then new_monster\Direction = 0 ; change left
			
			ElseIf new_monster\Direction = 0 Then

			If (new_monster\Pos_x - new_monster\Start_x >= -70) Then

				new_monster\Pos_x = new_monster\Pos_x - 2
				If new_monster\Frame >8 Then new_monster\Frame = 5
				new_monster\Anim_counter = new_monster\Anim_counter -1
				If new_monster\Anim_counter = 0 Then
					new_monster\Anim_counter = 8
					new_monster\Frame = new_monster\Frame +1
					If new_monster\Frame > 8 Then new_monster\Frame = 5
				EndIf 
				EndIf
				
				If (new_monster\Pos_x - new_monster\Start_x < -70) Then new_monster\Direction = 1 ; change right
				
			EndIf
		
		ElseIf new_monster\Monster_type = 3 Then
			If new_monster\Direction = 1 Then

			If (new_monster\Pos_x - new_monster\Start_x <= 70) Then
	
				new_monster\Pos_x = new_monster\Pos_x + 2
				If new_monster\Frame >3 Then new_monster\Frame = 0
				new_monster\Anim_counter = new_monster\Anim_counter -1
				If new_monster\Anim_counter = 0 Then
					new_monster\Anim_counter = 8
					new_monster\Frame = new_monster\Frame +1
					If new_monster\Frame > 3 Then new_monster\Frame = 0
				EndIf 
				EndIf 
				
			If (new_monster\Pos_x - new_monster\Start_x > 70) Then new_monster\Direction = 0 ; change left
			
			
			ElseIf new_monster\Direction = 0 Then

			If (new_monster\Pos_x - new_monster\Start_x >= -70) Then

				new_monster\Pos_x = new_monster\Pos_x - 2
				If new_monster\Frame >3 Then new_monster\Frame = 0
				new_monster\Anim_counter = new_monster\Anim_counter -1
				If new_monster\Anim_counter = 0 Then
					new_monster\Anim_counter = 8
					new_monster\Frame = new_monster\Frame +1
					If new_monster\Frame > 3 Then new_monster\Frame = 0
				EndIf 
				EndIf
				
				If (new_monster\Pos_x - new_monster\Start_x < -70) Then new_monster\Direction = 1 ; change right
				
			EndIf
		
		ElseIf new_monster\Monster_type = 4 Then
			If new_monster\Direction = 1 Then

			If (new_monster\Pos_x - new_monster\Start_x <= 70) Then
	
				new_monster\Pos_x = new_monster\Pos_x + Rnd(1,6)
				If new_monster\Frame >2 Then new_monster\Frame = 0
				new_monster\Anim_counter = new_monster\Anim_counter -1
				If new_monster\Anim_counter = 0 Then
					new_monster\Anim_counter = 8
					new_monster\Frame = new_monster\Frame +1
					If new_monster\Frame > 2 Then new_monster\Frame = 0
				EndIf 
				EndIf 
				
			If (new_monster\Pos_x - new_monster\Start_x > 70) Then new_monster\Direction = 0 ; change left
			
			
			ElseIf new_monster\Direction = 0 Then

			If (new_monster\Pos_x - new_monster\Start_x >= -70) Then

				new_monster\Pos_x = new_monster\Pos_x - Rnd(1,6)
				If new_monster\Frame >5 Then new_monster\Frame = 3
				new_monster\Anim_counter = new_monster\Anim_counter -1
				If new_monster\Anim_counter = 0 Then
					new_monster\Anim_counter = 8
					new_monster\Frame = new_monster\Frame +1
					If new_monster\Frame > 5 Then new_monster\Frame = 3
				EndIf 
				EndIf
				
				If (new_monster\Pos_x - new_monster\Start_x < -70) Then new_monster\Direction = 1 ; change right
				
			EndIf
		EndIf  
		Next
EndIf 
EndIf 

End Function 

Function ChooseLevel()
Select Level
	Case 1
	If Start = 0 Then
	Start = 1
	Level_Tutorial()
	EndIf 
	Case 2
	If Start = 1 Then
	Start = 0
	Level_1()
	ResumeChannel backGround
	ClsColor Rnd(0,255),Rnd(0,255),Rnd(0,255)
	EndIf 
	Case 3
	If Start = 0 Then
	Start = 1
	Level_2()
	ResumeChannel backGround
	ClsColor Rnd(0,255),Rnd(0,255),Rnd(0,255)
	EndIf 
	Case 4
	If Start = 1 Then
	Start = 0
	Level_3()
	ResumeChannel backGround
	ClsColor Rnd(0,255),Rnd(0,255),Rnd(0,255)
	EndIf
	Case 5
	If Start = 0 Then
	Start = 1
	Level_4()
	ResumeChannel backGround
	ClsColor Rnd(0,255),Rnd(0,255),Rnd(0,255)
	EndIf 
	Case 6
	If Start = 1 Then
	Start = 0
	ClsColor Rnd(0,255),Rnd(0,255),Rnd(0,255)
	Level_Tutorial()
	moveAny = 0
	player_move = 0
	doDrawPlayer = 0
	EndIf 
	TextAbitur()
	Case 7
	If Start = 0 Then
	Start = 1
	Level_Abi1()
	ResumeChannel backGround
	ClsColor Rnd(0,255),Rnd(0,255),Rnd(0,255)
	EndIf
	Case 8
	If Start = 1 Then
	Start = 0
	lives = 3 ; three tries to finish the level
	Level_Abi2()
	ResumeChannel backGround
	ClsColor Rnd(0,255),Rnd(0,255),Rnd(0,255)
	EndIf 
	Default 
	If Start = 0 Then
	Start = 1
	ClsColor Rnd(0,255),Rnd(0,255),Rnd(0,255)
	Level_Tutorial()
	moveAny = 0
	player_move = 0
	doDrawPlayer = 0
	EndIf 
	ShowAbi() 
End Select

;another important thing: if energy <= 0 then start last level again
	If player_Energy <= 0 Or KeyHit(68) Then
	If Start = 1 Then
	Start = 0
	PlaySound levelAgain
		If GivePos = 0 Then
		GivePos = 1
		Select Level
			Case 2
			movx = Movx_Lvl1
			movy = Movy_Lvl1
			Case 3
			movx = MOVX_LVL2
			movy = Movy_Lvl2
			Case 4
			Movx = Movx_Lvl3
			Movy = Movy_Lvl3
			Case 5
			Movx = Movx_Lvl4
			Movy = Movy_Lvl4
			Case 6
			Movx = Movx_Lvl5
			Movy = Movy_Lvl5
			Case 7
			Movx = Movx_Lvl6
			Movy = Movy_Lvl6
			Case 8
			Movx = Movx_Lvl7
			Movy = Movy_Lvl7
		End Select 
		Delay 1000
		Player_energy = 100
		lives = lives - 1 
		ElseIf GivePos = 1 Then
			GivePos = 0
			Select Level
			Case 2
			Movx = Movx_Lvl1
			Movy = Movy_Lvl1
			Case 3
			Movx = Movx_Lvl2
			Movy = Movy_Lvl2
			Case 4
			Movx = Movx_Lvl3
			Movy = Movy_Lvl3
			Case 5
			Movx = Movx_Lvl4
			movy = Movy_Lvl4
			Case 6
			movx = Movx_Lvl5
			movy = Movy_Lvl5
			Case 7
			movx = Movx_Lvl6
			movy = Movy_Lvl6
			Case 8
			movx = Movx_Lvl7
			movy = Movy_Lvl7
		End Select 
		Delay 1000
		player_Energy = 100
		lives = lives - 1
		EndIf 
	ElseIf start = 0 Then
		start = 1
		If GivePos = 0 Then
		GivePos = 1
		Select level
			Case 2
			movx = MOVX_LVL1
			movy = Movy_Lvl1
			Case 3
			movx = MOVX_LVL2
			movy = Movy_Lvl2
			Case 4
			movx = MOVX_LVL3
			movy = Movy_Lvl3
			Case 5
			movx = MOVX_LVL4
			movy = Movy_Lvl4
			Case 6
			movx = Movx_Lvl5
			movy = Movy_Lvl5
			Case 7
			movx = Movx_Lvl6
			movy = Movy_Lvl6
			Case 8
			movx = Movx_Lvl7
			movy = Movy_Lvl7
		End Select 
		Delay 1000
		player_Energy = 100
		lives = lives - 1 
		ElseIf GivePos = 1 Then
		GivePos = 0
		Select level
			Case 2
			movx = MOVX_LVL1
			movy = Movy_Lvl1
			Case 3
			movx = MOVX_LVL2
			movy = Movy_Lvl2
			Case 4
			movx = MOVX_LVL3
			movy = Movy_Lvl3
			Case 5
			movx = MOVX_LVL4
			movy = Movy_Lvl4
			Case 6
			movx = Movx_Lvl5
			movy = Movy_Lvl5
			Case 7
			movx = Movx_Lvl6
			movy = Movy_Lvl6
			Case 8
			Movx = Movx_Lvl7
			Movy = Movy_Lvl7
		End Select 
		Delay 1000
		Player_energy = 100
		lives = lives - 1 
		EndIf 
	EndIf 
	EndIf   
	If lives <= 0 Then
		For newcoin.Coins = Each coins
			Delete newcoin.Coins
		Next
		For new_energy_object.energys = Each energys
		Delete New_energy_object.energys
		Next
		For newitem.school = Each school
		Delete newitem.school
		Next
		For new_less_energy_object.less_energys = Each less_energys
		Delete new_less_energy_object.less_energys
		Next
		For new_monster.Monster = Each Monster
		Delete new_monster.monster
		Next
		For new_teacher.teacher = Each teacher
		Delete new_teacher.teacher
		Next
		For new_sneak.sneak = Each sneak
		Delete new_sneak.sneak
		Next
		For new_pause.pause = Each pause
		Delete new_pause.pause
		Next 
		Level_Tutorial()
		Text_var = 0
		Movx = 5400
		Movy = 480
		Text 200,200,"Du bist zu oft sitzen geblieben. Jetzt musst du leider wieder von vorne anfangen."
		Text 200,215,"Bitte [Enter] drücken..."
			If KeyHit(28) Then
			Movx = (-288)
			Movy = 480
			Level = 1
			lives = 10
		EndIf
	EndIf
End Function


Function MonsterCollision()
If MoveAny = 1 Then 
If (MilliSecs()-PauseTime > TimeValue) Then; if player didnt collect a pause

For new_monster.monster = Each monster
	If new_monster\monster_type = 1 Then
	If ImagesCollide(monster_lazy,(new_monster\pos_x)-Movx,(New_monster\pos_y)-Movy,0,Player,Player_posx,Player_posy,0) Then
		Player_energy = Player_energy - 15
		Delete new_monster.monster
	EndIf 
	ElseIf new_monster\monster_type = 2 Then
	If ImagesCollide(Monster_Naughty,(new_monster\pos_x)-Movx,(new_monster\pos_y)-Movy,0,Player,Player_posx,Player_posy,0) Then
		CreditPoints = CreditPoints - 15
		Delete new_monster.monster
	EndIf 
	ElseIf new_monster\monster_type = 3 Then
	If ImagesCollide(Monster_Zero,(new_monster\pos_x)-Movx,(new_monster\pos_y)-Movy,0,Player,Player_posx,Player_posy,0) Then
		Player_energy = Player_energy - 25
		Delete new_monster.monster
	EndIf 
	ElseIf new_monster\monster_type = 4 Then 
	If ImagesCollide(Monster_Honk,(new_monster\pos_x)-Movx,(new_monster\pos_y)-Movy,0,PLayer,Player_posx,Player_posy,0) Then
		Player_energy = Player_energy - 30
		CreditPoints = CreditPoints - Rnd(10,30)
		Delete new_monster.monster
	EndIf 
	EndIf 
Next

EndIf
EndIf  
End Function 


Function DrawTeacher()
	For new_teacher.teacher = Each teacher
		DrawImage Teacher,(new_teacher\pos_x)-Movx,(new_teacher\pos_y)-Movy,new_teacher\frame
	Next
End Function 


Function MoveTeacher()
If MoveAny <> 0

	For new_teacher.teacher = Each teacher
		
		If new_teacher\direction = 1 Then 
	
		If New_teacher\pos_x - New_teacher\Start_x <= 80 Then
			
				new_teacher\Pos_x = new_teacher\Pos_x +2
				If new_teacher\Frame >3 Then new_teacher\Frame = 0
				new_teacher\Anim_counter = new_teacher\Anim_counter -1
				If new_teacher\Anim_counter = 0 Then
					new_teacher\Anim_counter = 6
					new_teacher\Frame = new_teacher\Frame +1
					If new_teacher\Frame = 3 Then new_teacher\Frame = 0
				EndIf
		EndIf  	
			If new_teacher\pos_x - new_teacher\start_x > 80 Then new_teacher\direction = 0

		ElseIf new_teacher\direction = 0 Then 

			If New_teacher\pos_x - new_teacher\start_x >= -80 Then
			
				new_teacher\Pos_x = new_teacher\Pos_x -2
				If new_teacher\Frame <3 Then new_teacher\Frame = 3
				new_teacher\Anim_counter = new_teacher\Anim_counter -1
				If new_teacher\Anim_counter = 0 Then
					new_teacher\Anim_counter = 6
					new_teacher\Frame = new_teacher\Frame +1
					If new_teacher\Frame > 5 Then new_teacher\Frame = 3
				EndIf 
				EndIf 
			If New_teacher\pos_x - New_teacher\start_x < -80 Then new_teacher\direction = 1
		EndIf 			
		
	Next
	
EndIf 
End Function 


Function TeacherTrade()
If DoTrade = 1 Then ;just after the first messages

	If score >= 15 Then	;if player has enough money to deal
		
		For new_teacher.teacher = Each teacher
		If ImagesCollide(Teacher,((new_teacher\pos_x)-Movx),((new_teacher\pos_y)-Movy),0,Player,Player_posx,Player_posy,0) Then
		MoveAny = 0
		Player_Move = 0
		JumpAllow = 0
		
		Select NextStep
		
			Case 0		
				point = (score - (score Mod 15))/15	;e.g. you have 43 coins, so you can get 8 points, 3 left
				Text 0,15,"Du kannst dein Punktekonto um "+point+" Punkte auffüllen, wenn du willst."
				If KeyHit(28) Then NextStep = NextStep +1
				
				
			Case 1
				Locate 0,30
				choice$ = Trim$(Input$("Wenn du einverstanden bist, gib 'ja' ein, ansonsten 'nein'. (Bitte KLEIN schreiben!)"))
				;WaitKey
				If KeyHit(28) And choice >= 0 Then
				NextStep = NextStep +1
				EndIf 
				 
				 		
			Case 2	
				If Trim$(choice$) = "ja" Then
				Text 0,15,"Du hast "+point+" Punkte hinzubekommen. - Ich muss jetzt mal verschwinden, sonst... ähm egal, also tschüss!"
				
				If KeyHit(28) Then
				Delete new_teacher
				Text_var = Text_var +1 ;this is only for the tutorial
				MoveAny = 1
				Player_Move = 1
				NextStep = 0			;reset for next time :)
				score = score - (point*10)
				CreditPoints = CreditPoints+point
				JumpAllow = 1
				Exit
				EndIf 
				
				ElseIf Trim$(choice$) = "nein" Then
				Text 0,15,"Na gut, dann eben nicht. Ich muss jetzt weg, äh... ins Lehrerzimmer."

				If KeyHit(28) Then
				Delete new_teacher
				Text_var = Text_var +1
				MoveAny = 1
				Player_Move = 1
				NextStep = 0
				JumpAllow = 1
				Exit 
				EndIf
				
				ElseIf Trim$(choice$) <> "ja" Or "nein" Then
				Text 0,15,"Was soll denn '"+choice+"' sein? Du hast dich wohl verschrieben. Ich gehe jetzt. Überleg' dir deine Antwort nächstens besser!"

				If KeyHit(28) Then
				text_var = text_var +1
				moveAny = 1
				player_move = 1
				nextStep = 0
				jumpAllow = 1
				Delete new_teacher
				Exit
				EndIf 
				EndIf 
		
		End Select 
		
		EndIf
		Next			
	
	
	ElseIf score < 15 Then

	For new_teacher.teacher = Each Teacher
	If ImagesCollide(teacher,((new_teacher\pos_x)-movx),((new_teacher\pos_y)-movy),0,player,player_posx,player_posy,0) Then
	
	Text 0,0,"Tut mir Leid, aber du hast nicht genug Geld, um mit mir zu handeln. Ich muss jetzt weg -äh... ins Lehrerzimmer."
	Text 0,15,"Bitte Enter drücken."
	
	If KeyHit(28) Then
	Delete new_teacher
	text_var = text_var +1
	moveAny = 1
	Exit
	EndIf
	
	EndIf
	Next 
			
	EndIf		
			
EndIf			
End Function 


Function DrawSneak()
	For new_sneak.sneak = Each Sneak
		DrawImage sneak,((new_sneak\pos_x)-movx),((new_sneak\pos_y)-movy),new_sneak\frame
	Next
End Function


Function MoveSneak()
If moveAny <> 0

	For new_sneak.sneak = Each Sneak
		
		If New_sneak\direction = 1 Then 

		If (new_sneak\pos_x - new_sneak\start_x <= 80) Then
			
				new_sneak\Pos_x = new_sneak\Pos_x +2
				If new_sneak\Frame >3 Then new_sneak\Frame = 0
				new_sneak\Anim_counter = new_sneak\Anim_counter -1
				If new_sneak\Anim_counter = 0 Then
					new_sneak\Anim_counter = 6
					new_sneak\Frame = new_sneak\Frame +1
					If new_sneak\Frame = 3 Then new_sneak\Frame = 0
				EndIf
		EndIf  
				
			If (new_sneak\pos_x - New_sneak\start_x) > 80 Then new_sneak\direction = 0

		ElseIf new_sneak\direction = 0 Then 

		If (new_sneak\pos_x - new_sneak\start_x >= -80) Then
			
				new_sneak\Pos_x = new_sneak\Pos_x -2
				If new_sneak\Frame <3 Then new_sneak\Frame = 3
				new_sneak\Anim_counter = new_sneak\Anim_counter -1
				If new_sneak\Anim_counter = 0 Then
					new_sneak\Anim_counter = 6
					new_sneak\Frame = new_sneak\Frame +1
					If new_sneak\Frame > 5 Then new_sneak\Frame = 3
				EndIf 
				EndIf 
				If (new_sneak\pos_x - new_sneak\start_x < -80) Then new_sneak\direction = 1
				EndIf 			
		
	Next
	
EndIf
End Function 


Function SneakTrade()
If DoTrade = 1 Then

;attention: The sneak doesnt care if the player hay enough coins or not		
		For new_sneak.sneak = Each sneak
		If ImagesCollide(Sneak,((new_sneak\pos_x)-Movx),((new_sneak\pos_y)-Movy),0,Player,Player_posx,Player_posy,0) Then
		MoveAny = 0
		Player_Move = 0
		JumpAllow = 0
		
			Select NextStep ;as in the text_var-funct., the steps are requested after each other
			
			Case 0 ;standard
				point = 20; he always tells you that you get 20 poins!
				Text 0,15,"Du kannst dein Punktekonto um "+point+" Punkte auffüllen, wenn du willst."
				If KeyHit(28) Then NextStep = NextStep +1
				
			Case 1
				Locate 0,30
				choice$ = Trim$(Input$("Wenn du einverstanden bist, gib 'ja' oder was anderes ein, ansonsten 'nein'. (Bitte KLEIN schreiben!)"))
				
				If KeyHit(28) And choice >= 0 Then
				NextStep = NextStep +1
				EndIf 
				
			Case 2
			
			If Trim$(choice$) <> "nein" Then
			Text 0,15,"Herr Schulleiter, Herr Schulleiter!! Ich hab einen Schüler gefunden, der mich bestechen wollte!"
			Color 255,0,0
			Text 0,30,"Für diesen Betrugsversuch werden dir 15 Punkte abgezogen. Außerdem verlierst du dein ganzes Geld."
			Color 128,255,128
			Text 0,45,"Tja, Pech gehabt! Bitte Enter drücken."
			
			If KeyHit(28) Then
			score = 0
			CreditPoints = CreditPoints - 15
			Text_var = Text_var +1
			MoveAny = 1
			Player_Move = 1
			NextStep = 0
			JumpAllow = 1
			Delete new_sneak
			Exit
			EndIf
			
			ElseIf Trim$(choice$) = "nein" Then
			Text 0,15,"Och menno, du hast mich schon wieder durchschaut. Aber warte - nächstes Mal krieg ich dich!"
			
			If KeyHit(28) Then
			Text_var = Text_var +1
			MoveAny = 1
			Player_Move = 1
			NextStep = 0
			JumpAllow = 1
			Delete new_sneak
			Exit
			EndIf 
			EndIf 
			
			End Select  
			
		EndIf
		Next
		
EndIf 				
End Function 


Function DrawPause()
	For newpause.pause = Each pause
		If newpause\sort = 1 Then
			DrawImage Eighthpause,(newpause\pos_x)-Movx,(newpause\pos_y)-Movy
		ElseIf newpause\sort = 2 Then
			DrawImage Quarterpause,(newpause\pos_x)-Movx,(newpause\pos_y)-Movy
		EndIf
	Next	
End Function 
 

Function PauseCollision()	
	For newpause.pause = Each pause
		If ImagesCollide(Eighthpause,(newpause\pos_x)-Movx,(newpause\pos_y)-Movy,0,Player,Player_posx,Player_posy,0) Then
			Delete newpause.pause
			PauseTime = MilliSecs()
			TimeValue = 7500
		ElseIf ImagesCollide(Quarterpause,(newpause\pos_x)-Movx,(newpause\pos_y)-Movy,0,Player,Player_posx,Player_posy,0) Then
			Delete newpause.pause
			PauseTime = MilliSecs()
			TimeValue = 15000
		EndIf 
	Next 
End Function


Function PlayerShoot()
If MoveAny <> 0 Then
If ShootAble = 1 Then 

	If KeyHit(157) Then ; if ctrl-right is hit ==> change back to KeyDown!!
	PlaySound ThrowBook
		ShootAble = 0
		ShootTime = MilliSecs()

	If MovingRight = 1 Then 
		newbookright.ShootRight = New shootRight
		newbookright.shootRight\shoot_x = ((Player_posx)+Movx)+10
		newbookright.shootRight\shoot_y = ((Player_posy)+Movy)

	ElseIf MovingRight = 0 Then
		newbookleft.shootLeft = New shootLeft
		newbookleft.shootLeft\shoot_x = ((Player_posx)+Movx)-10
		newbookleft.shootLeft\shoot_y = ((Player_posy)+Movy)
	EndIf
	EndIf 
EndIf 
EndIf 
End Function 


Function DrawShoot()
If MoveAny <> 0 Then
	For newbookright.shootRight = Each shootRight
		DrawImage Book,(newbookright.shootRight\shoot_x)-Movx,(newbookright.shootRight\shoot_y)-Movy
		newbookright\shoot_x = newbookright\shoot_x + 9
	Next

	For newbookleft.ShootLeft = Each ShootLeft
		DrawImage Book,(newbookleft.ShootLeft\shoot_x)-Movx,(newbookleft.ShootLeft\shoot_y)-Movy
		newbookleft\shoot_x = newbookleft\shoot_x - 9
	Next 
EndIf 
End Function 


Function ShootCollision()
For new_monster.monster = Each monster
For newbookright.shootright = Each shootright
	If ImagesCollide(Book,((newbookright\shoot_x)-Movx),((newbookright\shoot_y)-Movy),0,Monster_Lazy,((new_monster\pos_x)-Movx),((new_monster\pos_y)-Movy),0) Then
		Delete new_monster.monster
		Delete newbookright.shootright
		PlaySound MonsterDie
		ShootAble = 1 
	ElseIf ImagesCollide(Book,((newbookright\shoot_x)-Movx),((newbookright\shoot_y)-Movy),0,Monster_Naughty,((new_monster\pos_x)-Movx),((new_monster\pos_y)-Movy),0) Then
		Delete new_monster.monster
		Delete newbookright.shootright
		PlaySound MonsterDie
		shootAble = 1
	ElseIf ImagesCollide(book,((newbookright\shoot_x)-movx),((newbookright\shoot_y)-movy),0,monster_Zero,((new_monster\Pos_x)-movx),((new_monster\Pos_y)-movy),0) Then
		Delete new_monster.Monster
		Delete newbookright.shootright
		PlaySound monsterDie
		shootAble = 1
	ElseIf ImagesCollide(book,((newbookright\shoot_x)-movx),((newbookright\shoot_y)-movy),0,monster_Honk,((new_monster\Pos_x)-movx),((new_monster\Pos_y)-movy),0) Then
		Delete new_monster.Monster
		Delete newbookright.shootright
		PlaySound monsterDie
		shootAble = 1
	EndIf
Next
Next

For new_monster.Monster = Each Monster
For newbookleft.shootleft = Each ShootLeft
	If ImagesCollide(book,((newbookleft\shoot_x)-movx),((newbookleft\shoot_y)-movy),0,monster_Lazy,((new_monster\Pos_x)-movx),((new_monster\Pos_y)-movy),0) Then
		Delete new_monster.Monster
		Delete newbookleft.shootleft
		PlaySound monsterDie
		shootAble = 1 
	ElseIf ImagesCollide(book,((newbookleft\shoot_x)-movx),((newbookleft\shoot_y)-movy),0,monster_Naughty,((new_monster\Pos_x)-movx),((new_monster\Pos_y)-movy),0) Then
		Delete new_monster.Monster
		Delete newbookleft.shootleft
		PlaySound monsterDie
		shootAble = 1
	ElseIf ImagesCollide(book,((newbookleft\shoot_x)-movx),((newbookleft\shoot_y)-movy),0,monster_Zero,((new_monster\Pos_x)-movx),((new_monster\Pos_y)-movy),0) Then
		Delete new_monster.Monster
		Delete newbookleft.shootleft
		PlaySound monsterDie
		shootAble = 1
	ElseIf ImagesCollide(book,((newbookleft\shoot_x)-movx),((newbookleft\shoot_y)-movy),0,monster_Honk,((new_monster\Pos_x)-movx),((new_monster\Pos_y)-movy),0) Then
		Delete new_monster.Monster
		Delete newbookleft.shootleft
		PlaySound monsterDie
		shootAble = 1
	EndIf
Next
Next

;if the book doesnt collide with any item, it will be deleted after 1,5 seconds!
For newbookright.shootright = Each ShootRight
	If (MilliSecs() - shootTime) > 1500 Then
	Delete newbookright.shootright
	shootAble = 1
	EndIf
Next

For newbookleft.shootleft = Each ShootLeft
	If (MilliSecs() - shootTime) > 1500 Then
	Delete newbookleft.shootleft
	shootAble = 1
	EndIf
Next
End Function 


Function PlayerJump()
If jumpAllow = 1 Then ; if player is not at the beginning of tutorial level 

	If KeyDown(57) Then
		
		If jump = False Then
			jump = True
			PlaySound jumpSound 
			Posy_temp = 18
		EndIf
	EndIf ; otherwise, it would keep the player in the air
	
		;in Case of collision
		If (ActualLevel((Player_posx+movx+12) /32,(Player_posy+Movy) /32)=1 Or ActualLevel((Player_posx+movx) /32,(Player_posy+Movy) /32)=1) And jump = True Then
			Jump = True
			Posy_temp = 0 
		EndIf 

		
		
		If Jump = True Then
			Posy_temp = Posy_temp - 1
			Movy = Movy - Posy_temp
		EndIf
		
		If Posy_temp <= 0 Then
			If ActualLevel((Player_posx+Movx+12) /32,(Player_posy+Movy+32) /32) = 1 Or ActualLevel((Player_posx+Movx+20) /32,(Player_posy+Movy+32) /32) = 1 Then 
				Jump = False
				temp_y = Movy /32	;\
				Movy = temp_y *32	;/ sets the exact position of Player if he stands in a tile
			EndIf
		EndIf
		
		
		If Jump = False Then
			If ActualLevel((Player_posx+Movx+12) /32,(Player_posy+Movy+32) /32) = 0 Then	;if there is no brick above him
				Jump = True
				Posy_temp = 0
			EndIf 
		EndIf 
		
		If Movy < -416 Then
			Movy = -416
			Jump=True
			Posy_temp = 0
		EndIf
		
		If Movy >= 480 Then 
			Movy = 480		; the max. value of Movy must be set!
			jump = False
		EndIf
		
		EndIf 
End Function 
						

Function Level_Tutorial()

;restore the bricks
Restore BrickLevelTutorial
	For bricky = 0 To 24
		For brickx = 0 To 181
			Read ActualLevel(brickx,bricky)
		Next
	Next

;restore the monsters
Restore MonsterLevelTutorial 
	Read number
	For mi = 1 To number
		new_monster.Monster = New Monster
		Read Monstertype, x, y, direction,anim_counter,frame,start_x,m_en
		new_monster\Monster_type = Monstertype
		new_monster\Pos_x = x
		new_monster\Pos_y = y
		new_monster\direction = direction
		new_monster\Anim_counter = anim_counter
		new_monster\Frame = frame
		new_monster\start_x = start_x
		new_monster\m_energy = m_en
	Next 		


;restore the teachers
Restore TeacherLevelTutorial
	Read number
	For x = 1 To number
		New_teacher.teacher = New teacher
		Read pos_x,pos_y,frame,direction,counter,start_x
		new_teacher\pos_x= pos_x
		new_teacher\pos_y= pos_y
		new_teacher\frame = frame
		new_teacher\direction = direction
		new_teacher\anim_counter = counter
		new_teacher\start_x = start_x
	Next

;restore the sneak
Restore SneakLevelTutorial ;orig.: Sneak
	Read number
	For i = 1 To number
	New_sneak.sneak = New Sneak
		Read x,y,frame,direction,counter,start_x
		new_sneak\pos_x = x
		new_sneak\pos_y = y
		new_sneak\frame = frame
		new_sneak\direction = direction
		new_sneak\anim_counter = counter
		new_sneak\start_x = start_x
	Next 
	
;restore energy items
Restore EnergyLevelTutorial
	Read number
	For i = 1 To number
		new_energy_object.energys = New energys
		Read energy_x,energy_y,energy_sort
		new_energy_object\en_x = energy_x
		new_energy_object\en_y = energy_y
		new_energy_object\sort = energy_sort
	Next


;less energy items
Restore LessEnergyTutorial ;orig.: LessEnergyObjects
		Read number
		For i=1 To number
		new_less_energy_object.less_energys = New less_energys
		Read less_energy_x,less_energy_y,less_energy_sort
		new_less_energy_object\less_en_x = less_energy_x
		new_less_energy_object\less_en_y = less_energy_y
		new_less_energy_object\less_en_sort = less_energy_sort
		Next 


;restore coins
Restore CoinLevelTutorial  
	Read number				
	For i = 1 To number
		newcoin.Coins = New coins
		Read x,y,sort
		newcoin\coinx = x
		newcoin\coiny = y
		newcoin\sort = sort
	Next

;restore school items
Restore MathItemsLevelTutorial
		Read number
		For i = 1 To number
		newitem.school = New school
		Read school_x, school_y, school_sort
		newitem\school_x = school_x
		newitem\school_y = school_y
		newitem\school_sort = school_sort
		Next 
		
;restore the level door
Restore DoorLevelTutorial
	newdoor.door = New door
	Read x,y,frame
	newdoor\pos_x = x
	newdoor\pos_y = y
	newdoor\frame = frame
	

End Function


Function Level_1()

PointMinimum = 70 ; here, the minimum of points that a player has to collect, is set

If xyz = 0 Then 		
xyz = 1
Movx = Movx_Lvl1
Movy = Movy_Lvl1
Tut = 0
EndIf 

;restore the bricks
Restore BrickLevel1
	For bricky = 0 To 24
		For brickx = 0 To 181
			Read ActualLevel(brickx,bricky)
		Next
	Next

;restore the monsters
Restore MonsterLevel1
	Read number
	For mi = 1 To number
		new_monster.Monster = New Monster
		Read Monstertype, x, y, direction,anim_counter,frame,start_x,m_en
		new_monster\Monster_type = Monstertype
		new_monster\Pos_x = x
		new_monster\Pos_y = y
		new_monster\direction = direction
		new_monster\Anim_counter = anim_counter
		new_monster\Frame = frame
		new_monster\Start_x = start_x
		new_monster\M_energy = m_en
	Next 	

;restore the teachers
Restore TeacherLevel1
	Read number
	For x = 1 To number
		New_teacher.teacher = New Teacher
		Read pos_x,pos_y,frame,direction,counter,start_x
		new_teacher\pos_x= pos_x
		new_teacher\pos_y= pos_y
		new_teacher\frame = frame
		new_teacher\direction = direction
		new_teacher\anim_counter = counter
		new_teacher\start_x = start_x
	Next

;restore the sneak
Restore SneakLevel1
	Read number
	For i = 1 To number
	New_sneak.sneak = New Sneak
	Read x,y,frame,direction,counter,start_x
	new_sneak\pos_x = x
	new_sneak\pos_y = y
	new_sneak\frame = frame
	new_sneak\direction = direction
	new_sneak\anim_counter = counter
	new_sneak\start_x = start_x
	Next 
	
;restore energy items
Restore EnergyLevel1
	Read number
		For eni = 1 To number
			new_energy_object.energys = New Energys
			Read energy_x,energy_y,energy_sort
			new_energy_object\en_x = energy_x
			new_energy_object\en_y = energy_y
			new_energy_object\sort = energy_sort
		Next


;less energy items
Restore LessEnergyLevel1
	Read number
		For i = 1 To number
		new_less_energy_object.less_energys = New Less_energys
		Read less_energy_x,less_energy_y,less_energy_sort
		new_less_energy_object\less_en_x = less_energy_x
		new_less_energy_object\less_en_y = less_energy_y
		new_less_energy_object\less_en_sort = less_energy_sort
		Next 

;restore coins
Restore CoinLevel1 
	Read number				;original: coin_level1, must have another name lateron
	For i = 1 To number
		newcoin.Coins = New Coins
		Read x,y,sort
		newcoin\coinx = x
		newcoin\coiny = y
		newcoin\sort = sort
	Next

;restore math items
Restore MathItemsLevel1
	Read number
		For i = 1 To number
		newitem.school = New school
		Read school_x, school_y, school_sort
		newitem\school_x = school_x
		newitem\school_y = school_y
		newitem\school_sort = school_sort
		Next 
		
Restore EnglishItemsLevel1
	Read number
	For i = 1 To number
		newitem.school = New school
		Read school_x, school_y, school_sort
		newitem\school_x = school_x
		newitem\school_y = school_y
		newitem\school_sort = school_sort
	Next 
	

Restore HistoryItemsLevel1
	Read number
	For i = 1 To number
		newitem.school = New school
		Read school_x, school_y, school_sort
		newitem\school_x = school_x
		newitem\school_y = school_y
		newitem\school_sort = school_sort
	Next 
		
;restore the level door
Restore DoorLevel1 
	newdoor.door = New door
	Read x,y,frame
	newdoor\pos_x = x
	newdoor\pos_y = y
	newdoor\frame = frame
	
End Function


Function Level_2()

PointMinimum = 150

If xyz = 1 Then	
xyz = 0			
Movx = Movx_Lvl2 
Movy = Movy_Lvl2
EndIf 

;restore the bricks
Restore BrickLevel2;original: mapdata
	For bricky = 0 To 24;original: 21
		For brickx = 0 To 181;original: 79
			Read ActualLevel(brickx,bricky)
		Next
	Next

;restore the monsters
Restore MonsterLevel2
	Read number
	For mi = 1 To number
		new_monster.Monster = New Monster
		Read Monstertype, x, y, direction,anim_counter,frame,start_x,m_en
		new_monster\Monster_type = Monstertype
		new_monster\Pos_x = x
		new_monster\Pos_y = y
		new_monster\direction = direction
		new_monster\Anim_counter = anim_counter
		new_monster\Frame = frame
		new_monster\start_x = start_x
		new_monster\m_energy = m_en
	Next 		

;restore the teachers
Restore TeacherLevel2
	Read number
	For x = 1 To number
		New_teacher.teacher = New teacher
		Read pos_x,pos_y,frame,direction,counter,start_x
		new_teacher\pos_x= pos_x
		new_teacher\pos_y= pos_y
		new_teacher\frame = frame
		new_teacher\direction = direction
		new_teacher\anim_counter = counter
		new_teacher\start_x = start_x
	Next

;restore the sneak
Restore SneakLevel2
	Read number
	For i = 1 To number
	New_sneak.sneak = New Sneak
	Read x,y,frame,direction,counter,start_x
	new_sneak\pos_x = x
	new_sneak\pos_y = y
	new_sneak\frame = frame
	new_sneak\direction = direction
	new_sneak\anim_counter = counter
	new_sneak\start_x = start_x
	Next 
	
;restore energy items
Restore EnergyLevel2
	Read number
	For i = 1 To number
		new_energy_object.energys = New energys
		Read energy_x,energy_y,energy_sort
		new_energy_object\en_x = energy_x
		new_energy_object\en_y = energy_y
		new_energy_object\sort = energy_sort
	Next

;less energy items
Restore LessEnergyLevel2
	Read number
	For i = 1 To number
		new_less_energy_object.less_energys = New less_energys
		Read less_energy_x,less_energy_y,less_energy_sort
		new_less_energy_object\less_en_x = less_energy_x
		new_less_energy_object\less_en_y = less_energy_y
		new_less_energy_object\less_en_sort = less_energy_sort
	Next 

;restore coins
Restore CoinLevel2 
	Read number				;original: coin_level1, must have another name lateron
	For i = 1 To number
		newcoin.Coins = New coins
		Read x,y,sort
		newcoin\coinx = x
		newcoin\coiny = y
		newcoin\sort = sort
	Next
	
;restore german items
Restore GermanItemsLevel2
	Read number
		For i = 1 To number
		newitem.school = New school
		Read school_x, school_y, school_sort
		newitem\school_x = school_x
		newitem\school_y = school_y
		newitem\school_sort = school_sort
		Next 
		
;restore sport items
Restore SportItemsLevel2
	Read number
		For i = 1 To number
		newitem.school = New School
		Read school_x, school_y, school_sort
		newitem\school_x = school_x
		newitem\school_y = school_y
		newitem\school_sort = school_sort
		Next 
		
;restore geo items
Restore GeoItemsLevel2
	Read number
		For i = 1 To number
		newitem.school = New School
		Read school_x, school_y, school_sort
		newitem\school_x = school_x
		newitem\school_y = school_y
		newitem\school_sort = school_sort
		Next 	


;restore the level door
Restore DoorLevel2 
	newdoor.door = New Door
	Read x,y,frame
	newdoor\pos_x = x
	newdoor\pos_y = y
	newdoor\frame = frame

End Function


Function Level_3()

pointMinimum = 240

If yxz = 0 Then
xyz = 1
movx = MOVX_LVL3
movy = Movy_Lvl3
EndIf 

;restore the bricks
Restore BrickLevel3;original: mapdata
	For bricky = 0 To 24;original: 21
		For brickx = 0 To 181;original: 79
			Read actualLevel(brickx,bricky)
		Next
	Next

;restore the monsters
Restore MonsterLevel3
	Read number
	For mi = 1 To number
		new_monster.Monster = New Monster
		Read Monstertype, x, y, direction,anim_counter,frame,start_x,m_en
		new_monster\Monster_type = Monstertype
		new_monster\Pos_x = x
		new_monster\Pos_y = y
		new_monster\Direction = direction
		new_monster\Anim_counter = anim_counter
		new_monster\Frame = frame
		new_monster\Start_x = start_x
		new_monster\M_energy = m_en
		Next 		

;restore the teachers
Restore TeacherLevel3
	Read number
	For x = 1 To number
		New_teacher.teacher = New teacher
		Read pos_x,pos_y,frame,direction,counter,start_x
		new_teacher\pos_x= pos_x
		new_teacher\pos_y= pos_y
		new_teacher\frame = frame
		new_teacher\direction = direction
		new_teacher\anim_counter = counter
		new_teacher\start_x = start_x
	Next

;restore the sneak
Restore SneakLevel3
	Read number
	For i = 1 To number
	New_sneak.sneak = New Sneak
	Read x,y,frame,direction,counter,start_x
	new_sneak\pos_x = x
	new_sneak\pos_y = y
	new_sneak\frame = frame
	new_sneak\direction = direction
	new_sneak\anim_counter = counter
	new_sneak\start_x = start_x
	Next 
	
;restore energy items
Restore EnergyLevel3
	For i = 1 To 1
		new_energy_object.energys = New energys
		Read energy_x,energy_y,energy_sort
		new_energy_object\en_x = energy_x
		new_energy_object\en_y = energy_y
		new_energy_object\sort = energy_sort
	Next

;less energy items
Restore LessEnergyLevel3
	Read number
	For i = 1 To number
		new_less_energy_object.less_energys = New less_energys
		Read less_energy_x,less_energy_y,less_energy_sort
		new_less_energy_object\less_en_x = less_energy_x
		new_less_energy_object\less_en_y = less_energy_y
		new_less_energy_object\less_en_sort = less_energy_sort
	Next

;restore coins
Restore CoinLevel3 
	Read number				;original: coin_level1, must have another name lateron
	For i = 1 To number
		newcoin.Coins = New coins
		Read x,y,sort
		newcoin\coinx = x
		newcoin\coiny = y
		newcoin\sort = sort
	Next

;restore music items
Restore MusicItemsLevel3
		Read number
		For i = 1 To number
		newitem.school = New school
		Read school_x, school_y, school_sort
		newitem\school_x = school_x
		newitem\school_y = school_y
		newitem\school_sort = school_sort
		Next 
		
;restore chem items
Restore ChemItemsLevel3
	Read number
		For i = 1 To number
		newitem.school = New school
		Read school_x, school_y, school_sort
		newitem\school_x = school_x
		newitem\school_y = school_y
		newitem\school_sort = school_sort
		Next 

;restore compscience items
Restore CompScienceItemsLevel3
	Read number
		For i = 1 To number
		newitem.school = New school
		Read school_x, school_y, school_sort
		newitem\school_x = school_x
		newitem\school_y = school_y
		newitem\school_sort = school_sort
		Next 
	
;restore the level door
Restore DoorLevel3 ;orig.: Door_Level1
	newdoor.door = New door
	Read x,y,frame
	newdoor\pos_x = x
	newdoor\pos_y = y
	newdoor\frame = frame
	
End Function


Function Level_4()

PointMinimum = 320

If xyz = 1 Then
xyz = 0
Movx = Movx_Lvl4
Movy = Movy_Lvl4
EndIf 

;restore the bricks
Restore BrickLevel4;original: mapdata
	For bricky = 0 To 24;original: 21
		For brickx = 0 To 181;original: 79
			Read ActualLevel(brickx,bricky)
		Next
	Next

;restore the monsters
Restore MonsterLevel4
	Read number
	For mi = 1 To number
		new_monster.Monster = New Monster
		Read Monstertype, x, y, direction,anim_counter,frame,start_x,m_en
		new_monster\Monster_type = Monstertype
		new_monster\Pos_x = x
		new_monster\Pos_y = y
		new_monster\direction = direction
		new_monster\Anim_counter = anim_counter
		new_monster\Frame = frame
		new_monster\start_x = start_x
		new_monster\m_energy = m_en
	Next 		

;restore the teachers
Restore TeacherLevel4
	Read number
	For x = 1 To number
		New_teacher.teacher = New teacher
		Read pos_x,pos_y,frame,direction,counter,start_x
		new_teacher\pos_x= pos_x
		new_teacher\pos_y= pos_y
		new_teacher\frame = frame
		new_teacher\direction = direction
		new_teacher\anim_counter = counter
		new_teacher\start_x = start_x
	Next
	
;restore energy items
Restore EnergyLevel4
	Read number
	For i = 1 To number
		new_energy_object.energys = New Energys
		Read energy_x,energy_y,energy_sort
		new_energy_object\en_x = energy_x
		new_energy_object\en_y = energy_y
		new_energy_object\sort = energy_sort
	Next

;less energy items
Restore LessEnergyLevel4
	Read number
	For i = 1 To number
		new_less_energy_object.less_energys = New Less_energys
		Read less_energy_x,less_energy_y,less_energy_sort
		new_less_energy_object\less_en_x = less_energy_x
		new_less_energy_object\less_en_y = less_energy_y
		new_less_energy_object\less_en_sort = less_energy_sort
	Next 

;restore coins
Restore CoinLevel4 
	Read number				;original: coin_level1, must have another name lateron
	For i = 1 To number
		newcoin.Coins = New Coins
		Read x,y,sort
		newcoin\coinx = x
		newcoin\coiny = y
		newcoin\sort = sort
	Next

;restore all mixed items
Restore ItemsLevel4
		Read number
		For i = 1 To number
		newitem.school = New School
		Read school_x, school_y, school_sort
		newitem\school_x = school_x
		newitem\school_y = school_y
		newitem\school_sort = school_sort
		Next 
		
;restore the level door
Restore DoorLevel4 ;orig.: Door_Level4
	newdoor.door = New Door
	Read x,y,frame
	newdoor\pos_x = x
	newdoor\pos_y = y
	newdoor\frame = frame	

End Function


Function Level_Abi1()

pointMinimum = creditPoints
pointMinimum = (pointMinimum + 240)

If(xyz = 0) Then
xyz = 1
movx = MOVX_LVLAbi1
movy = Movy_LvlAbi1
EndIf 

Restore BrickLevelAbi1;original: mapdata
	For bricky = 0 To 24;original: 21
		For brickx = 0 To 181;original: 79
			Read actualLevel(brickx,bricky)
		Next
	Next
	
;restore the monsters
Restore MonsterLevelAbi1
	Read number
	For mi = 1 To number
		new_monster.Monster = New Monster
		Read Monstertype, x, y, direction,anim_counter,frame,start_x,m_en
		new_monster\Monster_type = Monstertype
		new_monster\Pos_x = x
		new_monster\Pos_y = y
		new_monster\Direction = direction
		new_monster\Anim_counter = anim_counter
		new_monster\Frame = frame
		new_monster\Start_x = start_x
		new_monster\M_energy = m_en
	Next 
	
;restore energy items
Restore EnergyLevelAbi1
	Read number
	For i = 1 To number
		new_energy_object.energys = New Energys
		Read energy_x,energy_y,energy_sort
		new_energy_object\en_x = energy_x
		new_energy_object\en_y = energy_y
		new_energy_object\sort = energy_sort
	Next

;less energy items
Restore LessEnergyLevelAbi1
	Read number
	For i = 1 To number
		new_less_energy_object.less_energys = New Less_energys
		Read less_energy_x,less_energy_y,less_energy_sort
		new_less_energy_object\less_en_x = less_energy_x
		new_less_energy_object\less_en_y = less_energy_y
		new_less_energy_object\less_en_sort = less_energy_sort
	Next 
		
;restore all mixed items
Restore ItemsLevelAbi1
		Read number
		For i = 1 To number
		newitem.school = New School
		Read school_x, school_y, school_sort
		newitem\school_x = school_x
		newitem\school_y = school_y
		newitem\school_sort = school_sort
		Next 
		
;restore the pauses
Restore PauseAbi1
	Read number
	For i = 1 To number
		newpause.pause = New Pause
		Read pos_x,pos_y,sort
		newpause\pos_x = pos_x
		newpause\pos_y = pos_y
		newpause\sort = sort
	Next

;restore the level door
Restore DoorLevelAbi1 ;orig.: Door_Level4
	newdoor.door = New Door
	Read x,y,frame
	newdoor\pos_x = x
	newdoor\pos_y = y
	newdoor\frame = frame

End Function  


Function Level_Abi2()

	creditPoints = pointMinimum
	pointMinimum = pointMinimum+70
	
	If(xyz = 1) Then
		xyz = 0
		movx = MOVX_LVLAbi2
		movy = Movy_LvlAbi2
	EndIf 
	
	Restore BrickLevelAbi2		;original: mapdata
	For bricky = 0 To 24		;original: 21
		For brickx = 0 To 181	;original: 79
			Read actualLevel(brickx,bricky)
		Next
	Next
		
	;restore the monsters
	Restore MonsterLevelAbi2
		Read number
		For mi = 1 To number
			new_monster.Monster = New Monster
			Read Monstertype, x, y, direction,anim_counter,frame,start_x,m_en
			new_monster\Monster_type = Monstertype
			new_monster\Pos_x = x
			new_monster\Pos_y = y
			new_monster\Direction = direction
			new_monster\Anim_counter = anim_counter
			new_monster\Frame = frame
			new_monster\Start_x = start_x
			new_monster\M_energy = m_en
		Next 		
	
	;restore energy items
	Restore EnergyLevelAbi2
		Read number
		For i = 1 To number
			new_energy_object.energys = New Energys
			Read energy_x,energy_y,energy_sort
			new_energy_object\en_x = energy_x
			new_energy_object\en_y = energy_y
			new_energy_object\sort = energy_sort
		Next
	
	;less energy items
	Restore LessEnergyLevelAbi2
		Read number
		For i = 1 To number
			new_less_energy_object.less_energys = New Less_energys
			Read less_energy_x,less_energy_y,less_energy_sort
			new_less_energy_object\less_en_x = less_energy_x
			new_less_energy_object\less_en_y = less_energy_y
			new_less_energy_object\less_en_sort = less_energy_sort
		Next 
	
	;restore all mixed items
	Restore ItemsLevelAbi2
			Read number
			For i = 1 To number
			newitem.school = New School
			Read school_x, school_y, school_sort
			newitem\school_x = school_x
			newitem\school_y = school_y
			newitem\school_sort = school_sort
			Next 
	
	;restore the pauses
	Restore PauseAbi2
		Read number
		For i = 1 To number
			newpause.pause = New Pause
			Read pos_x,pos_y,sort
			newpause\pos_x = pos_x
			newpause\pos_y = pos_y
			newpause\sort = sort
		Next
	
	;restore the level door
	Restore DoorLevelAbi2 ;orig.: Door_Level4
		newdoor.door = New Door
		Read x,y,frame
		newdoor\pos_x = x
		newdoor\pos_y = y
		newdoor\frame = frame

End Function 


Function ShowAbi()

	If(xyz=0) Then
		xyz = 1
		movx = 5400
		movy = 480
	EndIf

	Local creditPoint# = Float(creditPoints) ; this formula computes a quite good virtual mark
	mark# = 1/(creditPoint#/1000)
	If(mark#>4) Then mark# = 6 
	If(mark#<1) Then mark# = 1
	
	Select abiMessage
		Case 0
			Text(100,0,"HERZLICHEN GLÜCKWUNSCH!!!")
			Text(100,90,"Du hast es endlich geschafft und erhälst nun dein wohlverdientes Abitur.")
			Text(100,150,"Du hast insgesamt "+creditPoints+" Punkte gesammelt.")
			Text(100,180,"Das entspricht einer virtuellen Note von "+mark#+".")
			Text(100,240,"Du darfst dir dieses Abiturzeugnis nun ausdrucken und es dir dann an den Hut stecken.")
			Text(200,430,"Bitte [Enter] drücken um fortzufahren...")
			
			If(KeyHit(28)) Then abiMessage = abiMessage+1
			
		Case 1
			Cls 
			Text(120,0,"CREDITS")
			Text(120,12,"-----------------")
			Text(120,30,"Programmierung, Leitung und Grafiken:    Stefan Behrendt")
			Text(120,60,"Sounds:    Hintergrundmusik: 'Boom!' von UnrealSoftware")
			Text(120,90,"            Jump-Sound: 'JumpTut1'")
			Text(120,120,"           Sandwich- und Monstersound: 'Stranded II' von Unreal Software")
			Text(120,150,"           alle anderen Sounds von www.soft-ware.net")
			Text(120,180,"Ein besonderer Dank für das Testen dieses Spiels geht an:")
			Text(120,210,"           Christian Radius")
			Text(120,240,"           Sebastian Nordenbruch")
			Text(120,270,"           Cornelius Irmscher")
			Text(120,300,"           Konstantin von Knorre")
			Text(120,330,"           Tobias König")
			Text(120,360,"           Anne Hofmeister")
			Text(120,390,"           ...und alle anderen, falls ich jemanden vergessen haben sollte. Sry^^")
			Text(120,468,"Mit [Enter] geht's wieder von vorn los...")
			
			If(KeyHit(28)) Then 
				Cls()
				level = 1
				movx = -288	;reset start position
				movy = 480
				doDrawPlayer = 1
				text_var = 0
				doTut = 1
				tut = 0
				xyz = 0
				start = 0
				creditPoints = 0
				pointMinimum = 0 
				doTrade = 1
				nextStep = 0
				point = 0
				score = 0
				ResumeChannel(backGround)
			EndIf 
		
	End Select 

End Function 


Function TextTutorial()

	SetFont(tutFont)
	Color(200,200,0)

	;start the level

	If(doTut = 1) Then		;if this tutorial is meant to be played
		Select text_var

	Case 0 ; the first text
	tut = 1
	jumpAllow = 0 ; player is not able to jump
	moveAny = 0

	Text 10,30,TUT0$
	Text 10,45,Tut1$
	Text 10,60,TUT2$
	Text 10,75,TUT3$
	
	If KeyHit(28) Then
		;player_move = 1 ==> just after the last text
		text_var = text_var+1
	EndIf
	
	
	Case 1
	
	Text 10,30,TUT4$
	Text 10,45,TUT5$
	
	If KeyHit(28) Then
		text_var = text_var+1
	EndIf
	
	
	Case 2
	
	Text 10,30,TUT6$
	Text 10,45,TUT7$
	Text 10,60,TUT8$
	
	If KeyHit(28) Then
		text_var = text_var+1
	EndIf
	
	
	Case 3
	
	Text 10,30,TUT9$
	Text 10,45,TUT10$
	Text 10,60,TUT11$
	
	If KeyHit(28) Then
		text_var = text_var+1
	EndIf
	
	Case 4
	
	Text 10,30,TUT12$
	Text 10,45,TUT13$
	Text 10,60,TUT14$
	
	If KeyHit(28) Then
		text_var = text_var+1
		player_move = 1
	EndIf

	;now he walks to the root
	Case 5
	tut = 1
		
	For newitem.school = Each School
	If ImagesCollide(root,((newitem\school_x)-movx),((newitem\school_y)-movy),0,player,player_posx,player_posy,0) Then
	didCollide = 1
	player_move = 0
		Text 10,30,TUT15$
		Text 10,45,TUT16$
		Text 10,60,TUT17$
		Text 10,75,TUT18$
		Text 10,90,TUT19$

	EndIf 
	Next 
	
	If KeyHit(28) And didCollide Then
		text_var = text_var+1
		player_move = 1
		tut = 0
		didCollide = 0
	EndIf

	;now he walks to the sandwich
	Case 6
	tut = 1
	
	For new_energy_object.energys = Each Energys
	If ImagesCollide(sandwich,((new_energy_object\en_x)-movx),((new_energy_object\en_y)-movy),0,player,player_posx,player_posy,0) Then
	didCollide = 1
	player_move = 0
		Text 10,30,TUT20$
		Text 10,45,TUT21$
		Text 10,60,TUT22$
		Text 10,75,TUT23$
 	
	EndIf	
	Next
	
	If KeyHit(28) And didCollide Then
		text_var = text_var+1
		player_move = 1
		tut = 0
		didCollide = 0
	EndIf
	
	
	Case 7
	tut = 1
	
	For new_less_energy_object.less_energys = Each Less_energys
	If ImagesCollide(toilet,((new_less_energy_object\less_en_x)-movx),((new_less_energy_object\less_en_y)-movy),0,player,player_posx,player_posy,0) Then
	didCollide = 1
	player_move = 0
		Text 10,30,TUT24$
		Text 10,45,TUT25$
		Text 10,60,TUT26$
		Text 10,75,TUT27$
 	
	EndIf	
	Next

	If KeyHit(28) And didCollide Then
		text_var = text_var+1
		tut = 0
		didCollide = 0
	EndIf
	
	
	Case 8
	tut = 1
	
	Text 10,30,TUT28$
	Text 10,45,TUT29$
	Text 10,60,TUT30$
	Text 10,75,TUT31$
	Text 10,90,TUT32$
	
	If KeyHit(28) Then
	text_var = text_var+1
	player_move = 1
	tut = 0
	moveAny = 1
	EndIf 
	
	
	Case 9
	tut = 1

	
	If movx = 712 Then
	didCollide = 1 		;this is a few metres behind the 1st monster
	player_move = 0
	moveAny = 0
		Text 10,30,TUT33$
		Text 10,45,TUT34$
		Text 10,60,TUT35$
	EndIf
	
	If KeyHit(28) And didCollide Then
	text_var = text_var +1
	player_move = 1
	moveAny = 1
	didCollide = 0
	movx = 716 			; he must be placed behind the orig. pos. else he repeats it always!
	EndIf  
	
	
	Case 10
	
	If movx = 1012 Then		;this is a few metres behind the 2nd monster
	didCollide = 1
	player_move = 0
		Text 10,30,TUT36$
		Text 10,45,TUT37$
		Text 10,60,TUT38$
	EndIf
	
	If KeyHit(28) And didCollide Then
	text_var = text_var +1
	movx = 1016
	didCollide = 0
	EndIf
	
	
	Case 11
	
	Text 10,30,TUT39$
	Text 10,45,TUT40$
	Text 10,60,TUT41$
	
	If KeyHit(28) Then
	text_var = text_var+1
	player_move = 1
	didCollide = 0
	jumpAllow = 1
	EndIf 
	
	
	Case 12
	
	If movx = 1664 Then 
	player_move = 0
	didCollide = 1
	moveAny = 0
	jumpAllow = 0
	
	Text 10,30,TUT42$
	Text 10,45,TUT43$
	EndIf 
	
	If KeyHit(28) And didCollide Then
	text_var = text_var +1
	player_move = 1
	moveAny = 1
	jumpAllow = 1
	EndIf 



	Case 13
	For new_teacher.teacher = Each Teacher
	If ImagesCollide(teacher,((New_teacher\pos_x)-movx),((New_teacher\pos_y)-movy),0,player,player_posx,player_posy,0) Then
	doTrade = 0
	moveAny = 0
	jumpAllow = 0
	didCollide = 1
	player_move = 0
		Text 10,30,TUT44$
		Text 10,45,TUT45$
		Text 10,60,TUT46$
	EndIf
	Next
	
	If KeyHit(28) And didCollide = 1 Then
	doTrade = 1
	text_var = text_var +1
	EndIf
	
	
	
	Case 14
	;in this case, the player is dealing with the teacher. If the deal is over, the Text_var is raised in the TeacherTrade-Function.
	
	
	Case 15
	player_move = 0
	moveAny = 0
	Text 10,30,TUT47$
	Text 10,45,TUT48$
	Text 10,60,TUT49$
	
	If KeyHit(28) Then
	text_var = text_var+1
	player_move = 1
	didCollide = 0
	moveAny = 1
	jumpAllow = 1
	doTrade = 0
	EndIf 
	
	
	Case 16
	For new_sneak.sneak = Each Sneak
	If ImagesCollide(sneak,((New_sneak\pos_x)-movx),((new_sneak\pos_y)-movy),0,player,player_posx,player_posy,0) Then
	nextStep = 0 ; this is just for that the variable can be used
	moveAny = 0
	jumpAllow = 0
	didCollide = 1
	player_move = 0
		Text 10,30,TUT50$
		Text 10,45,TUT51$
		Text 10,60,TUT52$
		Text 10,75,TUT53$
		Text 10,90,TUT54$
	EndIf
	Next
	
	If KeyHit(28) And didCollide Then
	text_var = text_var +1
	doTrade = 1
	EndIf
	
	
	Case 17
	;see SneakTrade
	
	
	Case 18
	player_move = 0
	moveAny = 0
	Text 10,30,TUT55$
	
	If KeyHit(28) Then
	player_move = 1
	moveAny = 1
	text_var = text_var +1 
	jumpAllow = 1
	EndIf 
	
	
	Case 19
	If movx = 2184 Then 
	player_move = 0 
		Text 10,30,TUT56$
		Text 10,45,TUT57$
		Text 10,60,TUT59$
		Text 10,75,TUT60$
	EndIf 
	
	If KeyHit(28) Then
	player_move = 1
	moveAny = 1
	doTrade = 1
	text_var = text_var +1 
	score = 0
	player_Energy = 100
	EndIf 
	
End Select
EndIf   

End Function 

Function TextAbitur()
	If(xyz = 0) Then
		xyz = 1
		movx = 5400
		movy = 480
	EndIf
		
	Text(0,0,ABI01$)
	Text(0,15,ABI02$)
	Text(0,30,ABI03$)
	Text(0,45,ABI04$)
	Text(0,60,ABI05$)
	Text(0,75,ABI06$)
	Text(0,90,ABI07$)
	Text(0,105,ABI08$)
	Text(0,120,ABI09$)
	Text(0,135,ABI10$)
	Text(0,150,ABI11$)
	Text(0,165,ABI12$)
	Text(0,180,ABI13$)
	Text(0,195,ABI14$)
	Text(0,210,ABI15$)
	Text(0,225,ABI16$)
	Text(0,240,ABI17$)
	Text(0,255,ABI18$)
	Text(0,270,ABI19$)
	Text(0,285,ABI20$)
	Text(0,300,ABI21$)
	Text(0,315,ABI22$)
	Text(0,330,ABI23$)
	Text(0,345,ABI24$)
	Text(0,360,ABI25$)
	Text(0,375,ABI26$)
		
	If(KeyHit(28)) Then
		level = level+1
		doDrawPlayer = 1
		xyz = 0
		moveAny = 1
		player_move = 1
		lives = 3 ; for this level, player has 3 chances!
		;delete old stuff from level tutorial
		For newcoin.Coins = Each Coins
			Delete newcoin.Coins
		Next
		For new_energy_object.energys = Each Energys
			Delete New_energy_object.energys
		Next
		For newitem.school = Each School
			Delete newitem.school
		Next
		For new_less_energy_object.less_energys = Each Less_energys
			Delete new_less_energy_object.less_energys
		Next
		For new_monster.Monster = Each Monster
			Delete new_monster.Monster
		Next
		For new_teacher.teacher = Each Teacher
			Delete new_teacher.teacher
		Next
		For new_sneak.sneak = Each Sneak
			Delete new_sneak.sneak
		Next
		For new_pause.pause = Each Pause
			Delete new_pause.pause
		Next
		For newdoor.door = Each Door
			Delete newdoor.door
		Next 
		ResumeChannel(backGround)
	EndIf 
End Function 


Function WriteScore()
	If (level <> 6) And (level < 9) Then
		Text 570,0,"Punkte: "+creditPoints
		Text 570,15,"Geld: "+score+" Euro"
		Text 570,30,"Energie: "+player_Energy+"%"
		Text 570,45,"Leben: "+lives
		Text 280,0,"mindestens benötigte Punkte: "+pointMinimum
	EndIf 
End Function 

Function DrawLevelDoor()
	If creditPoints >= pointMinimum Then
	For newdoor.door = Each Door
		DrawImage door,((newdoor\pos_x)-movx),((newdoor\pos_y)-movy),newdoor\frame
	Next
	ElseIf creditPoints < pointMinimum Then
	For newdoor.door = Each Door
		DrawImage door,((newdoor\pos_x)-movx),((newdoor\pos_y)-movy),0
	Next
	EndIf 
End Function 

Function LevelDoorCollision()
	For newdoor.door = Each Door
		If ImagesCollide(door,((newdoor\pos_x)-movx),((newdoor\pos_y)-movy),0,player,player_posx,player_posy,0) Then
			If creditPoints >= pointMinimum Then ; if player has enough coins to finish that level
				PauseChannel backGround
				Delay 500
				;delete the stuff of the level before
				For newcoin.Coins = Each Coins
					Delete newcoin.Coins
				Next
				For new_energy_object.energys = Each Energys
					Delete New_energy_object.energys
				Next
				For newitem.school = Each School
					Delete newitem.school
				Next
				For new_less_energy_object.less_energys = Each Less_energys
					Delete new_less_energy_object.less_energys
				Next
				For new_monster.Monster = Each Monster
					Delete new_monster.Monster
				Next
				For new_teacher.teacher = Each Teacher
					Delete new_teacher.teacher
				Next
				For new_sneak.sneak = Each Sneak
					Delete new_sneak.sneak
				Next
				For new_pause.pause = Each Pause
					Delete new_pause.pause
				Next
				PlaySound levelChange
				
				level = level+1
				Delete newdoor.door
				Exit 
			ElseIf(creditPoints<pointMinimum) Then
				Text(10,30,"Du hast leider noch nicht genug Punkte, um weiter zu kommen. Gehe nochmal zurück oder drücke F10 zum Neustarten.")
			EndIf
		EndIf 
	Next  
End Function 


Function ShowMessages()
	SetFont normFont ; change the font
	Color 128,255,128 ; change font color 

	If(message > 0)

		If(start_message=0) Then
			start_message = 1
			mathTime = MilliSecs() 
		EndIf 
		Text(20,200,msg_Item$)
		If(MilliSecs()-mathTime > 3000) Then
			msg_Item$ = ""	;just set nothing on the screen :)
			message = 0
			start_message = 0
		EndIf
	
		Select message
			Case 1
				msg_Item$ = "MATHEMATIK - Vereinfachung von Wurzelgleichungen"
			Case 2
				msg_Item$ = "MATHEMATIK - Kombinatorik und ungeordnete Entnahme von Stichproben"
			Case 3
				msg_Item$ = "MATHEMATIK - Integralrechnung und Kurvendiskussion"
			Case 4
				msg_Item$ = "MATHEMATIK - Kombinationen unter Berücksichtigung der der Elementanordnung"
			Case 5
				msg_Item$ = "MATHEMATIK - Fakultät"
			Case 6
				msg_Item$ = "MATHEMATIK - Bestimmte Integrale und deren Ober- und Untergrenzen"
			Case 7
				msg_Item$ = "MATHEMATIK - Vektorrechnung im zweidimensionalen karthesischen Koordinatensystem"
			Case 8
				msg_Item$ = "MATHEMATIK - Anstiegsberechnung über die erste Ableitung der Funktion"
			Case 9
				msg_Item$ = "MATHEMATIK - Verhalten einer Funktion im Unendlichen"
			Case 10
				msg_Item$ = "MATHEMATIK - Unter Schülern gebräuchliche Faustformeln sind eben nicht alles!"
			Case 11
				msg_Item$ = "ENGLISCH - 'Yes we can' => Politic of President Barack Obama in the USA"
			Case 12
				msg_Item$ = "ENGLISCH - Welsh tea traditions"
			Case 13
				msg_Item$ = "ENGLISCH - Be careful with your sentence structure: Keep in mind the SPO-rule!"
			Case 14
				msg_Item$ = "ENGLISCH - Symbolic flag of the United States of America"
			Case 15
				msg_Item$ = "GESCHICHTE - Die französische Revolution und der Aufstieg Napoleon Bonapartes"
			Case 16
				msg_Item$ = "GESCHICHTE - Die nationalsozialistische Diktatur 1933-1945 unter Adolf Hitler"
			Case 17
				msg_Item$ = "GESCHICHTE - Die DDR als Beispiel für einen demokratischen Diktaturstaat unter Führung Erich Honeckers"
			Case 18
				msg_Item$ = "GESCHICHTE - Die Zerstörung Karthagos als Folge des dritten punischen Krieges"
			Case 19
				msg_Item$ = "GESCHICHTE - Von der Märzrevolution bis zum Untergang der Weimarer Republik"
			Case 20
				msg_Item$ = "GESCHICHTE - Teilung Deutschlands in zwei unabhängige Staaten"
			Case 21
				msg_Item$ = "GESCHICHTE - Machterweiterung der Kommunisten durch Zusammenschluss der SPD und KPD zur 'Einheitspartei'"
			Case 22
				msg_Item$ = "DEUTSCH - Goethes Faust als Beispiel für eine Menschheitsparabel"
			Case 23
				msg_Item$ = "DEUTSCH - Schillers Don Karlos als Beispiel für dessen eigene Konventionen und Motive"
			Case 24
				msg_Item$ = "DEUTSCH - Lessings Nathan der Weise als Beispiel für Aufklärungsliteratur des 18. Jahrhunderts"
			Case 25
				msg_Item$ = "DEUTSCH - Reihungen von Haupt- und Nebensätzen im Vergleich"
			Case 26
				msg_Item$ = "DEUTSCH - Moderne Sprach- und Artikulationsmethoden in Jugendkreisen"
			Case 27
				msg_Item$ = "DEUTSCH - Der Duden als Meilenstein deutscher Sprachgeschichte"
			Case 28
				msg_Item$ = "SPORT - Gerätturnen am Parallelbarren"
			Case 29
				msg_Item$ = "SPORT - Armkrafttraining an Ringen"
			Case 30
				msg_Item$ = "SPORT - Badminton"
			Case 31
				msg_Item$ = "SPORT - Fußball"
			Case 32
				msg_Item$ = "SPORT - Leichtathletik"
			Case 33
				msg_Item$ = "SPORT - Kletterübungen an der Sprossenwand"
			Case 34
				msg_Item$ = "SPORT - Bocksprung"
			Case 35
				msg_Item$ = "SPORT - Bekanntgabe der drei Sieger"
			Case 36
				msg_Item$ = "GEOGRAFIE - Globale Disparitäten und Verflechtungen"
			Case 37
				msg_Item$ = "GEOGRAFIE - Anwendung der Informationen aus physischen Karten im Atlas"
			Case 38
				msg_Item$ = "GEOGRAFIE - Hoch- und Tiefdruckgebiete und deren Klimabeeinflussung"
			Case 39
				msg_Item$ = "GEOGRAFIE - Fair Trade (c) als globale Handelsorganisation, die sich für mehr Gerechtigkeit einsetzt"
			Case 40
				msg_Item$ = "GEOGRAFIE - Geysire und deren Bedeutung für Island"
			Case 41
				msg_Item$ = "GEOGRAFIE - Der Wasserhaushalt im Ökosystem Wald"
			Case 42
				msg_Item$ = "MUSIK - Wie sich das zwölftönige Notensystem in Europa durchgesetzt hat"
			Case 43
				msg_Item$ = "MUSIK - Instrumente in anderen Kulturen der Welt"
			Case 44
				msg_Item$ = "MUSIK - Entwicklung der Notationsform im Laufe der Musikgeschichte"
			Case 45
				msg_Item$ = "MUSIK - Elektrische Musik als neuartiges Phänomen des 20. Jahrhunderts"
			Case 46
				msg_Item$ = "MUSIK - Aufbau und Funktionsweise eines Klaviers"
			Case 47
				msg_Item$ = "MUSIK - Der Dirigent als leitendes Organ des Orchesters im Musiktheater"
			Case 48
				msg_Item$ = "MUSIK - Expressionistische Musik Arnold Schönbergs und deren Folgen für das menschliche Gehör"
			Case 49
				msg_Item$ = "MUSIK - Definition des Grundtons im Notensystem mithilfe des Notenschlüssels"
			Case 50
				msg_Item$ = "CHEMIE - Elektronenübertragung bei der Redox-Reaktion"
			Case 51
				msg_Item$ = "CHEMIE - Der Bunsenbrenner und dessen Strahlpumpen-Prinzip"
			Case 52
				msg_Item$ = "CHEMIE - Ammoniak und dessen Beeinträchtigung des Riechorgans bei Übergenuss"
			Case 53
				msg_Item$ = "CHEMIE - Explosive Reaktionen nur mit Schutzbrille durchführen!"
			Case 54
			  msg_Item$ = "CHEMIE - Das 'Zucker-Wasser-Salz'-Experiment und dessen Beliebtheit bei jungen Schülern"
			Case 55
				msg_Item$ = "CHEMIE - C4 als Beispiel für formbaren Plastiksprengstoff"
			Case 56
				msg_Item$ = "INFORMATIK - PlayRay (c), die von Schülern im Informatikunterricht der Oberstufe meistbesuchte Website"
			Case 57
				msg_Item$ = "INFORMATIK - Entwicklung sechsachsiger Joysticks zur Steuerung des Seitenruders in Flugsimulatoren"
			Case 58
				msg_Item$ = "INFORMATIK - Ablösung der VGA- und PS2-Stecker durch den vielseitig brauchbaren USB-Anschluss"
			Case 59
				msg_Item$ = "INFORMATIK - Entwicklung des World Wide Webs"
			Case 60
				msg_Item$ = "INFORMATIK - Google (c) verschafft sich die Weltherrschaft mit Satellitenüberwachung der Erde"
			Case 61
				msg_Item$ = "INFORMATIK - Peripheriegeräte und automatische Treibererkennung in Windows (r)"
			Case 62
				msg_Item$ = "ABITUR DEUTSCH - Mit dem Abiturwissen 2009 unter der Bank geht das Deutsch-Abi bestimmt nicht schief!"
			Case 63
				msg_Item$ = "ABITUR DEUTSCH - In Schillers Schädel hat schon Goethe seinerzeit geniale poetische Gedanken entdeckt..."
			Case 64
				msg_Item$ = "ABITUR DEUTSCH - Mit Mephisto an der Seite kannst du alles haben, was du willst - auch ein Deutsch-Abi!"
			Case 68
				msg_Item$ = "ABITUR ENGLISCH - Zweisprachige Wörterbücher sind ja leider verboten. Wer trotzdem eins hat, hat's besser!"
			Case 69
				msg_Item$ = "ABITUR ENGLISCH - Selbst Briten schwören auf 'German Bratwurst' - nimm einen Haps und schreibe gestärkt weiter!"
			Case 70
				msg_Item$ = "ABITUR ENGLISCH - Wie lautet die beliebte Schüler-Fluchformel? Richtig, 'Holy Shit'. Egal, Kopf hoch!"
			Case 65
				msg_Item$ = "ABITUR MATHEMATIK - Dieser Super-Taschenrechner spuckt dir die Nullstellen einer Gleichung 6. Grades in 0,02s aus!"
			Case 66
				msg_Item$ = "ABITUR MATHEMATIK - Stell dir vor, du hättest unendlich viel Ahnung... Mit diesem Symbol wird es möglich!"
			Case 67
				msg_Item$ = "ABITUR MATHEMATIK - Prof. Dr. Herbert Henning. Prima! Was der nicht kann, hat im Mathe-Abitur sowieso nichts zu suchen!"
			Case 71
				msg_Item$ = "ABITUR CHEMIE - Schreib einfach auf, dass ein Apfel Strom leitet. Vielleicht kriegst du ja 'n paar Punkte dafür..."
			Case 72
				msg_Item$ = "ABITUR CHEMIE - Kleiner Tipp: Das ist ein Gefahrensymbol nach Richtlinie 67/548/EWG der Gefahrenstoffverordnung :)."
			Case 73
				msg_Item$ = "ABITUR CHEMIE - Das ist ein ultimatives PSE mit über 3700 Elementen, die speziell fürs Abitur erfunden wurden..."
			Case 74
				msg_Item$ = "ABITUR GEOGRAFIE - Asien, Land der Sonne, der Russen und Chinesen, der Atomwaffen und des Ehrenmordes"
			Case 75
				msg_Item$ = "ABITUR GEOGRAFIE - Europa, Land der Vielfalt, der britischen Küche, der fehlenden Bildungspolitik und der Abwrackprämie."
			Case 76
				msg_Item$ = "ABITUR GEOGRAFIE - Nordamerika, erst Land Washingtons, dann Jeffersons, ..., dann der Bushs, heute Obamas Machtimperium."
			Case 77
				msg_Item$ = "ABITUR GEOGRAFIE - Südamerika, Land der Latinos, der Demokratur, des Hanfs und der korrupten Drogenbosse."
			Case 78
				msg_Item$ = "ABITUR GEOGRAFIE - Australien, komische Insel jwd, mit Wüste, Kängurus, Brandstiftern und sogar mit Warmwasser!"
			Case 79
				msg_Item$ = "ABITUR GEOGRAFIE - Afrika, Land des Kinderreichtums, des dreckigen Wassers und der fehlenden Infrastruktur."
			Case 80
				msg_Item$ = "ABITUR GEOGRAFIE - Antarktis, große Eisplatte, die (noch) nicht den USA gehört; wohl eine Fehlerschaffung Gottes."
		End Select
	EndIf 
End Function 

; the cheat menu
Function Cheat()
	If(KeyDown(29) And KeyDown(46)) Then
		FlushKeys()
		Locate 0,100
		Local CheatInput$ = Trim$(Input$("Cheat eingeben :"))
		If(KeyHit(28) And CheatInput$<>"") Then
		Select CheatInput$
			Case "Leben"
				lives = lives+100
			Case "Energie"
				player_Energy = player_Energy+100
			Case "Punkte"
				creditPoints = creditPoints+100
			Case "Geld"
				score = score+100
			Case "Level+"
				For newcoin.Coins = Each Coins
					Delete newcoin.Coins
				Next
				For new_energy_object.energys = Each Energys
					Delete New_energy_object.energys
				Next
				For newitem.school = Each School
					Delete newitem.school
				Next
				For new_less_energy_object.less_energys = Each Less_energys
					Delete new_less_energy_object.less_energys
				Next
				For new_monster.Monster = Each Monster
					Delete new_monster.Monster
				Next
				For new_teacher.teacher = Each Teacher
					Delete new_teacher.teacher
				Next
				For new_sneak.sneak = Each Sneak
					Delete new_sneak.sneak
				Next
				For newdoor.door = Each Door
					Delete newdoor.door
				Next 
				player_move = 1
				moveAny = 1
				jumpAllow = 1
				doTut = 0
				tut = 0
				player_Energy = 100
				level = level +1
			Case "Level-"
				For newcoin.Coins = Each Coins
					Delete newcoin.Coins
				Next
				For new_energy_object.energys = Each Energys
					Delete New_energy_object.energys
				Next
				For newitem.school = Each School
					Delete newitem.school
				Next
				For new_less_energy_object.less_energys = Each Less_energys
					Delete new_less_energy_object.less_energys
				Next
				For new_monster.Monster = Each Monster
					Delete new_monster.Monster
				Next
				For new_teacher.teacher = Each Teacher
					Delete new_teacher.teacher
				Next
				For new_sneak.sneak = Each Sneak
					Delete new_sneak.sneak
				Next
				For newdoor.door = Each Door
					Delete newdoor.door
				Next 
				player_move = 1
				moveAny = 1
				jumpAllow = 1
				doTut = 0
				tut = 0
				player_Energy = 100
				level = level -1
		End Select
		EndIf
	EndIf 
End Function 


Function SelectBackGround()
	If(KeyHit(2)) Then ClsColor(255,0,0)
	If(KeyHit(3)) Then ClsColor(0,255,0)
	If(KeyHit(4)) Then ClsColor(0,0,255)
	If(KeyHit(5)) Then ClsColor(255,255,0)
	If(KeyHit(6)) Then ClsColor(0,0,0)
	If(KeyHit(7)) Then ClsColor(255,255,255)
	If(KeyHit(8)) Then ClsColor(255,128,0)
	If(KeyHit(9)) Then ClsColor(128,64,0)
	If(KeyHit(10)) Then ClsColor(Rnd(0,255),Rnd(0,255),Rnd(0,255))
End Function 


Function SaveGame()
	If KeyHit(64) Then	;if F6 hit
		If FileType("Save.dat")=1 Then
		SaveData = OpenFile("Save.dat")
		WriteInt(SaveData,level)
		If start = 0 Then
		WriteInt(SaveData,(start+1))
		Else WriteInt(SaveData,(start-1))
		EndIf 
		WriteInt(SaveData,doTrade)
		WriteInt(SaveData,nextStep)
		WriteInt(SaveData,point)
		WriteInt(SaveData,moveAny)
		WriteInt(SaveData,PlayerMove)
		WriteInt(SaveData,player_Energy)
		WriteInt(SaveData,score)
		WriteInt(SaveData,lives)
		WriteInt(SaveData,creditPoints)
		WriteInt(SaveData,pointMinimum)
		WriteInt(SaveData,jumpAllow)
		WriteInt(SaveData,tut)
		WriteInt(SaveData,text_var)
		WriteInt(SaveData,doTut)
		WriteInt(SaveData,doDrawPlayer)
		WriteInt(SaveData,movx)
		WriteInt(SaveData,movy)
		CloseFile(SaveData)

		Else
		SaveData = WriteFile("Save.dat")
		WriteInt(SaveData,level)
		WriteInt(SaveData,start)
		WriteInt(SaveData,doTrade)
		WriteInt(SaveData,nextStep)
		WriteInt(SaveData,point)
		WriteInt(SaveData,moveAny)
		WriteInt(SaveData,PlayerMove)
		WriteInt(SaveData,player_Energy)
		WriteInt(SaveData,score)
		WriteInt(SaveData,lives)
		WriteInt(SaveData,creditPoints)
		WriteInt(SaveData,pointMinimum)
		WriteInt(SaveData,jumpAllow)
		WriteInt(SaveData,tut)
		WriteInt(SaveData,text_var)
		WriteInt(SaveData,doTut)
		WriteInt(SaveData,doDrawPlayer)
		WriteInt(SaveData,movx)
		WriteInt(SaveData,movy)
		CloseFile(SaveData)

		EndIf
	EndIf 
End Function


Function LoadGame()
	If KeyHit(63) Then
		If FileType("Save.dat") = 1 Then
			LoadData = ReadFile("Save.dat")
			level = ReadInt(LoadData)
			start = ReadInt(LoadData)
			doTrade = ReadInt(LoadData)
			nextStep = ReadInt(LoadData)
			point = ReadInt(LoadData)
			moveAny = ReadInt(LoadData)
			PlayerMove = ReadInt(LoadData)
			player_Energy = ReadInt(LoadData)
			score = ReadInt(LoadData)
			lives = ReadInt(LoadData)
			creditPoints = ReadInt(LoadData)
			pointMinimum = ReadInt(LoadData)
			jumpAllow = ReadInt(LoadData)
			tut = ReadInt(LoadData)
			text_var = ReadInt(LoadData)
			doTut = ReadInt(LoadData)
			doDrawPlayer = ReadInt(LoadData)
			movx = ReadInt(LoadData)
			movy = ReadInt(LoadData)
			CloseFile(LoadData)
		Else
		RuntimeError "Error: Could not find 'Save.dat'!"
		EndIf
	EndIf
End Function 
	

; Type for the Coin:
Type Coins
Field Coinx
Field Coiny
Field Sort
End Type

;Type for Energy objects:
Type Energys
Field en_x
Field en_y
Field sort
End Type

;Type for all math items:
Type School
Field School_x
Field School_y
Field School_sort
End Type 

;type for less energy
Type Less_energys
Field less_en_x
Field less_en_y
Field less_en_sort
End Type 

;monsters
Type Monster
Field Monster_type
Field Pos_x
Field Pos_y
Field Direction
Field Anim_counter
Field Frame 
Field Start_x
Field M_energy
End Type 

;teachers
Type Teacher
Field pos_x
Field pos_y
Field frame
Field direction
Field anim_counter
Field start_x
End Type 

Type Sneak
Field pos_x
Field pos_y
Field frame
Field direction
Field anim_counter
Field start_x
End Type 

;shoot-type
Type ShootRight
Field shoot_x
Field shoot_y
End Type

Type ShootLeft
Field shoot_x
Field shoot_y
End Type 

;level door
Type Door
Field pos_x
Field pos_y
Field frame
End Type 

Type Pause
Field pos_x
Field pos_y
Field sort
End Type  

;data fields
.CoinLevelTutorial
Data 16		
Data 1407,602,1
Data 1471,602,1
Data 1631,602,1
Data 1791,602,1
Data 1855,602,1
Data 1471,474,1
Data 1567,474,1
Data 1631,474,1
Data 1695,474,1
Data 1791,474,1
Data 1535,346,2
Data 1631,346,2
Data 1727,346,2
Data 1599,218,2
Data 1663,218,2
Data 1631,154,3

.CoinLevel1
Data 89
Data 167,730,1
Data 199,730,1
Data 231,730,1
Data 263,730,1
Data 295,730,1
Data 327,730,1
Data 359,730,1
Data 391,730,1
Data 443,634,1
Data 479,570,1
Data 507,506,1
Data 507,634,1
Data 540,570,1
Data 607,538,2
Data 828,442,1
Data 860,442,1
Data 892,442,1
Data 711,512,3
Data 711,544,2
Data 711,576,2
Data 711,608,2
Data 711,640,1
Data 711,672,1
Data 711,700,1
Data 711,736,1
Data 711,760,1
Data 863,602,2
Data 895,529,3
Data 927,602,2
Data 1407,250,3
Data 1599,666,2
Data 1631,666,2
Data 1663,666,2
Data 1695,666,2
Data 1951,634,1
Data 1983,634,1
Data 2015,666,1
Data 2047,666,1
Data 2079,666,1
Data 2115,730,1
Data 2115,698,1
Data 2431,730,2
Data 2687,602,1
Data 2563,666,2
Data 3167,218,1
Data 3183,250,1
Data 3199,282,2
Data 3215,314,2
Data 3231,346,3
Data 3483,730,3
Data 3743,186,3
Data 3967,346,1
Data 3995,410,1
Data 4027,474,1
Data 3903,666,2
Data 3907,730,1
Data 3939,730,1
Data 3971,730,1
Data 4219,570,2
Data 4899,634,3
Data 4931,634,3
Data 4963,634,3
Data 4995,634,3
Data 5027,634,3
Data 5059,634,3
Data 5091,634,3
Data 5123,634,3
Data 5155,634,3
Data 5187,634,3
Data 4899,698,1
Data 4931,698,1
Data 4963,698,1
Data 4995,698,1
Data 5027,698,1
Data 5059,698,1
Data 5091,698,1
Data 5123,698,1
Data 5155,698,1
Data 5187,698,1
Data 4899,666,2
Data 4931,666,2
Data 4963,666,2
Data 4995,666,2
Data 5027,666,2
Data 5059,666,2
Data 5091,666,2
Data 5123,666,2
Data 5155,666,2
Data 5187,666,2

.CoinLevel2
Data 35
Data 5375,698,1
Data 5343,634,2
Data 4315,698,1
Data 5343,698,2
Data 5155,570,1
Data 5123,570,1
Data 5059,570,1
Data 5027,570,1
Data 4903,570,3
Data 4803,570,2
Data 4803,602,2
Data 4803,634,2
Data 4803,666,2
Data 4735,506,3
Data 5183,122,4
Data 4555,442,3
Data 4327,442,3
Data 4479,451,2
Data 4479,419,2
Data 4479,387,2
Data 4223,666,1
Data 4035,602,3
Data 3623,570,2
Data 3527,666,4
Data 3239,538,2
Data 3199,250,4
Data 2979,634,1
Data 2787,666,3
Data 3039,506,3
Data 3167,666,2
Data 3235,666,1
Data 2439,602,3
Data 2307,666,2
Data 2271,282,2
Data 1919,314,2

.CoinLevel3
Data 52
Data 31,250,1
Data 35,410,2
Data 259,378,2
Data 259,346,2
Data 259,314,2
Data 259,282,2
Data 259,442,3
Data 25,666,2
Data 255,602,3
Data 447,602,3
Data 383,602,3
Data 639,378,2
Data 391,218,1
Data 359,282,2
Data 323,346,3
Data 607,602,2
Data 1063,570,3
Data 991,570,1
Data 991,538,2
Data 1239,666,2
Data 1387,666,3
Data 1571,666,3
Data 1699,570,3
Data 1607,506,3
Data 1443,410,5
Data 2051,666,1
Data 2083,666,1
Data 2115,666,1
Data 2147,666,1
Data 2179,666,1
Data 2211,666,1
Data 2275,634,2
Data 2171,474,2
Data 1927,410,1
Data 1895,346,2
Data 1859,282,3
Data 2399,90,4
Data 2751,602,1
Data 2824,442,2
Data 2911,410,3
Data 3007,570,2
Data 3207,602,1
Data 3147,442,2
Data 3111,346,3
Data 3459,634,2
Data 3555,634,3
Data 3683,634,1
Data 3715,634,1
Data 3747,634,1
Data 3935,602,3
Data 3843,570,2
Data 4415,378,5

.CoinLevel4
Data 15
Data 5663,698,1
Data 5639,634,2
Data 5599,570,3
Data 5215,314,3
Data 5151,666,1
Data 5119,634,1
Data 5087,602,1
Data 5055,570,2
Data 4835,378,3
Data 4931,346,3
Data 5155,218,4
Data 4255,506,3
Data 4223,474,3
Data 4191,442,3
Data 4159,410,5

.EnergyLevelTutorial
Data 1	; 1=Sandwich, 2=Cheatpaper
Data 400,736,1	

.EnergyLevel1
Data 3
Data 3861,671,1
Data 5697,575,1
Data 863,159,2

.EnergyLevel2
Data 7
Data 4791,447,1
Data 5123,639,1
Data 4351,671,2
Data 4223,575,1
Data 3491,255,1
Data 2651,543,2
Data 2531,735,1

.EnergyLevel3
Data 13
Data 31,351,1
Data 355,351,1
Data 767,543,1
Data 1275,511,1
Data 1339,511,1
Data 1535,511,1
Data 1635,575,2
Data 2083,447,1
Data 1951,127,1
Data 2975,351,1
Data 2975,383,1
Data 2975,415,1
Data 3795,575,2

.EnergyLevel4
Data 2
Data 5247,319,2
Data 5279,319,2

.EnergyLevelAbi1 ;3=Energy Drop
Data 14
Data 1311,447,3
Data 1279,639,3
Data 895,703,3
Data 1701,639,3
Data 2015,575,3
Data 2137,607,3
Data 2685,671,2
Data 2719,319,3
Data 3427,735,3
Data 3395,735,3
Data 3427,703,2
Data 3459,415,3
Data 4191,287,3
Data 4251,639,3

.EnergyLevelAbi2
Data 5
Data 65,223,3
Data 33,223,2
Data 931,223,3
Data 39,735,3
Data 769,479,3

.MathItemsLevelTutorial
Data 1
Data 200,736,1

.MathItemsLevel1
Data 10
Data 607,442,1
Data 711,442,2
Data 1035,442,3
Data 839,698,4
Data 1343,442,5
Data 1443,602,6
Data 1379,666,7
Data 1819,602,8
Data 2367,730,9
Data 1535,186,10

.EnglishItemsLevel1
Data 4
Data 2439,479,11
Data 2599,703,12
Data 2799,575,13
Data 3135,191,14

.HistoryItemsLevel1
Data 7
Data 3423,543,15
Data 3487,543,16
Data 3551,543,17
Data 3779,287,18
Data 3747,703,19
Data 4195,735,20
Data 4463,735,21

.GermanItemsLevel2
Data 6
Data 5635,703,22
Data 5375,383,23
Data 4891,447,24
Data 5155,639,25
Data 4423,479,26
Data 4039,543,27

.SportItemsLevel2
Data 8
Data 3843,735,28
Data 3423,671,29
Data 3583,223,30
Data 2979,543,31
Data 3363,671,32
Data 3203,575,33
Data 2835,639,34
Data 2559,607,35

.GeoItemsLevel2
Data 6
Data 2371,639,36
Data 2335,447,37
Data 2083,415,38
Data 2019,159,39
Data 1951,735,40
Data 1823,479,41

.MusicItemsLevel3
Data 8
Data 59,255,42
Data 31,575,43
Data 511,479,44
Data 487,351,45
Data 439,159,46
Data 1059,543,47
Data 863,383,48
Data 1439,607,49

.ChemItemsLevel3
Data 6
Data 2111,127,50
Data 2147,447,51
Data 2211,447,52
Data 2127,607,53
Data 2463,543,54
Data 2567,735,55

.CompScienceItemsLevel3
Data 6
Data 3071,383,56
Data 2963,671,57
Data 3967,639,58
Data 4287,607,59
Data 4547,287,60
Data 3075,319,61

.ItemsLevel4
Data 9
Data 5411,511,6
Data 5379,671,27
Data 5251,447,55
Data 5155,319,12
Data 5023,639,42
Data 4871,479,20
Data 4595,639,30
Data 4323,575,36
Data 3971,511,61

.ItemsLevelAbi1
Data 12
Data 63,159,62
Data 1183,447,63
Data 1315,703,64
Data 1791,639,65
Data 1965,543,66
Data 2339,639,67
Data 2691,415,68
Data 3011,479,69
Data 3135,383,70
Data 4159,255,71
Data 4035,703,72
Data 4640,639,73

.ItemsLevelAbi2
Data 7
Data 479,735,80
Data 193,607,77
Data 351,319,76
Data 479,287,75
Data 479,415,79
Data 647,543,78
Data 671,351,74

.LessEnergyTutorial
Data 1
Data 600,736,1

.LessEnergyLevel1
Data 10
Data 787,447,1
Data 1907,607,1
Data 3455,639,1
Data 3519,639,1
Data 3743,735,1
Data 4895,735,1
Data 4959,735,1
Data 5023,735,1
Data 5087,735,1
Data 5151,735,1

.LessEnergyLevel2 ;sort: 1-Toilet, 2-Food, 3-Ashtray
Data 8
Data 5407,735,1
Data 5247,383,1
Data 4747,447,1
Data 5095,575,1
Data 3139,575,1
Data 2523,575,1
Data 2275,575,1
Data 2257,735,1

.LessEnergyLevel3
Data 27
Data 68,735,1
Data 291,735,2
Data 383,735,1
Data 447,735,1
Data 383,479,1
Data 575,223,2
Data 1023,479,1
Data 1223,607,1
Data 1255,607,1
Data 1287,607,1
Data 1319,607,1
Data 1351,607,1
Data 1383,607,1
Data 1415,607,1
Data 1479,607,1
Data 1537,607,1
Data 2239,543,1
Data 2047,511,2
Data 2147,511,2
Data 2399,191,2
Data 2431,191,2
Data 2431,447,1
Data 2495,447,2
Data 1723,671,2
Data 3167,543,1
Data 3267,735,2
Data 2911,447,1

.LessEnergyLevel4
Data 9
Data 5567,607,3
Data 5375,415,1
Data 5347,607,2
Data 5031,703,3
Data 5123,255,1
Data 4758,575,1
Data 4726,607,1
Data 4703,639,1
Data 4547,639,3

.LessEnergyLevelAbi1
Data 50
Data 579,607,2
Data 611,575,1
Data 793,543,2
Data 513,415,1
Data 769,671,2
Data 736,639,2
Data 927,447,1
Data 1055,447,1
Data 1315,735,3
Data 1283,735,3
Data 1251,735,3
Data 1187,735,3
Data 1155,735,3
Data 1123,735,3
Data 1091,735,3
Data 1059,735,3
Data 1027,735,3
Data 1599,735,3
Data 1599,671,3
Data 1599,607,3
Data 1727,575,1
Data 1759,639,2
Data 1923,575,2
Data 2049,735,1
Data 2079,735,3
Data 2243,607,1
Data 2307,703,1
Data 2367,575,3
Data 2399,575,3
Data 2362,671,1
Data 2362,639,1
Data 2623,575,2
Data 2919,383,2
Data 2979,543,2
Data 3011,543,2
Data 3043,543,2
Data 2979,575,1
Data 3011,575,1
Data 3042,575,1
Data 2947,607,1
Data 3011,607,1
Data 3075,607,1
Data 3139,319,1
Data 3203,255,3
Data 3263,191,2
Data 3647,511,3
Data 4097,319,1
Data 4097,287,1
Data 3839,735,1
Data 4127,735,2

.LessEnergyLevelAbi2
Data 17
Data 193,223,2
Data 643,703,1
Data 611,703,1
Data 579,703,1
Data 227,639,3
Data 259,639,1
Data 259,607,1
Data 319,319,1
Data 383,319,1
Data 479,351,3
Data 479,447,3
Data 479,479,3
Data 479,511,3
Data 615,511,2
Data 647,511,2
Data 679,511,2
Data 705,415,3

.MonsterLevelTutorial
Data 2
Data 1,1000,736,1,8,1,1000,100
Data 2,1230,736,1,8,1,1230,100

.MonsterLevel1 ;Monstertype, x, y, direction,anim_counter,frame,start_x  ==>1=lazy, 2=naughty, 3=zero, 4=honk
Data 10
Data 1,919,447,1,8,1,919,100
Data 2,1047,735,1,8,1,1047,100
Data 1,1527,735,1,8,1,1527,100
Data 1,1891,735,1,8,1,1891,100
Data 2,1655,607,1,8,1,1655,100
Data 1,2719,735,1,8,1,2719,100
Data 1,3491,735,1,8,1,3491,100
Data 1,4407,735,1,8,1,4407,100
Data 1,4471,735,1,8,1,4471,100
Data 1,4535,735,1,8,1,4535,100

.MonsterLevel2
Data 10
Data 1,5547,639,1,8,1,5547,100
Data 1,5155,223,1,8,1,5155,100
Data 1,5219,223,1,8,1,5219,100
Data 1,5043,735,1,8,1,5043,100
Data 1,4419,735,1,8,1,4419,100
Data 2,4039,735,1,8,1,4039,100
Data 2,3459,735,1,8,1,3459,100
Data 1,3587,735,1,8,1,3587,100
Data 1,3407,255,1,8,1,3407,100
Data 1,2131,511,1,8,1,2131,100

.MonsterLevel3
Data 16
Data 1,91,479,1,8,1,91,100
Data 2,395,735,1,8,1,395,100
Data 3,747,383,1,8,1,747,100
Data 1,1223,671,1,8,1,1223,100
Data 1,1351,671,1,8,1,1351,100
Data 2,1479,671,1,8,1,1479,100
Data 3,1607,671,1,8,1,1607,100
Data 1,1643,447,1,8,1,1643,100
Data 1,2127,607,1,8,1,2127,100
Data 3,2019,191,1,8,1,2019,100
Data 1,2395,735,1,8,1,2395,100
Data 1,2587,735,1,8,1,2587,100
Data 2,3763,511,1,8,1,3763,100
Data 2,4075,639,1,8,1,4075,100
Data 1,3967,703,1,8,1,3967,100
Data 1,4403,479,1,8,1,4403,100

.MonsterLevel4
Data 13
Data 1,5423,735,1,8,1,5423,100
Data 1,5487,735,1,8,1,5487,100
Data 1,5551,735,1,8,1,5551,100
Data 3,5491,511,1,8,1,5491,100
Data 2,5211,735,1,8,1,5211,100
Data 2,5139,415,1,8,1,5139,100
Data 3,4899,479,1,8,1,4899,100
Data 1,5055,319,1,8,1,5055,100
Data 1,4515,735,1,8,1,4515,100
Data 3,4403,575,1,8,1,4403,100
Data 1,3739,735,1,8,1,3739,100
Data 3,3547,735,1,8,1,3547,100
Data 2,3643,735,1,8,1,3643,100

.MonsterLevelAbi1
Data 35
Data 1,155,735,1,8,1,155,100
Data 3,407,639,1,8,1,407,100
Data 1,407,639,1,8,1,407,100
Data 3,761,543,1,8,1,761,100
Data 4,363,351,1,8,1,761,100
Data 4,215,351,1,8,1,215,100
Data 2,748,735,1,8,1,748,100
Data 3,1023,287,1,8,1,1023,100
Data 3,1235,639,1,8,1,1235,100
Data 3,1647,735,1,8,1,1647,100
Data 3,1823,735,1,8,1,1823,100
Data 4,1989,639,1,8,1,1989,100
Data 1,2123,735,1,8,1,2123,100
Data 1,2155,735,1,8,1,2155,100
Data 1,2187,735,1,8,1,2187,100
Data 4,2653,671,1,8,1,2653,100
Data 1,2643,415,1,8,1,2643,100
Data 4,2783,383,1,8,1,2783,100
Data 1,2831,671,1,8,1,2831,100
Data 3,2759,735,1,8,1,2759,100
Data 4,3263,735,1,8,1,3263,100
Data 4,3335,543,1,8,1,3335,100
Data 3,3203,383,1,8,1,3203,100
Data 4,3375,415,1,8,1,3375,100
Data 4,3527,735,1,8,1,3527,100
Data 4,3655,735,1,8,1,3655,100
Data 3,3829,543,1,8,1,3829,100
Data 1,4093,511,1,8,1,4093,100
Data 1,4157,511,1,8,1,4157,100
Data 3,4247,575,1,8,1,4247,100
Data 3,4151,575,1,8,1,4151,100
Data 4,3931,735,1,8,1,3931,100
Data 4,4519,287,1,8,1,4519,100
Data 4,4647,287,1,8,1,4647,100
Data 3,4679,287,1,8,1,4679,100

.MonsterLevelAbi2
Data 7
Data 3,859,223,1,8,1,859,100
Data 4,479,735,1,8,1,479,100
Data 4,479,735,1,8,1,479,100
Data 1,207,735,1,8,1,207,100
Data 1,107,735,1,8,1,107,100
Data 3,231,479,1,8,1,231,100
Data 4,483,607,1,8,1,483,100

.PauseAbi1 ; 1=8th, 2=4th
Data 7
Data 287,639,1
Data 991,575,2
Data 2157,671,1
Data 2751,575,2
Data 3427,543,1
Data 4159,223,2
Data 4035,735,1

.PauseAbi2
Data 1
Data 163,479,2

.TeacherLevelTutorial
Data 1
Data 2130,608,0,1,1,2130

.TeacherLevel1
Data 2
Data 2213,735,0,1,1,2213
Data 5525,223,0,1,1,5525

.TeacherLevel2
Data 2
Data 3483,607,0,1,1,3483
Data 1767,735,0,1,1,1767

.TeacherLevel3
Data 2
Data 1883,735,0,1,1,1883
Data 3451,575,0,1,1,3451

.TeacherLevel4
Data 1
Data 4083,415,0,1,1,4083

.SneakLevelTutorial
Data 1
Data 2230,608,0,1,1,2230

.SneakLevel1
Data 1
Data 2989,735,0,1,1,2989

.SneakLevel2
Data 1
Data 3087,735,0,1,1,3087

.SneakLevel3
Data 2
Data 2867,735,0,1,1,2867
Data 4491,319,0,1,1,4491

.DoorLevelTutorial
Data 2528,608,1

.DoorLevel1
Data 5279,127,1

.DoorLevel2
Data 1603,735,1

.DoorLevel3
Data 4515,735,1

.DoorLevel4
Data 3423,735,1

.DoorLevelAbi1
Data 4707,287,1

.DoorLevelAbi2
Data 647,383,1

.BrickLevelTutorial
Data 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,0,1,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,0,1,0,0,0,0,1,0,1,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
Data 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0

.BrickLevel1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1 
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,1,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,1,0,1,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,1,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,0,1,1,1,1,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,1,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,1,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,0,0,1,0,1,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,1,0,0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1

.BrickLevel2
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,1,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,1,1,0,0,0,0,1,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,0,1,1,0,0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,1,0,0,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1 
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,0,0,0,1,0,0,1,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,1,1,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,1,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,1,0,0,0,1,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,1,1,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,0,1,0,0,1,0,0,0,0,0,0,1,0,0,1,0,0,1,0,0,0,1,1,1,0,0,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1,1,0,0,1,1,1,0,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1,0,0,1,0,0,0,0,1,1,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,1,1,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,0,1,0,0,1,1,1,1,1,1,1,1,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,1,1,0,0,0,0,0,0,1,0,0,0,0,0,0,1,1,1,0,1,1,1,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,1,0,0,1,1,1,0,1,1,1,1,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,1,0,0,0,0,0,0,0,1,1,1,0,0,0,0,1,0,0,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,1,0,0,0,0,0,0,0,0,1,0,0,0,1
Data 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1

.BrickLevel3
Data 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1
Data 1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,1,1,0,1,1,0,0,0,1,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,1,0,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,1,1,0,1,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,1,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,1,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,1,1,1,1,1,0,0,1,1,1,0,1,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1,1,1,1,1,1,0,0,1,1,1,1,1,0,1,1,0,0,0,0,0,0,0,1,0,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,1,0,0,0,0,0,0,0,1,0,1,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,1,0,0,0,0,1,0,0,0,0,0,1,1,1,1,1,1,1,0,0,0,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,1,0,1,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,1,1,1,1,1,1,1,1,0,1,1,1,1,0,1,1,1,1,1,0,1,1,1,1,1,1,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,1,1,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,1,0,1,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1

.BrickLevel4
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1
Data 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1

.BrickLevelAbi2
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,1,1,1,1,1,0,0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,1,0,0,0,0,1,0,0,0,1,0,1,0,0,0,1,1,0,0,0,1,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,1,0,0,0,1,0,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,1,1,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,1,0,0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1,1,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1

.BrickLevelAbi1
Data 1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,1,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1,1,1,1,0,1,1,1,0,0,0,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,1,1,1,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,1,1,1,1,1,1,0,0,0,0,1,0,1,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,1,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1,1,0,0,0,0,1,0,0,0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,1,0,0,1,0,0,0,0,0,0,1,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0,0,0,1,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,1,0,1,0,0,0,0,1,0,0,0,0,1,0,0,0,1,0,0,1,1,1,1,0,0,0,0,1,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,1,0,0,1,1,1,1,1,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,0,0,0,1,0,0,1,0,0,1,1,1,1,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,1,0,0,1,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,1,0,0,1,0,0,0,0,0,0,1,0,0,0,1,0,1,0,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,1,1,1,1,0,0,0,0,1,0,0,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,1,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0,1,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
Data 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1
;~IDEal Editor Parameters:
;~C#Blitz3D