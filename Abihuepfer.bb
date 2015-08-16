AppTitle("Abi-Huepfer 1.1") ; Title of the game and version

; Graphics, Buffer and Random generator
Global screenWidth = 1024
Global screenHeight = 768
Graphics(screenWidth,screenHeight,32,2)
SetBuffer(BackBuffer())
SeedRnd(MilliSecs())

Global frameTimer = CreateTimer(30)	; frametime: 30 Hz

;load all static graphics
Local loadingDir = ReadDir("gfx") 
Repeat
	Local currentFile$ = NextFile$(loadingDir) 
	If(currentFile$="") Then Exit 
	If(FileType("gfx/" + currentFile$)) Then 
		Local img.Image = New Image
		img\obj = LoadImage("gfx/" + currentFile$)
	EndIf
Forever 
CloseDir(loadingDir)
DebugLog("loading done")



;stream for IO
Global stream


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
Global door = LoadAnimImage("gfx/anim/Door.bmp",32,32,0,2)	; the level door
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
Global player = LoadAnimImage("gfx/anim/player.bmp",32,32,0,8)	; player, movable
MaskImage(player, 255, 0, 255 )
Global teacher = LoadAnimImage("gfx/anim/teacher.bmp",32,32,0,6)	; teacher, movable
MaskImage(teacher, 255, 0, 255)
Global sneak = LoadAnimImage("gfx/anim/sneak.bmp",32,32,0,6)	; the evil sneak, movable
MaskImage(sneak, 255, 0, 255)

;Monster
Global monsterLazy = LoadAnimImage("gfx/anim/monsterLazy.bmp",32,32,0,4)	; lazy monster
MaskImage(monsterLazy, 255, 0, 255)
Global monsterHonk = LoadAnimImage("gfx/anim/monsterHonk.bmp",32,32,0,6)	; honk, movable
MaskImage(monsterHonk, 255, 0, 255)
Global monsterNaughty = LoadAnimImage("gfx/anim/monsterNaughty.bmp",32,32,0,9)	; naughty, movable
MaskImage(monsterNaughty, 255, 0, 255)
Global monsterZero = LoadAnimImage("gfx/anim/monsterZeroBock.bmp",32,32,0,4)	; 0-bock-monster
MaskImage(monsterZero, 255, 0, 255)


;dimensionate the surface for the bricks
Dim actualLevel(182,25)
Global brickx, bricky ; coordinates of the bricks


;in the Trade Function
Global choice$
Global doTrade = 1 ; whether it's allowed to trade or not
Global nextStep = 0 ; next step in the function
Global point = 0 ; how many points the player can get

;the two fonts
Global tutFont = LoadFont("Comic Sans MS",13) ; number = size in dpi
Global normFont = LoadFont("Arial",12)

;level specific variables
Global level = 1 ;start with the tutorial
Global start = 0
Global didCollide = 0; variable to make sure that player cant press "enter" without having reached next target

;monster variables
Global monster_Frametime 
Global m_lazy_frame, m_naughty_frame, m_zero_frame, m_honk_frame
Global m_lazy_time, m_naughty_time, m_zero_time, m_honk_time
Global m_lazy_move, m_naughty_move, m_zero_move, m_honk_move
Global new_monster.Monster ; to use this var in other functions too

;general variables
Global moveAny = 1 ; all other objects moving
Global player_move = 0 ; the player moving
Global player_Energy = 50 ; player energy
Global score = 0	; player score in coins
Global lives = 5	; number of lives
Global creditPoints ; ... and credit points
Global pointMinimum ; the minimum of points to finish the level

;variables for the jump function
Global jump
Global gravity
Global posy_temp
Global jumpAllow = 1

;variables for the tutorial
Global tut = 0 ; whether tutorial level is played now
Global text_var = 0 ; what text shall be shown
Global doTut = 1 ; start with the tutorial? (1=yes, 0=no)

;player specific variables
Global doDrawPlayer = 1  ; shall the program draw the player?
Global player_posx = (screenWidth/2) ; \ positioned in the middle of the screen
Global player_posy = (screenHeight/2) ; /
Global frame = 0		 ; the frame 
Global time = 0			 ; checks when a frame has to be changed
Global movingRight ; whether he moves in right or left direction
Global movX = -288 ; these variables change if the player is moving
Global movY = 480 ; starting point level 1: right bottom

;Abi-specific
Global mark#	; what mark gets the player at the end?
Global abiMessage	; shows the message before the two Abi-levels

;checks if the player can shoot
Global shootAble = 1 
Global shootTime = 0

;messages on the screen
Global mathTime ; how long an item message is shown on the screen
Global msg_Item$ ;variable shows the message for each item
Global message
Global start_message = 0 

;to control the pauses in the Abi-Levels
Global pauseTime
Global timeValue

;the sounds
Global jumpSound = LoadSound("sfx/sfx/Jump.wav") ; jump
Global coinCollect = LoadSound("sfx/CoinCollect.wav") ; player collecting coin
Global itemCollect = LoadSound("sfx/ItemCollect.wav") ; player collecting item
Global levelChange = LoadSound("sfx/LevelChange.wav") ; changing level
Global throwBook = LoadSound("sfx/ThrowBook.wav")	  ; book is thrown
Global eat = LoadSound("sfx/Eat.wav")				  ; eats a sandwich
Global monsterDie = LoadSound("sfx/MonsterDie.wav")	  ; monster disappears
Global levelAgain = LoadSound("sfx/LevelAgain.wav")	  ; when restarting a level
Global backGround = PlayMusic("sfx/Jumpin' in the School.mid") ; background melody
ChannelVolume(backGround,0.33)

;the following constants include the text for the tutorial-level
Dim tutText$(60)
stream = ReadFile("txt/tutorial.txt")
Local i
For i=0 To 60
	tutText(i) = ReadLine(stream)
Next
CloseFile(stream)

; these constants show the text for the Abi-message
Dim abiText(32)
stream = ReadFile("txt/abitur.txt")
For i=0 To 32
	abiText(i) = ReadLine(stream)
Next
CloseFile(stream)

;item texts
Dim itemText(79)
stream = ReadFile("txt/items.txt")
For i=0 To 79
	itemText(i) = ReadLine(stream)
Next
CloseFile(stream)

;credit texts
Dim creditsText(15)
stream = ReadFile("txt/credits.txt")
For i=0 To 15
	creditsText(i) = ReadLine(stream)
Next
CloseFile(stream)


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

ClsColor(0,0,0)

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
	Flip(0) 		;change the two buffers
Until(KeyHit(1)) ;until esc is hit
End()
;=== END OF MAIN LOOP


;draws the player and checks his lives and energy
Function DrawPlayer()
	If(doDrawPlayer=1) Then
		DrawImage player, player_posx, player_posy, frame
	EndIf 
	If(player_Energy>100) Then player_Energy = 100 ; no more than 100% energy
	If(creditPoints<0) Then creditPoints = 0 ; no less than 0 points
End Function


Function MovePlayer()
	If(player_move <> 0) Then
		If(KeyDown(205)) Then 
			Anim_Player_Right() ; animates the player
			movingRight = 1
			If(actualLevel((player_posx+32+movX)/32, (player_posy+movY)/32)=0) Then
				movX = movX+4 ;Right
			EndIf
		ElseIf(KeyDown(203)) Then 
			Anim_Player_Left()
			movingRight = 0
			If(actualLevel((player_posx+movX)/32, (player_posy+movY)/32)=0) Then
				movX = movX-4 ;Left
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
	If(frame<4) Then frame = 4
	If(MilliSecs()-time>150) Then
		time = MilliSecs()
		frame = frame+1
	EndIf
	If(frame>7) Then frame = 4
End Function

Function DrawCoin()
	Local newcoin.Coins
	For newcoin.Coins = Each Coins
		If(newcoin\Sort=1) Then ;ask which coin it is (1,5,10,50-euro or credit card)
			DrawImage coin, ((newcoin\Coinx)-movX), ((newcoin\Coiny)-movY)
		ElseIf(newcoin\Sort=2) Then
			DrawImage coin_5, ((newcoin\Coinx)-movX), ((newcoin\Coiny)-movY)
		ElseIf newcoin\Sort = 3 Then
			DrawImage coin_10, ((newcoin\Coinx)-movX), ((newcoin\Coiny)-movY)
		ElseIf newcoin\Sort = 4 Then
			DrawImage purse,((newcoin\Coinx)-movX),((newcoin\Coiny)-movY)
		ElseIf newcoin\Sort = 5 Then
			DrawImage creditcard,((newcoin\Coinx)-movX),((newcoin\Coiny)-movY)
		EndIf 
	Next
End Function

Function CoinCollision()
	For newcoin.Coins = Each Coins
		Select(newcoin\sort)
		Case 1
		If ImagesCollide (coin, ((newcoin\coinx)-movX), ((newcoin\coiny)-movY), 0, player, player_posx, player_posy, frame) Then
			Delete newcoin.Coins
			PlaySound coinCollect
			score = score + 1
		EndIf	
		Case 2
		If ImagesCollide (coin_5, ((newcoin\coinx)-movX), ((newcoin\coiny)-movY), 0, player, player_posx, player_posy, frame) Then
			Delete newcoin.Coins
			PlaySound coinCollect
			score = score + 5
		EndIf		
		Case 3
		If ImagesCollide (coin_10, ((newcoin\coinx)-movX), ((newcoin\coiny)-movY), 0, player, player_posx, player_posy, frame) Then
			Delete newcoin.Coins
			PlaySound coinCollect
			score = score + 10
		EndIf
		Case 4
		If ImagesCollide(purse, ((newcoin\coinx)-movX), ((newcoin\coiny)-movY), 0, player, player_posx, player_posy, frame) Then
			Delete newcoin.Coins
			PlaySound coinCollect
			score = score + 50
		EndIf 
		Case 5
		If ImagesCollide(creditcard, ((newcoin\coinx)-movX), ((newcoin\coiny)-movY), 0, player, player_posx, player_posy, frame) Then
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
				DrawImage brick,((brickx*32)-movX),((bricky*32)-movY) ; because the tile has the size of 32*32 pixels
			EndIf
		Next
	Next
End Function

Function DrawEnergyItems()
	For new_energy_object.energys = Each Energys
		Select (new_energy_object\sort)
			; 1: Sandwich, 2: Spicker
			Case 1
				DrawImage(sandwich,((new_energy_object\en_x)-movX),((new_energy_object\en_y)-movY))
			Case 2
				DrawImage(cheatpaper,((new_energy_object\en_x)-movX),((new_energy_object\en_y)-movY))
			Case 3
				DrawImage(energy,((new_energy_object\en_x)-movX),((new_energy_object\en_y)-movY))
		End Select
	Next
End Function 

Function EnergyItemsCollision()
	If(tut=0) Then 	; if current level is NOT tutorial level
		For new_energy_object.energys = Each Energys
			Select(new_energy_object\sort)
				Case 1
					If ImagesCollide(sandwich,((new_energy_object\en_x)-movX),((new_energy_object\en_y)-movY),0,player,player_posx,player_posy,0) Then
						player_Energy = player_Energy + 10
						PlaySound eat
						Delete new_energy_object
					EndIf
				Case 2
					If ImagesCollide(cheatpaper,((new_energy_object\en_x)-movX),((new_energy_object\en_y)-movY),0,player,player_posx,player_posy,0) Then
						player_Energy = player_Energy + 15
						Delete new_energy_object
					EndIf
				Case 3
					If ImagesCollide(energy,((new_energy_object\en_x)-movX),((new_energy_object\en_y)-movY),0,player,player_posx,player_posy,0) Then
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
			DrawImage root,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 2
			DrawImage urn,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 3
			DrawImage function0,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 4
			DrawImage function1,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 5
			DrawImage function2,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 6
			DrawImage function3,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 7
			DrawImage function4,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 8
			DrawImage function5,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 9
			DrawImage function6,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 10
			DrawImage function7,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 11
			DrawImage yeswecan,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 12
			DrawImage teatime,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 13
			DrawImage spo,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 14
			DrawImage usa,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 15
			DrawImage napoleon,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 16
			DrawImage hitler,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 17
			DrawImage honecker,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 18
			DrawImage fight,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 19
			DrawImage dates,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 20
			DrawImage germany,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 21
			DrawImage sed,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 22
			DrawImage goethe,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 23
			DrawImage schiller,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 24
			DrawImage lessing,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 25
			DrawImage parataxis,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 26
			DrawImage blackboard,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 27
			DrawImage duden,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 28
			DrawImage bars,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 29
			DrawImage rings,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 30
			DrawImage badminton,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 31
			DrawImage football,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 32
			DrawImage run,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 33
			DrawImage wallbars,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 34
			DrawImage stand,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 35
			DrawImage winnersteps,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 36
			DrawImage globe,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 37
			DrawImage atlas,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 38
			DrawImage weather,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 39
			DrawImage friends,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 40
			DrawImage geyser,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 41
			DrawImage watercyclus,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 42
			DrawImage note,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 43
			DrawImage guitar,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 44
			DrawImage notepaper,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 45
			DrawImage loudspeaker,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 46
			DrawImage piano,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 47
			DrawImage conductor,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 48
			DrawImage buzz,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 49
			DrawImage clefs,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 50
			DrawImage burner,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 51
			DrawImage testglass,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 52
			DrawImage nh3,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 53
			DrawImage goggles,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 54
			DrawImage kettle,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 55
			DrawImage c4,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 56
			DrawImage playray,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 57
			DrawImage joystick,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 58
			DrawImage pc_back,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 59
			DrawImage www,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 60
			DrawImage google,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 61
			DrawImage printer,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 62
			DrawImage abihelp,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 63
			DrawImage schillershead,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 64
			DrawImage mephisto,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 65
			DrawImage calculator,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 66
			DrawImage infinite,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 67
			DrawImage henning,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 68
			DrawImage dictionary,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 69
			DrawImage bratwurst,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 70
			DrawImage holyshit,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 71
			DrawImage electricapple,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 72
			DrawImage acid,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 73
			DrawImage pse,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 74
			DrawImage asia,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 75
			DrawImage europe,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 76
			DrawImage northamerica,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 77
			DrawImage southamerica,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 78
			DrawImage australia,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 79
			DrawImage africa,((newitem\school_x)-movX),((newitem\school_y)-movY)
		Case 80
			DrawImage antarctica,((newitem\school_x)-movX),((newitem\school_y)-movY)
		End Select
	Next
End Function 

Function SchoolItemsCollision()
	If tut = 0 Then
	For newitem.school = Each School
		Select (newitem\school_sort)
		Case 1
		If ImagesCollide(root,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 1
			creditPoints = creditPoints + 3
			PlaySound itemCollect
			Delete newitem.school 
		EndIf 
		Case 2
		If ImagesCollide(urn,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 2
			creditPoints = creditPoints + 4
			PlaySound itemCollect
			Delete newitem.school 
		EndIf
		Case 3
		If ImagesCollide(function0,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 3
			creditPoints = creditPoints + 5
			PlaySound itemCollect
			Delete newitem.school 
		EndIf
		Case 4
		If ImagesCollide(function1,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 4
			creditPoints = creditPoints + 7
			PlaySound itemCollect
			Delete newitem.school 
		EndIf
		Case 5
		If ImagesCollide(function2,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 5
			creditPoints = creditPoints + 6
			PlaySound itemCollect
			Delete newitem.school 
		EndIf
		Case 6
			If ImagesCollide(function3,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 6
			creditPoints = creditPoints + 8
			PlaySound itemCollect
			Delete newitem.school 
		EndIf
		Case 7
			If ImagesCollide(function4,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 7
			creditPoints = creditPoints + 9
			PlaySound itemCollect
			Delete newitem.school 
		EndIf
		Case 8
			If ImagesCollide(function5,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 8
			creditPoints = creditPoints + 10
			PlaySound itemCollect
			Delete newitem.school 
			EndIf
		Case 9
		If ImagesCollide(function6,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 9
			creditPoints = creditPoints + 12
			PlaySound itemCollect
			Delete newitem.school 
		EndIf
		Case 10
			If ImagesCollide(function7,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 10
			creditPoints = creditPoints + 15
			PlaySound itemCollect
			Delete newitem.school 
		EndIf
		Case 11
		If ImagesCollide(yeswecan,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 11
			creditPoints = creditPoints + 4
			PlaySound itemCollect
			Delete newitem.school
		EndIf 
		Case 12
		If ImagesCollide(teatime,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 12
			creditPoints = creditPoints + 6
			PlaySound itemCollect
			Delete newitem.school
		EndIf 
		Case 13
		If ImagesCollide(spo,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 13
			creditPoints = creditPoints + 9
			PlaySound itemCollect
			Delete newitem.school
		EndIf 
		Case 14
		If ImagesCollide(usa,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 14
			creditPoints = creditPoints + 11
			PlaySound itemCollect
			Delete newitem.school
		EndIf 
		Case 15
		If ImagesCollide(napoleon,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 15
			creditPoints = creditPoints + 4
			PlaySound itemCollect
			Delete newitem.school
		EndIf 
		Case 16
		If ImagesCollide(hitler,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 16
			creditPoints = creditPoints + 4
			PlaySound itemCollect
			Delete newitem.school
		EndIf 
		Case 17
		If ImagesCollide(honecker,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 17
			creditPoints = creditPoints + 4
			PlaySound itemCollect
			Delete newitem.school
		EndIf 
		Case 18
		If ImagesCollide(fight,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 18
			creditPoints = creditPoints + 7
			PlaySound itemCollect
			Delete newitem.school
		EndIf 
		Case 19
		If ImagesCollide(dates,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 19
			creditPoints = creditPoints + 9
			PlaySound itemCollect
			Delete newitem.school
		EndIf 
		Case 20
		If ImagesCollide(germany,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 20
			creditPoints = creditPoints + 13
			PlaySound itemCollect
			Delete newitem.school
		EndIf 
		Case 21
		If ImagesCollide(sed,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 21
			creditPoints = creditPoints + 8
			PlaySound itemCollect
			Delete newitem.school
		EndIf 
		Case 22
		If ImagesCollide(goethe,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 22
			creditPoints = creditPoints + 3
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 23
		If ImagesCollide(schiller,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 23
			creditPoints = creditPoints + 5
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 24
		If ImagesCollide(lessing,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 24
			creditPoints = creditPoints + 6
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 25
		If ImagesCollide(parataxis,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 25
			creditPoints = creditPoints + 8
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 26
			If ImagesCollide(blackboard,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 26
			creditPoints = creditPoints + 16
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 27
			If ImagesCollide(duden,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 27
			creditPoints = creditPoints + 9
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 28
		If ImagesCollide(bars,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 28
			creditPoints = creditPoints + 5
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 29
		If ImagesCollide(rings,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 29
			creditPoints = creditPoints + 5
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 30
		If ImagesCollide(badminton,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 30
			creditPoints = creditPoints + 8
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 31
		If ImagesCollide(football,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 31
			creditPoints = creditPoints + 10
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 32
		If ImagesCollide(run,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 32
			creditPoints = creditPoints + 11
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 33
		If ImagesCollide(wallbars,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 33
			creditPoints = creditPoints + 15
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 34
		If ImagesCollide(stand,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 34
			creditPoints = creditPoints + 13
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 35
		If ImagesCollide(winnersteps,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 35
			creditPoints = creditPoints + 9
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 36
		If ImagesCollide(globe,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 36
			creditPoints = creditPoints + 6
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 37
		If ImagesCollide(atlas,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 37
			creditPoints = creditPoints + 9
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 38
		If ImagesCollide(weather,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 38
			creditPoints = creditPoints + 14
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 39
		If ImagesCollide(friends,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 39
			creditPoints = creditPoints + 20
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 40
		If ImagesCollide(geyser,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 40
			creditPoints = creditPoints + 11
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 41
		If ImagesCollide(watercyclus,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 41
			creditPoints = creditPoints + 12
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 42
		If ImagesCollide(note,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 42
			creditPoints = creditPoints + 4
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 43
		If ImagesCollide(guitar,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 43
			creditPoints = creditPoints + 7
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 44
		If ImagesCollide(notepaper,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 44
			creditPoints = creditPoints + 8
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 45
		If ImagesCollide(loudspeaker,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 45
			creditPoints = creditPoints + 11
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 46
		If ImagesCollide(piano,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 46
			creditPoints = creditPoints + 10
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 47
		If ImagesCollide(conductor,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 47
			creditPoints = creditPoints + 12
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 48
		If ImagesCollide(buzz,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 48
			creditPoints = creditPoints + 9
			PlaySound itemCollect
			Delete newitem.school
		EndIf	
		Case 49
		If ImagesCollide(clefs,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 49
			creditPoints = creditPoints + 14
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 50
		If ImagesCollide(testglass,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 50
			creditPoints = creditPoints + 9
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 51
		If ImagesCollide(burner,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 51
			creditPoints = creditPoints + 4
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 52
		If ImagesCollide(nh3,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 52
			creditPoints = creditPoints + 12
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 53
		If ImagesCollide(goggles,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 53
			creditPoints = creditPoints + 10
			PlaySound itemCollect
			Delete newitem.school
			EndIf
		Case 54
		If ImagesCollide(kettle,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 54
			creditPoints = creditPoints + 14
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 55
		If ImagesCollide(c4,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 55
			creditPoints = creditPoints + 7
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 56
			If ImagesCollide(playray,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 56
			creditPoints = creditPoints + 13
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 57
		If ImagesCollide(joystick,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 57
			creditPoints = creditPoints + 7
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 58
		If ImagesCollide(pc_back,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 58
			creditPoints = creditPoints + 8
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 59
		If ImagesCollide(www,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 59
			creditPoints = creditPoints + 7
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 60
		If ImagesCollide(google,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 60
			creditPoints = creditPoints + 10
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 61
		If ImagesCollide(printer,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 61
			creditPoints = creditPoints + 13
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 62
		If ImagesCollide(abihelp,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 62
			creditPoints = creditPoints + 30
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 63
		If ImagesCollide(schillershead,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 63
			creditPoints = creditPoints + 30
			PlaySound itemCollect
			Delete newitem.school
		EndIf	
		Case 64
		If ImagesCollide(mephisto,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 64
			creditPoints = creditPoints + 30
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 65
		If ImagesCollide(dictionary,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 65
			creditPoints = creditPoints + 30
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 66
		If ImagesCollide(bratwurst,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 66
			creditPoints = creditPoints + 30
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 67
		If ImagesCollide(holyshit,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 67
			creditPoints = creditPoints + 30
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 68
		If ImagesCollide(calculator,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 68
			creditPoints = creditPoints + 30
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 69
		If ImagesCollide(infinite,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 69
			creditPoints = creditPoints + 30
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 70
		If ImagesCollide(henning,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 70
			creditPoints = creditPoints + 30
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 71
		If ImagesCollide(electricapple,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 71
			creditPoints = creditPoints + 30
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 72
		If ImagesCollide(acid,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 72
			creditPoints = creditPoints + 30
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 73
		If ImagesCollide(pse,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 73
			creditPoints = creditPoints + 30
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 74
		If ImagesCollide(asia,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 74
			creditPoints = creditPoints + 10
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 75
		If ImagesCollide(europe,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 75
			creditPoints = creditPoints + 10
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 76
		If ImagesCollide(northamerica,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 76
			creditPoints = creditPoints + 10
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 77
		If ImagesCollide(southamerica,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 77
			creditPoints = creditPoints + 10
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 78
		If ImagesCollide(australia,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 78
			creditPoints = creditPoints + 10
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 79
		If ImagesCollide(africa,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
			message = 79
			creditPoints = creditPoints + 10
			PlaySound itemCollect
			Delete newitem.school
		EndIf
		Case 80
		If ImagesCollide(antarctica,((newitem\school_x)-movX),((newitem\school_y)-movY),0,player,player_posx,player_posy,0) Then
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
	For new_less_energy_object.less_energys = Each Less_energys
		Select(new_less_energy_object\less_en_sort)
		; 1=Toilet, 2=Food, 3=Ashtray
		Case 1
			DrawImage toilet,((new_less_energy_object\less_en_x)-movX),((new_less_energy_object\less_en_y)-movY)
		Case 2
			DrawImage food,((new_less_energy_object\less_en_x)-movX),((new_less_energy_object\less_en_y)-movY)
		Case 3
			DrawImage ashtray,((new_less_energy_object\less_en_x)-movX),((new_less_energy_object\less_en_y)-movY)
		End Select
	Next
End Function 

Function LessEnergyItemsCollision()
	If tut = 0 Then
		If (MilliSecs()-pauseTime > timeValue) Then
			For new_less_energy_object.less_energys = Each Less_energys
				Select (new_less_energy_object\less_en_sort)
				Case 1
					If ImagesCollide(toilet,((new_less_energy_object\less_en_x)-movX),((new_less_energy_object\less_en_y)-movY),0,player,player_posx,player_posy,0) Then
					player_Energy = player_Energy - 10
					Delete new_less_energy_object.less_energys
					EndIf 
				Case 2
					If ImagesCollide(food,((new_less_energy_object\less_en_x)-movX),((new_less_energy_object\less_en_y)-movY),0,player,player_posx,player_posy,0) Then
					player_Energy = player_Energy - 15
					Delete new_less_energy_object.less_energys
					EndIf 
				Case 3
					If ImagesCollide(ashtray,((new_less_energy_object\less_en_x)-movX),((new_less_energy_object\less_en_y)-movY),0,player,player_posx,player_posy,0) Then
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
		Select(new_monster\Monster_type)
			Case 1: DrawImage monsterLazy, (new_monster\Pos_x)-movX, (new_monster\Pos_y)-movY, new_monster\Frame
			Case 2 : DrawImage monsterNaughty, (new_monster\Pos_x)-movX, (new_monster\Pos_y)-movY, new_monster\Frame
			Case 3 : DrawImage monsterZero, (new_monster\Pos_x)-movX, (new_monster\Pos_y)-movY, new_monster\Frame
			Case 4 : DrawImage monsterHonk, (new_monster\Pos_x)-movX, (new_monster\Pos_y)-movY, new_monster\Frame
		End Select
	Next 	
End Function 

Function MoveMonsters()
	If(moveAny=1) Then
		If(MilliSecs()-pauseTime>timeValue) Then
			For new_monster.Monster = Each Monster
				If(new_monster\Monster_type=1) Then 
					If(new_monster\Direction=1) Then
						If(new_monster\Pos_x-new_monster\Start_x<=80) Then
							new_monster\Pos_x = new_monster\Pos_x+2
							If new_monster\Frame >3 Then new_monster\Frame = 0
							new_monster\Anim_counter = new_monster\Anim_counter -1
							If new_monster\Anim_counter = 0 Then
								new_monster\Anim_counter = 8
								new_monster\Frame = new_monster\Frame +1
								If new_monster\Frame = 4 Then new_monster\Frame = 0
							EndIf 
						EndIf 
						
						If(new_monster\Pos_x - new_monster\Start_x > 80) Then new_monster\Direction = 0 ; change left
					ElseIf new_monster\Direction = 0 Then
						If(new_monster\Pos_x - new_monster\Start_x >= -80) Then 
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
	Select level
		Case 1
			If(start=0) Then
				start = 1
				LoadLevel(1)
			EndIf 
		Case 2
			If start = 1 Then
				start = 0
				LoadLevel(2)
				ResumeChannel backGround
				ClsColor Rnd(0,255),Rnd(0,255),Rnd(0,255)
			EndIf 
		Case 3
			If start = 0 Then
				start = 1
				LoadLevel(3)
				ResumeChannel backGround
				ClsColor Rnd(0,255),Rnd(0,255),Rnd(0,255)
			EndIf 
		Case 4
			If start = 1 Then
				start = 0
				LoadLevel(4)
				ResumeChannel backGround
				ClsColor Rnd(0,255),Rnd(0,255),Rnd(0,255)
			EndIf
		Case 5
			If start = 0 Then
				start = 1
				LoadLevel(5)
				ResumeChannel backGround
				ClsColor Rnd(0,255),Rnd(0,255),Rnd(0,255)
			EndIf 
		Case 6
			If start = 1 Then
				start = 0
				ClsColor Rnd(0,255),Rnd(0,255),Rnd(0,255)
				LoadLevel(1)
				moveAny = 0
				player_move = 0
				doDrawPlayer = 0
			EndIf 
		TextAbitur()
		Case 7
			If start = 0 Then
				start = 1
				LoadLevel(6)
				ResumeChannel backGround
				ClsColor Rnd(0,255),Rnd(0,255),Rnd(0,255)
			EndIf
		Case 8
			If start = 1 Then
				start = 0
				lives = 3 ; three tries to finish the level
				LoadLevel(7)
				ResumeChannel backGround
				ClsColor Rnd(0,255),Rnd(0,255),Rnd(0,255)
			EndIf 
		Default 
			If start = 0 Then
				start = 1
				ClsColor Rnd(0,255),Rnd(0,255),Rnd(0,255)
				LoadLevel(1)
				moveAny = 0
				player_move = 0
				doDrawPlayer = 0
			EndIf 
			ShowAbi() 
	End Select

	;another important thing: if energy <= 0 then start last level again
	If player_Energy <= 0 Or KeyHit(68) Then
		If start = 1 Then
		start = 0
		PlaySound levelAgain
			If GivePos = 0 Then
			GivePos = 1
			Select level
				Case 2
				movX = MOVX_LVL1
				movY = Movy_Lvl1
				Case 3
				movX = MOVX_LVL2
				movY = Movy_Lvl2
				Case 4
				movX = MOVX_LVL3
				movY = Movy_Lvl3
				Case 5
				movX = MOVX_LVL4
				movY = Movy_Lvl4
				Case 6
				movX = Movx_Lvl5
				movY = Movy_Lvl5
				Case 7
				movX = Movx_Lvl6
				movY = Movy_Lvl6
				Case 8
				movX = Movx_Lvl7
				movY = Movy_Lvl7
			End Select 
			Delay 1000
			player_Energy = 100
			lives = lives - 1 
			ElseIf GivePos = 1 Then
				GivePos = 0
				Select level
				Case 2
				movX = MOVX_LVL1
				movY = Movy_Lvl1
				Case 3
				movX = MOVX_LVL2
				movY = Movy_Lvl2
				Case 4
				movX = MOVX_LVL3
				movY = Movy_Lvl3
				Case 5
				movX = MOVX_LVL4
				movY = Movy_Lvl4
				Case 6
				movX = Movx_Lvl5
				movY = Movy_Lvl5
				Case 7
				movX = Movx_Lvl6
				movY = Movy_Lvl6
				Case 8
				movX = Movx_Lvl7
				movY = Movy_Lvl7
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
				movX = MOVX_LVL1
				movY = Movy_Lvl1
				Case 3
				movX = MOVX_LVL2
				movY = Movy_Lvl2
				Case 4
				movX = MOVX_LVL3
				movY = Movy_Lvl3
				Case 5
				movX = MOVX_LVL4
				movY = Movy_Lvl4
				Case 6
				movX = Movx_Lvl5
				movY = Movy_Lvl5
				Case 7
				movX = Movx_Lvl6
				movY = Movy_Lvl6
				Case 8
				movX = Movx_Lvl7
				movY = Movy_Lvl7
			End Select 
			Delay 1000
			player_Energy = 100
			lives = lives - 1 
			ElseIf GivePos = 1 Then
			GivePos = 0
			Select level
				Case 2
				movX = MOVX_LVL1
				movY = Movy_Lvl1
				Case 3
				movX = MOVX_LVL2
				movY = Movy_Lvl2
				Case 4
				movX = MOVX_LVL3
				movY = Movy_Lvl3
				Case 5
				movX = MOVX_LVL4
				movY = Movy_Lvl4
				Case 6
				movX = Movx_Lvl5
				movY = Movy_Lvl5
				Case 7
				movX = Movx_Lvl6
				movY = Movy_Lvl6
				Case 8
				movX = Movx_Lvl7
				movY = Movy_Lvl7
			End Select 
			Delay 1000
			player_Energy = 100
			lives = lives - 1 
			EndIf 
		EndIf 
	EndIf   
	If lives <= 0 Then
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
	LoadLevel(1)
		text_var = 0
		movX = 5400
		movY = 480
		Text 200,200,"Du bist zu oft sitzen geblieben. Jetzt musst du leider wieder von vorne anfangen."
		Text 200,215,"Bitte [Enter] drücken..."
			If KeyHit(28) Then
			movX = (-288)
			movY = 480
			level = 1
			lives = 10
		EndIf
	EndIf
End Function


Function MonsterCollision()
If moveAny = 1 Then 
If (MilliSecs()-pauseTime > timeValue) Then; if player didnt collect a pause

For new_monster.Monster = Each Monster
	If new_monster\Monster_type = 1 Then
		If ImagesCollide(monsterLazy,(new_monster\Pos_x)-movX,(new_monster\Pos_y)-movY,0,player,player_posx,player_posy,0) Then
		player_Energy = player_Energy - 15
		Delete new_monster.Monster
	EndIf 
	ElseIf new_monster\Monster_type = 2 Then
		If ImagesCollide(monsterNaughty,(new_monster\Pos_x)-movX,(new_monster\Pos_y)-movY,0,player,player_posx,player_posy,0) Then
		creditPoints = creditPoints - 15
		Delete new_monster.Monster
	EndIf 
	ElseIf new_monster\Monster_type = 3 Then
		If ImagesCollide(monsterZero,(new_monster\Pos_x)-movX,(new_monster\Pos_y)-movY,0,player,player_posx,player_posy,0) Then
		player_Energy = player_Energy - 25
		Delete new_monster.Monster
	EndIf 
	ElseIf new_monster\Monster_type = 4 Then 
		If ImagesCollide(monsterHonk,(new_monster\Pos_x)-movX,(new_monster\Pos_y)-movY,0,player,player_posx,player_posy,0) Then
		player_Energy = player_Energy - 30
		creditPoints = creditPoints - Rnd(10,30)
		Delete new_monster.Monster
	EndIf 
	EndIf 
Next

EndIf
EndIf  
End Function 


Function DrawTeacher()
	For new_teacher.teacher = Each Teacher
		DrawImage teacher,(new_teacher\pos_x)-movX,(new_teacher\pos_y)-movY,new_teacher\frame
	Next
End Function 


Function MoveTeacher()
If moveAny <> 0

	For new_teacher.teacher = Each Teacher
		
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
If doTrade = 1 Then ;just after the first messages

	If score >= 15 Then	;if player has enough money to deal
		
		For new_teacher.teacher = Each Teacher
		If ImagesCollide(teacher,((new_teacher\pos_x)-movX),((new_teacher\pos_y)-movY),0,player,player_posx,player_posy,0) Then
		moveAny = 0
		player_move = 0
		jumpAllow = 0
		
		Select nextStep
		
			Case 0		
				point = (score - (score Mod 15))/15	;e.g. you have 43 coins, so you can get 8 points, 3 left
				Text 0,15,"Du kannst dein Punktekonto um "+point+" Punkte auffüllen, wenn du willst."
				If KeyHit(28) Then nextStep = nextStep +1
				
				
			Case 1
				Locate 0,30
				choice$ = Trim$(Input$("Wenn du einverstanden bist, gib 'ja' ein, ansonsten 'nein'. (Bitte KLEIN schreiben!)"))
				;WaitKey
				If KeyHit(28) And choice >= 0 Then
				nextStep = nextStep +1
				EndIf 
				 
				 		
			Case 2	
				If Trim$(choice$) = "ja" Then
				Text 0,15,"Du hast "+point+" Punkte hinzubekommen. - Ich muss jetzt mal verschwinden, sonst... ähm egal, also tschüss!"
				
				If KeyHit(28) Then
				Delete new_teacher
				text_var = text_var +1 ;this is only for the tutorial
				moveAny = 1
				player_move = 1
				nextStep = 0			;reset for next time :)
				score = score - (point*10)
				creditPoints = creditPoints+point
				jumpAllow = 1
				Exit
				EndIf 
				
				ElseIf Trim$(choice$) = "nein" Then
				Text 0,15,"Na gut, dann eben nicht. Ich muss jetzt weg, äh... ins Lehrerzimmer."

				If KeyHit(28) Then
				Delete new_teacher
				text_var = text_var +1
				moveAny = 1
				player_move = 1
				nextStep = 0
				jumpAllow = 1
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
	If ImagesCollide(teacher,((new_teacher\pos_x)-movX),((new_teacher\pos_y)-movY),0,player,player_posx,player_posy,0) Then
	
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
		DrawImage sneak,((new_sneak\pos_x)-movX),((new_sneak\pos_y)-movY),new_sneak\frame
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
If doTrade = 1 Then

;attention: The sneak doesnt care if the player hay enough coins or not		
		For new_sneak.sneak = Each Sneak
		If ImagesCollide(sneak,((new_sneak\pos_x)-movX),((new_sneak\pos_y)-movY),0,player,player_posx,player_posy,0) Then
		moveAny = 0
		player_move = 0
		jumpAllow = 0
		
			Select nextStep ;as in the text_var-funct., the steps are requested after each other
			
			Case 0 ;standard
				point = 20; he always tells you that you get 20 poins!
				Text 0,15,"Du kannst dein Punktekonto um "+point+" Punkte auffüllen, wenn du willst."
				If KeyHit(28) Then nextStep = nextStep +1
				
			Case 1
				Locate 0,30
				choice$ = Trim$(Input$("Wenn du einverstanden bist, gib 'ja' oder was anderes ein, ansonsten 'nein'. (Bitte KLEIN schreiben!)"))
				
				If KeyHit(28) And choice >= 0 Then
				nextStep = nextStep +1
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
			creditPoints = creditPoints - 15
			text_var = text_var +1
			moveAny = 1
			player_move = 1
			nextStep = 0
			jumpAllow = 1
			Delete new_sneak
			Exit
			EndIf
			
			ElseIf Trim$(choice$) = "nein" Then
			Text 0,15,"Och menno, du hast mich schon wieder durchschaut. Aber warte - nächstes Mal krieg ich dich!"
			
			If KeyHit(28) Then
			text_var = text_var +1
			moveAny = 1
			player_move = 1
			nextStep = 0
			jumpAllow = 1
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
	For newpause.pause = Each Pause
		If newpause\sort = 1 Then
			DrawImage eighthpause,(newpause\pos_x)-movX,(newpause\pos_y)-movY
		ElseIf newpause\sort = 2 Then
			DrawImage quarterpause,(newpause\pos_x)-movX,(newpause\pos_y)-movY
		EndIf
	Next	
End Function 
 

Function PauseCollision()	
	For newpause.pause = Each Pause
		If ImagesCollide(eighthpause,(newpause\pos_x)-movX,(newpause\pos_y)-movY,0,player,player_posx,player_posy,0) Then
			Delete newpause.pause
			pauseTime = MilliSecs()
			timeValue = 7500
		ElseIf ImagesCollide(quarterpause,(newpause\pos_x)-movX,(newpause\pos_y)-movY,0,player,player_posx,player_posy,0) Then
			Delete newpause.pause
			pauseTime = MilliSecs()
			timeValue = 15000
		EndIf 
	Next 
End Function


Function PlayerShoot()
If moveAny <> 0 Then
If shootAble = 1 Then 

	If KeyHit(157) Then ; if ctrl-right is hit ==> change back to KeyDown!!
	PlaySound throwBook
		shootAble = 0
		shootTime = MilliSecs()

	If movingRight = 1 Then 
		newbookright.ShootRight = New ShootRight
		newbookright.shootRight\shoot_x = ((player_posx)+movX)+10
		newbookright.shootRight\shoot_y = ((player_posy)+movY)

	ElseIf movingRight = 0 Then
		newbookleft.shootLeft = New ShootLeft
		newbookleft.shootLeft\shoot_x = ((player_posx)+movX)-10
		newbookleft.shootLeft\shoot_y = ((player_posy)+movY)
	EndIf
	EndIf 
EndIf 
EndIf 
End Function 


Function DrawShoot()
If moveAny <> 0 Then
	For newbookright.shootRight = Each ShootRight
		DrawImage book,(newbookright.shootRight\shoot_x)-movX,(newbookright.shootRight\shoot_y)-movY
		newbookright\shoot_x = newbookright\shoot_x + 9
	Next

	For newbookleft.ShootLeft = Each ShootLeft
		DrawImage book,(newbookleft.ShootLeft\shoot_x)-movX,(newbookleft.ShootLeft\shoot_y)-movY
		newbookleft\shoot_x = newbookleft\shoot_x - 9
	Next 
EndIf 
End Function 


Function ShootCollision()
For new_monster.Monster = Each Monster
For newbookright.shootright = Each ShootRight
	If ImagesCollide(book,((newbookright\shoot_x)-movX),((newbookright\shoot_y)-movY),0,monsterLazy,((new_monster\Pos_x)-movX),((new_monster\Pos_y)-movY),0) Then
		Delete new_monster.Monster
		Delete newbookright.shootright
		PlaySound monsterDie
		shootAble = 1 
	ElseIf ImagesCollide(book,((newbookright\shoot_x)-movX),((newbookright\shoot_y)-movY),0,monsterNaughty,((new_monster\Pos_x)-movX),((new_monster\Pos_y)-movY),0) Then
		Delete new_monster.Monster
		Delete newbookright.shootright
		PlaySound monsterDie
		shootAble = 1
	ElseIf ImagesCollide(book,((newbookright\shoot_x)-movX),((newbookright\shoot_y)-movY),0,monsterZero,((new_monster\Pos_x)-movX),((new_monster\Pos_y)-movY),0) Then
		Delete new_monster.Monster
		Delete newbookright.shootright
		PlaySound monsterDie
		shootAble = 1
	ElseIf ImagesCollide(book,((newbookright\shoot_x)-movX),((newbookright\shoot_y)-movY),0,monsterHonk,((new_monster\Pos_x)-movX),((new_monster\Pos_y)-movY),0) Then
		Delete new_monster.Monster
		Delete newbookright.shootright
		PlaySound monsterDie
		shootAble = 1
	EndIf
Next
Next

For new_monster.Monster = Each Monster
For newbookleft.shootleft = Each ShootLeft
	If ImagesCollide(book,((newbookleft\shoot_x)-movX),((newbookleft\shoot_y)-movY),0,monsterLazy,((new_monster\Pos_x)-movX),((new_monster\Pos_y)-movY),0) Then
		Delete new_monster.Monster
		Delete newbookleft.shootleft
		PlaySound monsterDie
		shootAble = 1 
	ElseIf ImagesCollide(book,((newbookleft\shoot_x)-movX),((newbookleft\shoot_y)-movY),0,monsterNaughty,((new_monster\Pos_x)-movX),((new_monster\Pos_y)-movY),0) Then
		Delete new_monster.Monster
		Delete newbookleft.shootleft
		PlaySound monsterDie
		shootAble = 1
	ElseIf ImagesCollide(book,((newbookleft\shoot_x)-movX),((newbookleft\shoot_y)-movY),0,monsterZero,((new_monster\Pos_x)-movX),((new_monster\Pos_y)-movY),0) Then
		Delete new_monster.Monster
		Delete newbookleft.shootleft
		PlaySound monsterDie
		shootAble = 1
	ElseIf ImagesCollide(book,((newbookleft\shoot_x)-movX),((newbookleft\shoot_y)-movY),0,monsterHonk,((new_monster\Pos_x)-movX),((new_monster\Pos_y)-movY),0) Then
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
			posy_temp = 18
		EndIf
	EndIf ; otherwise, it would keep the player in the air
	
		;in Case of collision
		If (actualLevel((player_posx+movX+12) /32,(player_posy+movY) /32)=1 Or actualLevel((player_posx+movX) /32,(player_posy+movY) /32)=1) And jump = True Then
			jump = True
			posy_temp = 0 
		EndIf 

		
		
		If jump = True Then
			posy_temp = posy_temp - 1
			movY = movY - posy_temp
		EndIf
		
		If posy_temp <= 0 Then
			If actualLevel((player_posx+movX+12) /32,(player_posy+movY+32) /32) = 1 Or actualLevel((player_posx+movX+20) /32,(player_posy+movY+32) /32) = 1 Then 
				jump = False
				temp_y = movY /32	;\
				movY = temp_y *32	;/ sets the exact position of Player if he stands in a tile
			EndIf
		EndIf
		
		
		If jump = False Then
			If actualLevel((player_posx+movX+12) /32,(player_posy+movY+32) /32) = 0 Then	;if there is no brick above him
				jump = True
				posy_temp = 0
			EndIf 
		EndIf 
		
		If movY < -416 Then
			movY = -416
			jump=True
			posy_temp = 0
		EndIf
		
		If movY >= 480 Then 
			movY = 480		; the max. value of Movy must be set!
			jump = False
		EndIf
		
		EndIf 
End Function 

Function LoadLevel(number)
	Local newcoin.Coins
	Local new_energy_object.Energys
	Local newitem.School
	Local new_less_energy_object.Less_energys
	Local New_teacher.Teacher
	Local New_sneak.Sneak
	Local newdoor.Door
	Local newpause.Pause
	
	Local currentLine$
	Local currentCommaPos
	
	Select(number)
		Case 1
			stream = ReadFile("lvl/tut.lvl")
			ReadLine(stream)	;coins heading
			Repeat
				currentLine$ = ReadLine(stream)
				If(currentLine$="") Then Exit
				newcoin.Coins = New Coins
				newcoin\Coinx = Left(currentLine,4)
				newcoin\Coiny = Mid(currentLine,6,3)
				newcoin\Sort = Right(currentLine,1)
			Forever
			ReadLine(stream)	;energy heading
			Repeat
				currentLine$ = ReadLine(stream)
				If(currentLine$="") Then Exit
				new_energy_object.Energys = New Energys
				new_energy_object\en_x = Left(currentLine,3)
				new_energy_object\en_y = Mid(currentLine,5,3)
				new_energy_object\sort = Right(currentLine,1)
			Forever
			ReadLine(stream)	;items heading
			Repeat
				currentLine$ = ReadLine(stream)
				If(currentLine$="") Then Exit
				newitem.School = New School
				newitem\School_x = Left(currentLine,3)
				newitem\School_y = Mid(currentLine,5,3)
				newitem\School_sort = Right(currentLine,1)
			Forever
			ReadLine(stream)	;less energy heading
			Repeat
				currentLine$ = ReadLine(stream)
				If(currentLine$="") Then Exit
				new_less_energy_object.Less_energys = New Less_energys
				new_less_energy_object\less_en_x = Left(currentLine,3)
				new_less_energy_object\less_en_y = Mid(currentLine,5,3)
				new_less_energy_object\less_en_sort = Right(currentLine,1)
			Forever
			ReadLine(stream)	;monster heading
			Repeat
				currentLine$ = ReadLine(stream)
				If(currentLine$="") Then Exit
				new_monster.Monster = New Monster
				new_monster\Monster_type = Left(currentLine,1)
				new_monster\Pos_x = Mid(currentLine,3,4)
				new_monster\Pos_y = Mid(currentLine,8,3)
				new_monster\Direction = Mid(currentLine,12,1)
				new_monster\Anim_counter = Mid(currentLine,14,1)
				new_monster\Frame = Mid(currentLine,16,1)
				new_monster\Start_x = Mid(currentLine,18,4)
				new_monster\M_energy = Right(currentLine,3)
			Forever
			ReadLine(stream)	;teacher heading
			Repeat
				currentLine$ = ReadLine(stream)
				If(currentLine$="") Then Exit
				New_teacher.Teacher = New Teacher
				New_teacher\pos_x= Left(currentLine,4)
				New_teacher\pos_y= Mid(currentLine,6,3)
				New_teacher\frame = Mid(currentLine,10,1)
				New_teacher\direction = Mid(currentLine,12,1)
				New_teacher\anim_counter = Mid(currentLine,14,1)
				New_teacher\start_x = Right(currentLine,4)
			Forever
			ReadLine(stream)	;sneak heading
			Repeat
				currentLine$ = ReadLine(stream)
				If(currentLine$="") Then Exit
				New_sneak.Sneak = New Sneak
				New_sneak\pos_x = Left(currentLine,4)
				New_sneak\pos_y = Mid(currentLine,6,3)
				New_sneak\frame = Mid(currentLine,10,1)
				New_sneak\direction = Mid(currentLine,12,1)
				New_sneak\anim_counter = Mid(currentLine,14,1)
				New_sneak\start_x = Right(currentLine,4)
			Forever
			ReadLine(stream)	;level door heading
			currentLine$ = ReadLine(stream)
			newdoor.Door = New Door
			newdoor\pos_x = Left(currentLine,4)
			newdoor\pos_y = Mid(currentLine,6,3)
			newdoor\frame = Right(currentLine,1)
			ReadLine(stream)	;empty
			ReadLine(stream)	;bricks heading
			For bricky = 0 To 24
				currentLine$ = ReadLine(stream)
				For brickx = 0 To 181
					actualLevel(brickx,bricky) = Mid(currentLine,(brickx+1)*2-1,1)
				Next
			Next
			CloseFile(stream)
		Case 2,3,4,5
			pointMinimum = 70 ; here, the minimum of points that a player has to collect, is set
			If(xyz=0) Then
				movX = MOVX_LVL1
				movY = Movy_Lvl1
				tut = 0
			EndIf 
			
			stream = ReadFile("lvl/"+(number+1)+".lvl")
			ReadLine(stream)	;coins heading
			Repeat
				currentLine$ = ReadLine(stream)
				If(currentLine$="") Then Exit
				currentCommaPos = Instr(currentLine,",")
				newcoin.Coins = New Coins
				newcoin\Coinx = Left(currentLine,currentCommaPos-1)
				newcoin\Coiny = Mid(currentLine,currentCommaPos+1,3)
				newcoin\Sort = Right(currentLine,1)
			Forever
			ReadLine(stream)	;energy heading
			Repeat
				currentLine$ = ReadLine(stream)
				If(currentLine$="") Then Exit
				currentCommaPos = Instr(currentLine,",")
				new_energy_object.Energys = New Energys
				new_energy_object\en_x = Left(currentLine,currentCommaPos-1)
				new_energy_object\en_y = Mid(currentLine,currentCommaPos+1,3)
				new_energy_object\sort = Right(currentLine,1)
			Forever
			ReadLine(stream)	;items heading
			Repeat
				currentLine$ = ReadLine(stream)
				If(currentLine$="") Then Exit
				currentCommaPos = Instr(currentLine,",")
				newitem.School = New School
				newitem\School_x = Left(currentLine,currentCommaPos-1)
				newitem\School_y = Mid(currentLine,currentCommaPos+1,3)
				currentCommaPos = Instr(currentLine,",",currentCommaPos+1)
				newitem\School_sort = Mid(currentLine,currentCommaPos+1)
			Forever
			ReadLine(stream)	;less energy heading
			Repeat
				currentLine$ = ReadLine(stream)
				If(currentLine$="") Then Exit
				currentCommaPos = Instr(currentLine,",")
				new_less_energy_object.Less_energys = New Less_energys
				new_less_energy_object\less_en_x = Left(currentLine,currentCommaPos-1)
				new_less_energy_object\less_en_y = Mid(currentLine,currentCommaPos+1,3)
				new_less_energy_object\less_en_sort = Right(currentLine,1)
			Forever
			ReadLine(stream)	;monster heading
			Repeat
				currentLine$ = ReadLine(stream)
				If(currentLine$="") Then Exit
				currentCommaPos = Instr(currentLine,",")
				new_monster.Monster = New Monster
				new_monster\Monster_type = Left(currentLine,1)
				new_monster\Pos_x = Mid(currentLine,currentCommaPos+1,Instr(currentLine,",",currentCommaPos+1))
				currentCommaPos = Instr(currentLine,",",currentCommaPos+1)
				new_monster\Pos_y = Mid(currentLine,currentCommaPos+1,3)
				new_monster\Direction = Mid(currentLine,currentCommaPos+5,1)
				new_monster\Anim_counter = Mid(currentLine,currentCommaPos+7,1)
				new_monster\Frame = Mid(currentLine,currentCommaPos+9,1)
				new_monster\Start_x = Mid(currentLine,currentCommaPos+11,Instr(currentLine,",",currentCommaPos+1))
				new_monster\M_energy = Right(currentLine,3)
			Forever
			ReadLine(stream)	;teacher heading
			Repeat
				currentLine$ = ReadLine(stream)
				If(currentLine$="") Then Exit
				New_teacher.Teacher = New Teacher
				New_teacher\pos_x = Left(currentLine,4)
				New_teacher\pos_y = Mid(currentLine,5,3)
				New_teacher\frame = Mid(currentLine,9,1)
				New_teacher\direction = Mid(currentLine,11,1)
				New_teacher\anim_counter = Mid(currentLine,13,1)
				New_teacher\start_x = Right(currentLine,4)
			Forever
			ReadLine(stream)	;sneak heading
			Repeat
				currentLine$ = ReadLine(stream)
				If(currentLine$="") Then Exit
				New_sneak.Sneak = New Sneak
				New_sneak\pos_x = Left(currentLine,4)
				New_sneak\pos_y = Mid(currentLine,5,3)
				New_sneak\frame = Mid(currentLine,9,1)
				New_sneak\direction = Mid(currentLine,11,1)
				New_sneak\anim_counter = Mid(currentLine,13,1)
				New_sneak\start_x = Right(currentLine,4)
			Forever
			ReadLine(stream)	;level door heading
			currentLine$ = ReadLine(stream)
			newdoor.Door = New Door
			newdoor\pos_x = Left(currentLine,4)
			newdoor\pos_y = Mid(currentLine,6,3)
			newdoor\frame = Right(currentLine,1)
			ReadLine(stream)	;empty
			ReadLine(stream)	;bricks heading
			For bricky = 0 To 24
				currentLine$ = ReadLine(stream)
				For brickx = 0 To 181
					actualLevel(brickx,bricky) = Mid(currentLine,(brickx+1)*2-1,1)
				Next
			Next
			CloseFile(stream)
		Case 6,7
			pointMinimum = creditPoints
			pointMinimum = (pointMinimum + 240)
			If(xyz=0) Then
				xyz = 1
				movX = MOVX_LVLAbi1
				movY = Movy_LvlAbi1
			EndIf 
			
			ReadLine(stream)	;energy heading
			Repeat
				currentLine$ = ReadLine(stream)
				If(currentLine$="") Then Exit
				currentCommaPos = Instr(currentLine,",")
				new_energy_object.Energys = New Energys
				new_energy_object\en_x = Left(currentLine,currentCommaPos-1)
				new_energy_object\en_y = Mid(currentLine,currentCommaPos+1,Instr(currentLine,",",currentCommaPos+1))
				new_energy_object\sort = Right(currentLine,1)
			Forever
			ReadLine(stream)	;item heading
			Repeat
				currentLine$ = ReadLine(stream)
				If(currentLine$="") Then Exit
				currentCommaPos = Instr(currentLine,",")
				newitem.School = New School
				newitem\School_x = Left(currentLine,currentCommaPos-1)
				newitem\School_y = Mid(currentLine,currentCommaPos+1,Instr(currentLine,",",currentCommaPos+1))
				newitem\School_sort = Right(currentLine,2)
			Forever
			ReadLine(stream)	;less energy heading
			Repeat
				currentLine$ = ReadLine(stream)
				If(currentLine$="") Then Exit
				currentCommaPos = Instr(currentLine,",")
				new_less_energy_object.Less_energys = New Less_energys
				new_less_energy_object\less_en_x = Left(currentLine,currentCommaPos-1)
				new_less_energy_object\less_en_y = Mid(currentLine,currentCommaPos+1,Instr(currentLine,",",currentCommaPos+1))
				new_less_energy_object\less_en_sort = Right(currentLine,1)
			Forever
			ReadLine(stream)	;monster heading
			Repeat
				currentLine$ = ReadLine(stream)
				If(currentLine$="") Then Exit
				currentCommaPos = Instr(currentLine,",")
				new_monster.Monster = New Monster
				new_monster\Monster_type = Left(currentLine,1)
				new_monster\Pos_x = Mid(currentLine,3,currentCommaPos-1)
				new_monster\Pos_y = Mid(currentLine,currentCommaPos+1,3)
				new_monster\Direction = Mid(currentLine,currentCommaPos+6,1)
				new_monster\Anim_counter = Mid(currentLine,currentCommaPos+8,1)
				new_monster\Frame = Mid(currentLine,currentCommaPos+10,1)
				new_monster\Start_x = Mid(currentLine,currentCommaPos+12,Len(currentLine)-(currentCommaPos+12)-4)
				new_monster\M_energy = Right(currentLine,3)
			Forever
			ReadLine(stream)	;rest heading
			Repeat
				currentLine$ = ReadLine(stream)
				If(currentLine$="") Then Exit
				currentCommaPos = Instr(currentLine,",")
				newpause.Pause = New Pause
				newpause\pos_x = Left(currentLine,currentCommaPos-1)
				newpause\pos_y = Mid(currentLine,currentCommaPos+1,3)
				newpause\sort = Right(currentLine,1)
			Forever
			ReadLine(stream)	;level door heading
			Repeat
				currentLine$ = ReadLine(stream)
				If(currentLine$="") Then Exit
				currentCommaPos = Instr(currentLine,",")
				newdoor.Door = New Door
				newdoor\pos_x = Left(currentLine,currentCommaPos-1)
				newdoor\pos_y = Mid(currentLine,currentCommaPos+1,3)
				newdoor\frame = Right(currentLine,1)
			Forever
			ReadLine(stream)	;empty
			ReadLine(stream)	;bricks heading
			For bricky = 0 To 24
				currentLine$ = ReadLine(stream)
				For brickx = 0 To 181
					actualLevel(brickx,bricky) = Mid(currentLine,(brickx+1)*2-1,1)
				Next
			Next
			CloseFile(stream)
	End Select
End Function

Function ShowAbi()

	If(xyz=0) Then
		xyz = 1
		movX = 5400
		movY = 480
	EndIf

	Local creditPoint# = Float(creditPoints) ; this formula computes a quite good virtual mark
	mark# = 1/(creditPoint#/1000)
	If(mark#>4) Then mark# = 6 
	If(mark#<1) Then mark# = 1
	
	Select abiMessage
		Case 0
			Text(100,0,abiText(26))
			Text(100,90,abiText(27))
			Text(100,150,abiText(28)+creditPoints+abiText(29))
			Text(100,180,abiText(30)+mark#+".")
			Text(100,240,abiText(31))
			Text(200,430,abiText(32))
			
			If(KeyHit(28)) Then abiMessage = abiMessage+1
			
		Case 1
			Cls 
			Text(120,0,creditsText(0))
			Text(120,12,creditsText(1))
			Text(120,30,creditsText(2))
			Text(120,60,creditsText(3))
			Text(120,90,creditsText(4))
			Text(120,120,creditsText(5))
			Text(120,150,creditsText(6))
			Text(120,180,creditsText(7))
			Text(120,210,creditsText(8))
			Text(120,240,creditsText(9))
			Text(120,270,creditsText(10))
			Text(120,300,creditsText(11))
			Text(120,330,creditsText(12))
			Text(120,360,creditsText(13))
			Text(120,390,creditsText(14))
			Text(120,468,creditsText(15))
			
			If(KeyHit(28)) Then 
				Cls()
				level = 1
				movX = -288	;reset start position
				movY = 480
				doDrawPlayer = 1
				text_var = 0
				doTut = 1
				tut = 0
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
		
			Text(10,30,tutText(0))
			Text(10,45,tutText(1))
			Text(10,60,tutText(2))
			Text(10,75,tutText(3))
			
			If(KeyHit(28)) Then
				;player_move = 1 ==> just after the last text
				text_var = text_var+1
			EndIf
		Case 1
			Text(10,30,tutText(4))
			Text(10,45,tutText(5))
			
			If KeyHit(28) Then
				text_var = text_var+1
			EndIf
		Case 2
			Text(10,30,tutText(6))
			Text(10,45,tutText(7))
			Text(10,60,tutText(8))
			
			If KeyHit(28) Then
				text_var = text_var+1
			EndIf
		Case 3
			Text(10,30,tutText(9))
			Text(10,45,tutText(10))
			Text(10,60,tutText(11))
			
			If KeyHit(28) Then
				text_var = text_var+1
			EndIf
		Case 4
			Text(10,30,tutText(12))
			Text(10,45,tutText(13))
			Text(10,60,tutText(14))
			
			If KeyHit(28) Then
				text_var = text_var+1
				player_move = 1
			EndIf
		;now he walks to the root
		Case 5
			tut = 1
			
			Local newitem.School
			For newitem.School = Each School
				If(ImagesCollide(root,((newitem\School_x)-movX),((newitem\School_y)-movY),0,player,player_posx,player_posy,0)) Then
				didCollide = 1
				player_move = 0
				Text(10,30,tutText(15))
				Text(10,45,tutText(16))
				Text(10,60,tutText(17))
				Text(10,75,tutText(18))
				Text(10,90,tutText(19))
			EndIf 
			Next 
			
			If(KeyHit(28) And didCollide) Then
				text_var = text_var+1
				player_move = 1
				tut = 0
				didCollide = 0
			EndIf
	
		;now he walks to the sandwich
		Case 6
			tut = 1
			
			For new_energy_object.energys = Each Energys
				If(ImagesCollide(sandwich,((new_energy_object\en_x)-movX),((new_energy_object\en_y)-movY),0,player,player_posx,player_posy,0)) Then
					didCollide = 1
					player_move = 0
					Text(10,30,tutText(20))
					Text(10,45,tutText(21))
					Text(10,60,tutText(22))
					Text(10,75,tutText(23))
				EndIf	
			Next
			
			If(KeyHit(28) And didCollide) Then
				text_var = text_var+1
				player_move = 1
				tut = 0
				didCollide = 0
			EndIf
		Case 7
			tut = 1
			
			For new_less_energy_object.less_energys = Each Less_energys
				If(ImagesCollide(toilet,((new_less_energy_object\less_en_x)-movX),((new_less_energy_object\less_en_y)-movY),0,player,player_posx,player_posy,0)) Then
					didCollide = 1
					player_move = 0
					Text(10,30,tutText(24))
					Text(10,45,tutText(25))
					Text(10,60,tutText(26))
					Text(10,75,tutText(27))
				EndIf	
			Next
			
			If KeyHit(28) And didCollide Then
				text_var = text_var+1
				tut = 0
				didCollide = 0
			EndIf
		Case 8
			tut = 1
			
			Text(10,30,tutText(28))
			Text(10,45,tutText(29))
			Text(10,60,tutText(30))
			Text(10,75,tutText(31))
			Text(10,90,tutText(32))
			
			If(KeyHit(28)) Then
				text_var = text_var+1
				player_move = 1
				tut = 0
				moveAny = 1
			EndIf
		Case 9
			tut = 1
			
			If(movX = 712) Then
				didCollide = 1 		;this is a few metres behind the 1st monster
				player_move = 0
				moveAny = 0
				Text(10,30,tutText(33))
				Text(10,45,tutText(34))
				Text(10,60,tutText(35))
			EndIf
			
			If(KeyHit(28) And didCollide) Then
				text_var = text_var +1
				player_move = 1
				moveAny = 1
				didCollide = 0
				movX = 716 			; he must be placed behind the orig. pos. else he repeats it always!
			EndIf 
		Case 10
			If(movX = 1012) Then		;this is a few metres behind the 2nd monster
				didCollide = 1
				player_move = 0
				Text(10,30,tutText(36))
				Text(10,45,tutText(37))
				Text(10,60,tutText(38))
			EndIf
			
			If(KeyHit(28) And didCollide) Then
				text_var = text_var +1
				movX = 1016
				didCollide = 0
			EndIf
		Case 11
			Text(10,30,tutText(39))
			Text(10,45,tutText(40))
			Text(10,60,tutText(41))
			
			If(KeyHit(28)) Then
				text_var = text_var+1
				player_move = 1
				didCollide = 0
				jumpAllow = 1
			EndIf 
		Case 12
			If(movX = 1664) Then 
				player_move = 0
				didCollide = 1
				moveAny = 0
				jumpAllow = 0
				
				Text(10,30,tutText(42))
				Text(10,45,tutText(43))
			EndIf 
		
			If KeyHit(28) And didCollide Then
				text_var = text_var +1
				player_move = 1
				moveAny = 1
				jumpAllow = 1
			EndIf
		Case 13
			For new_teacher.teacher = Each Teacher
				If(ImagesCollide(teacher,((New_teacher\pos_x)-movX),((New_teacher\pos_y)-movY),0,player,player_posx,player_posy,0)) Then
					doTrade = 0
					moveAny = 0
					jumpAllow = 0
					didCollide = 1
					player_move = 0
					Text(10,30,tutText(44))
					Text(10,45,tutText(45))
					Text(10,60,tutText(46))
				EndIf
			Next
			
			If(KeyHit(28) And didCollide) Then
				doTrade = 1
				text_var = text_var+1
			EndIf
		Case 14
		;in this case, the player is dealing with the teacher. If the deal is over, the Text_var is raised in the TeacherTrade-Function.
		Case 15
			player_move = 0
			moveAny = 0
			Text(10,30,tutText(47))
			Text(10,45,tutText(48))
			Text(10,60,tutText(49))
			
			If(KeyHit(28)) Then
				text_var = text_var+1
				player_move = 1
				didCollide = 0
				moveAny = 1
				jumpAllow = 1
				doTrade = 0
			EndIf 
		Case 16
			For new_sneak.sneak = Each Sneak
				If(ImagesCollide(sneak,((New_sneak\pos_x)-movX),((new_sneak\pos_y)-movY),0,player,player_posx,player_posy,0)) Then
					nextStep = 0 ; this is just for that the variable can be used
					moveAny = 0
					jumpAllow = 0
					didCollide = 1
					player_move = 0
					Text(10,30,tutText(50))
					Text(10,45,tutText(51))
					Text(10,60,tutText(52))
					Text(10,75,tutText(53))
					Text(10,90,tutText(54))
				EndIf
			Next
			
			If(KeyHit(28) And didCollide) Then
				text_var = text_var +1
				doTrade = 1
			EndIf
		Case 17
		;see SneakTrade
		Case 18
			player_move = 0
			moveAny = 0
			Text(10,30,tutText(55))
			
			If(KeyHit(28)) Then
				player_move = 1
				moveAny = 1
				text_var = text_var+1 
				jumpAllow = 1
			EndIf 
		Case 19
			If(movX = 2184) Then 
				player_move = 0
				Text(10,30,tutText(56))
				Text(10,45,tutText(57))
				Text(10,60,tutText(59))
				Text(10,75,tutText(60))
			EndIf 
			
			If(KeyHit(28)) Then
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
		movX = 5400
		movY = 480
	EndIf
		
	Text(0,0,abiText(0))
	Text(0,15,abiText(1))
	Text(0,30,abiText(2))
	Text(0,45,abiText(3))
	Text(0,60,abiText(4))
	Text(0,75,abiText(5))
	Text(0,90,abiText(6))
	Text(0,105,abiText(7))
	Text(0,120,abiText(8))
	Text(0,135,abiText(9))
	Text(0,150,abiText(10))
	Text(0,165,abiText(11))
	Text(0,180,abiText(12))
	Text(0,195,abiText(13))
	Text(0,210,abiText(14))
	Text(0,225,abiText(15))
	Text(0,240,abiText(16))
	Text(0,255,abiText(17))
	Text(0,270,abiText(18))
	Text(0,285,abiText(19))
	Text(0,300,abiText(20))
	Text(0,315,abiText(21))
	Text(0,330,abiText(22))
	Text(0,345,abiText(23))
	Text(0,360,abiText(24))
	Text(0,375,abiText(25))
		
	If(KeyHit(28)) Then
		level = level+1
		doDrawPlayer = 1
		moveAny = 1
		player_move = 1
		lives = 3 ; for this level, player has 3 chances!
		;delete old stuff from level tutorial
		Delete Each Coins
		Delete Each Energys
		Delete Each School
		Delete Each Less_energys
		Delete Each Monster
		Delete Each Teacher
		Delete Each Sneak
		Delete Each Pause
		Delete Each Door
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
		DrawImage door,((newdoor\pos_x)-movX),((newdoor\pos_y)-movY),newdoor\frame
	Next
	ElseIf creditPoints < pointMinimum Then
	For newdoor.door = Each Door
		DrawImage door,((newdoor\pos_x)-movX),((newdoor\pos_y)-movY),0
	Next
	EndIf 
End Function 

Function LevelDoorCollision()
	For newdoor.door = Each Door
		If ImagesCollide(door,((newdoor\pos_x)-movX),((newdoor\pos_y)-movY),0,player,player_posx,player_posy,0) Then
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

	If(message>0) Then
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
		
		If(message>=1 And message<=80) Then msg_Item$ = itemText(message-1)
	EndIf 
End Function 

;the cheat menu
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
				Delete Each Coins
				Delete Each Energys
				Delete Each School
				Delete Each Less_energys
				Delete Each Monster
				Delete Each Teacher
				Delete Each Sneak
				Delete Each Door
				player_move = 1
				moveAny = 1
				jumpAllow = 1
				doTut = 0
				tut = 0
				player_Energy = 100
				level = level+1
			Case "Level-"
				Delete Each Coins
				Delete Each Energys
				Delete Each School
				Delete Each Less_energys
				Delete Each Monster
				Delete Each Teacher
				Delete Each Sneak
				Delete Each Door
				player_move = 1
				moveAny = 1
				jumpAllow = 1
				doTut = 0
				tut = 0
				player_Energy = 100
				level = level-1
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
	If(KeyHit(64)) Then	;if F6 hit
		If(FileType("Save.dat")=1) Then
			SaveData = OpenFile("Save.dat")
			WriteInt(SaveData,level)
			If(start = 0) Then
				WriteInt(SaveData,(start+1))
			Else 
				WriteInt(SaveData,(start-1))
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
			WriteInt(SaveData,movX)
			WriteInt(SaveData,movY)
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
			WriteInt(SaveData,movX)
			WriteInt(SaveData,movY)
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
			movX = ReadInt(LoadData)
			movY = ReadInt(LoadData)
			CloseFile(LoadData)
		Else
		RuntimeError "Error: Could not find 'Save.dat'!"
		EndIf
	EndIf
End Function 


Type Image
	Field obj
	Field animated
End Type

;Type for the Coin:
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
;~IDEal Editor Parameters:
;~F#1C4#1CD#1DF#1E7#1F0#201#226#230#23E#257#2FF#538#546#561#56C#5FE#6EA#70C#713#73D
;~F#7A2#7A9#7D4#819#824#833#84C#85B#8A1#8D8#A00#A43#B61#B97#BA1#BAD#BD9#C23#C68
;~C#Blitz3D