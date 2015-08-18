AppTitle("Abi-Huepfer 1.2") ; Title of the game and version

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
Global coin_5 = LoadImage("gfx/5Coin.bmp")			; 5 Coin
MaskImage(coin_5, 255, 0, 255)
Global coin_10 = LoadImage("gfx/10Coin.bmp")		; 10 Coin
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
Global crotchetRest = LoadImage("gfx/CrotchetRest.bmp")	; 15 sec break
MaskImage(crotchetRest, 255, 0, 255)
Global eighthRest = LoadImage("gfx/EighthRest.bmp")	; 7.5 sec break
MaskImage(eighthRest, 255, 0, 255)


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
Dim currentLevel(182,25)
Global brickX, brickY ; coordinates of the bricks


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
Global newMonster.Monster ; to use this var in other functions too

;general variables
Global moveAny = 1 ; all other objects moving
Global playerMove = 0 ; the player moving
Global playerEnergy = 50 ; player energy
Global score = 0	; player score in Coin
Global lives = 5	; number of lives
Global creditPoints ; ... and credit points
Global pointMinimum ; the minimum of points to finish the level

;variables for the jump function
Global jump
Global gravity
Global posYTemp
Global jumpAllow = 1

;variables for the tutorial
Global tut = 0 ; whether tutorial level is played now
Global text_var = 0 ; what text shall be shown
Global doTut = 1 ; start with the tutorial? (1=yes, 0=no)

;player specific variables
Global doDrawPlayer = 1  ; shall the program draw the player?
Global playerPosX = (screenWidth/2) ; \ positioned in the middle of the screen
Global playerPosY = (screenHeight/2) ; /
Global frame = 0		 ; the frame 
Global time = 0			 ; checks when a frame has to be changed
Global movingRight ; whether he moves in right or left direction
Global movX = -400 ; these variables change if the player is moving
Global movY = 350 ; starting point level 1: right bottom

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

;to control the Rests in the Abi-Levels
Global restTime
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

;MAKE THIS FASTER??
;Global backGround = PlayMusic("sfx/Jumpin' in the School.mid") ; background melody
;ChannelVolume(backGround,0.33)

;texts for the tutorial level
Dim tutText$(60)
stream = ReadFile("txt/tutorial.txt")
Local i
For i=0 To 60
	tutText(i) = ReadLine(stream)
Next
CloseFile(stream)

;texts for the Abitur message
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

;trade texts
Dim tradeText(13)
stream = ReadFile("txt/trade.txt")
For i=0 To 13
	tradeText(i) = ReadLine(stream)
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
Const MOV_X_LVL1 = (-288)
Const MOV_Y_LVL1 = 480
Const MOV_X_LVL2 = 5440
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
	DrawRest()
	RestCollision()
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
		DrawImage(player,playerPosX,playerPosY,frame)
	EndIf 
	If(playerEnergy>100) Then playerEnergy = 100 ; no more than 100% energy
	If(creditPoints<0) Then creditPoints = 0 ; no less than 0 points
End Function

Function MovePlayer()
	If(playerMove <> 0) Then
		If(KeyDown(205)) Then 
			AnimPlayerRight() ; animates the player
			movingRight = 1
			If(currentLevel((playerPosX+32+movX)/32, (playerPosY+movY)/32)=0) Then
				movX = movX+4 ;Right
			EndIf
		ElseIf(KeyDown(203)) Then 
			AnimPlayerLeft()
			movingRight = 0
			If(currentLevel((playerPosX+movX)/32, (playerPosY+movY)/32)=0) Then
				movX = movX-4 ;Left
			EndIf
		EndIf
	EndIf 
End Function

Function AnimPlayerRight()
	If(MilliSecs()-time>150) Then
		time = MilliSecs()
		frame = frame+1
	EndIf
	If(frame>3) Then frame = 0
End Function

Function AnimPlayerLeft()
	If(frame<4) Then frame = 4
	If(MilliSecs()-time>150) Then
		time = MilliSecs()
		frame = frame+1
	EndIf
	If(frame>7) Then frame = 4
End Function

Function DrawCoin()
	Local newCoin.Coin
	For newCoin.Coin = Each Coin
		If(newCoin\sort=1) Then ;ask which coin it is (1,5,10,50-euro or credit card)
			DrawImage(coin, ((newCoin\coinX)-movX), ((newCoin\coinY)-movY))
		ElseIf(newCoin\sort=2) Then
			DrawImage(coin_5, ((newCoin\coinX)-movX), ((newCoin\coinY)-movY))
		ElseIf newCoin\sort = 3 Then
			DrawImage(coin_10, ((newCoin\coinX)-movX), ((newCoin\coinY)-movY))
		ElseIf newCoin\sort = 4 Then
			DrawImage(purse,((newCoin\coinX)-movX),((newCoin\coinY)-movY))
		ElseIf newCoin\sort = 5 Then
			DrawImage(creditcard,((newCoin\coinX)-movX),((newCoin\coinY)-movY))
		EndIf 
	Next
End Function

Function CoinCollision()
	Local newCoin.Coin
	For newCoin.Coin = Each Coin
		Select(newCoin\sort)
		Case 1
			If(ImagesCollide (coin, ((newCoin\coinX)-movX), ((newCoin\coinY)-movY), 0, player, playerPosX, playerPosY, frame)) Then
				Delete newCoin.Coin
				PlaySound coinCollect
				score = score + 1
			EndIf	
		Case 2
			If ImagesCollide (coin_5, ((newCoin\coinX)-movX), ((newCoin\coinY)-movY), 0, player, playerPosX, playerPosY, frame) Then
				Delete newCoin.Coin
			PlaySound coinCollect
			score = score + 5
		EndIf		
		Case 3
			If ImagesCollide (coin_10, ((newCoin\coinX)-movX), ((newCoin\coinY)-movY), 0, player, playerPosX, playerPosY, frame) Then
				Delete newCoin.Coin
			PlaySound coinCollect
			score = score + 10
		EndIf
		Case 4
			If ImagesCollide(purse, ((newCoin\coinX)-movX), ((newCoin\coinY)-movY), 0, player, playerPosX, playerPosY, frame) Then
				Delete newCoin.Coin
			PlaySound coinCollect
			score = score + 50
		EndIf 
		Case 5
			If ImagesCollide(creditcard, ((newCoin\coinX)-movX), ((newCoin\coinY)-movY), 0, player, playerPosX, playerPosY, frame) Then
				Delete newCoin.Coin
			PlaySound coinCollect
			score = score+Rnd(100,250) ; a number between 100 and 250 "euros"
		EndIf 	
		End Select 
	Next
End Function

Function DrawMap()
	For brickY = 0 To 24 
		For brickX = 0 To 181
			If(currentLevel(brickX,brickY)) Then
				DrawImage(brick,((brickX*32)-movX),((brickY*32)-movY)) ;because the tile has the size of 32*32 pixels
			EndIf
		Next
	Next
End Function

Function DrawEnergyItems()
	Local newEnergyObject.Energy
	For newEnergyObject.Energy = Each Energy
		Select (newEnergyObject\sort)
			; 1: Sandwich, 2: Spicker
			Case 1
				DrawImage(sandwich,((newEnergyObject\enX)-movX),((newEnergyObject\enY)-movY))
			Case 2
				DrawImage(cheatpaper,((newEnergyObject\enX)-movX),((newEnergyObject\enY)-movY))
			Case 3
				DrawImage(energy,((newEnergyObject\enX)-movX),((newEnergyObject\enY)-movY))
		End Select
	Next
End Function 

Function EnergyItemsCollision()
	If(tut<>0) Then Return ; if current level is NOT tutorial level
	
	Local newEnergyObject.Energy
	For newEnergyObject.Energy = Each Energy
		Select(newEnergyObject\sort)
			Case 1
				If(ImagesCollide(sandwich,((newEnergyObject\enX)-movX),((newEnergyObject\enY)-movY),0,player,playerPosX,playerPosY,0)) Then
					playerEnergy = playerEnergy+10
					PlaySound eat
					Delete newEnergyObject
				EndIf
			Case 2
				If(ImagesCollide(cheatpaper,((newEnergyObject\enX)-movX),((newEnergyObject\enY)-movY),0,player,playerPosX,playerPosY,0)) Then
					playerEnergy = playerEnergy+15
					Delete newEnergyObject
				EndIf
			Case 3
				If(ImagesCollide(energy,((newEnergyObject\enX)-movX),((newEnergyObject\enY)-movY),0,player,playerPosX,playerPosY,0)) Then
					playerEnergy = playerEnergy+40
					Delete newEnergyObject
				EndIf
		End Select
	Next
End Function 

Function DrawSchoolItems()
	Local newItem.School
	For newItem.School = Each School
		Select(newItem\schoolSort)
		; 1-10: Math; 11-14: English, 15-21: History and so on
		Case 1
			DrawImage(root,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 2
			DrawImage(urn,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 3
			DrawImage(function0,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 4
			DrawImage(function1,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 5
			DrawImage(function2,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 6
			DrawImage(function3,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 7
			DrawImage(function4,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 8
			DrawImage(function5,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 9
			DrawImage(function6,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 10
			DrawImage(function7,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 11
			DrawImage(yeswecan,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 12
			DrawImage(teatime,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 13
			DrawImage(spo,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 14
			DrawImage(usa,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 15
			DrawImage(napoleon,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 16
			DrawImage(hitler,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 17
			DrawImage(honecker,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 18
			DrawImage(fight,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 19
			DrawImage(dates,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 20
			DrawImage(germany,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 21
			DrawImage(sed,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 22
			DrawImage(goethe,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 23
			DrawImage(schiller,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 24
			DrawImage(lessing,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 25
			DrawImage(parataxis,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 26
			DrawImage(blackboard,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 27
			DrawImage(duden,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 28
			DrawImage(bars,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 29
			DrawImage(rings,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 30
			DrawImage(badminton,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 31
			DrawImage(football,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 32
			DrawImage(run,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 33
			DrawImage(wallbars,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 34
			DrawImage(stand,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 35
			DrawImage(winnersteps,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 36
			DrawImage(globe,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 37
			DrawImage(atlas,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 38
			DrawImage(weather,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 39
			DrawImage(friends,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 40
			DrawImage(geyser,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 41
			DrawImage(watercyclus,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 42
			DrawImage(note,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 43
			DrawImage(guitar,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 44
			DrawImage(notepaper,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 45
			DrawImage(loudspeaker,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 46
			DrawImage(piano,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 47
			DrawImage(conductor,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 48
			DrawImage(buzz,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 49
			DrawImage(clefs,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 50
			DrawImage(burner,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 51
			DrawImage(testglass,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 52
			DrawImage(nh3,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 53
			DrawImage(goggles,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 54
			DrawImage(kettle,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 55
			DrawImage(c4,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 56
			DrawImage(playray,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 57
			DrawImage(joystick,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 58
			DrawImage(pc_back,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 59
			DrawImage(www,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 60
			DrawImage(google,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 61
			DrawImage(printer,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 62
			DrawImage(abihelp,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 63
			DrawImage(schillershead,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 64
			DrawImage(mephisto,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 65
			DrawImage(calculator,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 66
			DrawImage(infinite,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 67
			DrawImage(henning,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 68
			DrawImage(dictionary,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 69
			DrawImage(bratwurst,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 70
			DrawImage(holyshit,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 71
			DrawImage(electricapple,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 72
			DrawImage(acid,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 73
			DrawImage(pse,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 74
			DrawImage(asia,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 75
			DrawImage(europe,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 76
			DrawImage(northamerica,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 77
			DrawImage(southamerica,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 78
			DrawImage(australia,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 79
			DrawImage(africa,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		Case 80
			DrawImage(antarctica,((newItem\schoolX)-movX),((newItem\schoolY)-movY))
		End Select
	Next
End Function 

Function SchoolItemsCollision()
	If(tut<>0) Then Return
	
	Local newItem.School
		For newItem.School = Each School
			Select(newItem\schoolSort)
		Case 1
			If(ImagesCollide(root,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0)) Then
			message = 1
			creditPoints = creditPoints+3
			PlaySound itemCollect
			Delete newItem.School 
		EndIf 
		Case 2
			If ImagesCollide(urn,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 2
			creditPoints = creditPoints + 4
			PlaySound itemCollect
			Delete newItem.School 
		EndIf
		Case 3
			If ImagesCollide(function0,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 3
			creditPoints = creditPoints + 5
			PlaySound itemCollect
			Delete newItem.School 
		EndIf
		Case 4
			If ImagesCollide(function1,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 4
			creditPoints = creditPoints + 7
			PlaySound itemCollect
			Delete newItem.School 
		EndIf
		Case 5
			If ImagesCollide(function2,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 5
			creditPoints = creditPoints + 6
			PlaySound itemCollect
			Delete newItem.School 
		EndIf
		Case 6
			If ImagesCollide(function3,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 6
			creditPoints = creditPoints + 8
			PlaySound itemCollect
			Delete newItem.School 
		EndIf
		Case 7
			If ImagesCollide(function4,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 7
			creditPoints = creditPoints + 9
			PlaySound itemCollect
			Delete newItem.School 
		EndIf
		Case 8
			If ImagesCollide(function5,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 8
			creditPoints = creditPoints + 10
			PlaySound itemCollect
			Delete newItem.School 
			EndIf
		Case 9
			If ImagesCollide(function6,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 9
			creditPoints = creditPoints + 12
			PlaySound itemCollect
			Delete newItem.School 
		EndIf
		Case 10
			If ImagesCollide(function7,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 10
			creditPoints = creditPoints + 15
			PlaySound itemCollect
			Delete newItem.School 
		EndIf
		Case 11
			If ImagesCollide(yeswecan,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 11
			creditPoints = creditPoints + 4
			PlaySound itemCollect
			Delete newItem.School
		EndIf 
		Case 12
			If ImagesCollide(teatime,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 12
			creditPoints = creditPoints + 6
			PlaySound itemCollect
			Delete newItem.School
		EndIf 
		Case 13
			If ImagesCollide(spo,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 13
			creditPoints = creditPoints + 9
			PlaySound itemCollect
			Delete newItem.School
		EndIf 
		Case 14
			If ImagesCollide(usa,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 14
			creditPoints = creditPoints + 11
			PlaySound itemCollect
			Delete newItem.School
		EndIf 
		Case 15
			If ImagesCollide(napoleon,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 15
			creditPoints = creditPoints + 4
			PlaySound itemCollect
			Delete newItem.School
		EndIf 
		Case 16
			If ImagesCollide(hitler,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 16
			creditPoints = creditPoints + 4
			PlaySound itemCollect
			Delete newItem.School
		EndIf 
		Case 17
			If ImagesCollide(honecker,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 17
			creditPoints = creditPoints + 4
			PlaySound itemCollect
			Delete newItem.School
		EndIf 
		Case 18
			If ImagesCollide(fight,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 18
			creditPoints = creditPoints + 7
			PlaySound itemCollect
			Delete newItem.School
		EndIf 
		Case 19
			If ImagesCollide(dates,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 19
			creditPoints = creditPoints + 9
			PlaySound itemCollect
			Delete newItem.School
		EndIf 
		Case 20
			If ImagesCollide(germany,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 20
			creditPoints = creditPoints + 13
			PlaySound itemCollect
			Delete newItem.School
		EndIf 
		Case 21
			If ImagesCollide(sed,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 21
			creditPoints = creditPoints + 8
			PlaySound itemCollect
			Delete newItem.School
		EndIf 
		Case 22
			If ImagesCollide(goethe,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 22
			creditPoints = creditPoints + 3
			PlaySound itemCollect
			Delete newItem.School
		EndIf
		Case 23
			If ImagesCollide(schiller,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 23
			creditPoints = creditPoints + 5
			PlaySound itemCollect
			Delete newItem.School
		EndIf
		Case 24
			If ImagesCollide(lessing,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 24
			creditPoints = creditPoints + 6
			PlaySound itemCollect
			Delete newItem.School
		EndIf
		Case 25
			If ImagesCollide(parataxis,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 25
			creditPoints = creditPoints + 8
			PlaySound itemCollect
			Delete newItem.School
		EndIf
		Case 26
			If ImagesCollide(blackboard,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 26
			creditPoints = creditPoints + 16
			PlaySound itemCollect
			Delete newItem.School
		EndIf
		Case 27
			If ImagesCollide(duden,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 27
			creditPoints = creditPoints + 9
			PlaySound itemCollect
			Delete newItem.School
		EndIf
		Case 28
			If ImagesCollide(bars,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 28
			creditPoints = creditPoints + 5
			PlaySound itemCollect
			Delete newItem.School
		EndIf
		Case 29
			If ImagesCollide(rings,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 29
			creditPoints = creditPoints + 5
			PlaySound itemCollect
			Delete newItem.School
		EndIf
		Case 30
			If ImagesCollide(badminton,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 30
			creditPoints = creditPoints + 8
			PlaySound itemCollect
			Delete newItem.School
		EndIf
		Case 31
			If ImagesCollide(football,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 31
			creditPoints = creditPoints + 10
			PlaySound itemCollect
			Delete newItem.School
		EndIf
		Case 32
			If ImagesCollide(run,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 32
			creditPoints = creditPoints + 11
			PlaySound itemCollect
			Delete newItem.School
		EndIf
		Case 33
			If ImagesCollide(wallbars,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 33
			creditPoints = creditPoints + 15
			PlaySound itemCollect
			Delete newItem.School
		EndIf
		Case 34
			If ImagesCollide(stand,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 34
			creditPoints = creditPoints + 13
			PlaySound itemCollect
			Delete newItem.School
		EndIf
		Case 35
			If ImagesCollide(winnersteps,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 35
			creditPoints = creditPoints + 9
			PlaySound itemCollect
			Delete newItem.School
		EndIf
		Case 36
			If ImagesCollide(globe,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 36
			creditPoints = creditPoints + 6
			PlaySound itemCollect
			Delete newItem.School
		EndIf
		Case 37
			If ImagesCollide(atlas,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 37
			creditPoints = creditPoints + 9
			PlaySound itemCollect
			Delete newItem.School
		EndIf
		Case 38
			If ImagesCollide(weather,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 38
			creditPoints = creditPoints + 14
			PlaySound itemCollect
			Delete newItem.School
		EndIf
		Case 39
			If ImagesCollide(friends,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 39
			creditPoints = creditPoints + 20
			PlaySound itemCollect
			Delete newItem.School
		EndIf
		Case 40
			If ImagesCollide(geyser,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 40
			creditPoints = creditPoints + 11
			PlaySound itemCollect
			Delete newItem.School
		EndIf
		Case 41
			If ImagesCollide(watercyclus,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 41
			creditPoints = creditPoints + 12
			PlaySound itemCollect
			Delete newItem.School
		EndIf
		Case 42
			If ImagesCollide(note,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 42
			creditPoints = creditPoints + 4
			PlaySound itemCollect
			Delete newItem.School
		EndIf
		Case 43
			If ImagesCollide(guitar,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 43
			creditPoints = creditPoints + 7
			PlaySound itemCollect
			Delete newItem.School
		EndIf
		Case 44
			If ImagesCollide(notepaper,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 44
			creditPoints = creditPoints + 8
			PlaySound itemCollect
			Delete newItem.School
		EndIf
		Case 45
			If ImagesCollide(loudspeaker,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 45
			creditPoints = creditPoints + 11
			PlaySound itemCollect
			Delete newItem.School
		EndIf
		Case 46
			If ImagesCollide(piano,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 46
			creditPoints = creditPoints + 10
			PlaySound itemCollect
			Delete newItem.School
		EndIf
		Case 47
			If ImagesCollide(conductor,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 47
			creditPoints = creditPoints + 12
			PlaySound itemCollect
			Delete newItem.School
		EndIf
		Case 48
			If ImagesCollide(buzz,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 48
			creditPoints = creditPoints + 9
			PlaySound itemCollect
			Delete newItem.School
		EndIf	
		Case 49
			If ImagesCollide(clefs,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 49
			creditPoints = creditPoints + 14
			PlaySound itemCollect
			Delete newItem.School
		EndIf
		Case 50
			If ImagesCollide(testglass,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 50
			creditPoints = creditPoints + 9
			PlaySound itemCollect
			Delete newItem.School
		EndIf
		Case 51
			If ImagesCollide(burner,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 51
			creditPoints = creditPoints + 4
			PlaySound itemCollect
			Delete newItem.School
		EndIf
		Case 52
			If ImagesCollide(nh3,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 52
			creditPoints = creditPoints + 12
			PlaySound itemCollect
			Delete newItem.School
		EndIf
		Case 53
			If ImagesCollide(goggles,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 53
			creditPoints = creditPoints + 10
			PlaySound itemCollect
			Delete newItem.School
			EndIf
		Case 54
			If ImagesCollide(kettle,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 54
			creditPoints = creditPoints + 14
			PlaySound itemCollect
			Delete newItem.School
		EndIf
		Case 55
			If ImagesCollide(c4,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 55
			creditPoints = creditPoints + 7
			PlaySound itemCollect
			Delete newItem.School
		EndIf
		Case 56
			If ImagesCollide(playray,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 56
			creditPoints = creditPoints + 13
			PlaySound itemCollect
			Delete newItem.School
		EndIf
		Case 57
			If ImagesCollide(joystick,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 57
			creditPoints = creditPoints + 7
			PlaySound itemCollect
			Delete newItem.School
		EndIf
		Case 58
			If ImagesCollide(pc_back,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 58
			creditPoints = creditPoints + 8
			PlaySound itemCollect
			Delete newItem.School
		EndIf
		Case 59
			If ImagesCollide(www,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 59
			creditPoints = creditPoints + 7
			PlaySound itemCollect
			Delete newItem.School
		EndIf
		Case 60
			If ImagesCollide(google,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 60
			creditPoints = creditPoints + 10
			PlaySound itemCollect
			Delete newItem.School
		EndIf
		Case 61
			If ImagesCollide(printer,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 61
			creditPoints = creditPoints + 13
			PlaySound itemCollect
			Delete newItem.School
		EndIf
		Case 62
			If ImagesCollide(abihelp,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 62
			creditPoints = creditPoints + 30
			PlaySound itemCollect
			Delete newItem.School
		EndIf
		Case 63
			If ImagesCollide(schillershead,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 63
			creditPoints = creditPoints + 30
			PlaySound itemCollect
			Delete newItem.School
		EndIf	
		Case 64
			If ImagesCollide(mephisto,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 64
			creditPoints = creditPoints + 30
			PlaySound itemCollect
			Delete newItem.School
		EndIf
		Case 65
			If ImagesCollide(dictionary,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 65
			creditPoints = creditPoints + 30
			PlaySound itemCollect
			Delete newItem.School
		EndIf
		Case 66
			If ImagesCollide(bratwurst,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 66
			creditPoints = creditPoints + 30
			PlaySound itemCollect
			Delete newItem.School
		EndIf
		Case 67
			If ImagesCollide(holyshit,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 67
			creditPoints = creditPoints + 30
			PlaySound itemCollect
			Delete newItem.School
		EndIf
		Case 68
			If ImagesCollide(calculator,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 68
			creditPoints = creditPoints + 30
			PlaySound itemCollect
			Delete newItem.School
		EndIf
		Case 69
			If ImagesCollide(infinite,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 69
			creditPoints = creditPoints + 30
			PlaySound itemCollect
			Delete newItem.School
		EndIf
		Case 70
			If ImagesCollide(henning,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 70
			creditPoints = creditPoints + 30
			PlaySound itemCollect
			Delete newItem.School
		EndIf
		Case 71
			If ImagesCollide(electricapple,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 71
			creditPoints = creditPoints + 30
			PlaySound itemCollect
			Delete newItem.School
		EndIf
		Case 72
			If ImagesCollide(acid,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 72
			creditPoints = creditPoints + 30
			PlaySound itemCollect
			Delete newItem.School
		EndIf
		Case 73
			If ImagesCollide(pse,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 73
			creditPoints = creditPoints + 30
			PlaySound itemCollect
			Delete newItem.School
		EndIf
		Case 74
			If ImagesCollide(asia,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 74
			creditPoints = creditPoints + 10
			PlaySound itemCollect
			Delete newItem.School
		EndIf
		Case 75
			If ImagesCollide(europe,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 75
			creditPoints = creditPoints + 10
			PlaySound itemCollect
			Delete newItem.School
		EndIf
		Case 76
			If ImagesCollide(northamerica,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 76
			creditPoints = creditPoints + 10
			PlaySound itemCollect
			Delete newItem.School
		EndIf
		Case 77
			If ImagesCollide(southamerica,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 77
			creditPoints = creditPoints + 10
			PlaySound itemCollect
			Delete newItem.School
		EndIf
		Case 78
			If ImagesCollide(australia,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 78
			creditPoints = creditPoints + 10
			PlaySound itemCollect
			Delete newItem.School
		EndIf
		Case 79
			If ImagesCollide(africa,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 79
			creditPoints = creditPoints + 10
			PlaySound itemCollect
			Delete newItem.School
		EndIf
		Case 80
			If ImagesCollide(antarctica,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0) Then
			message = 80
			creditPoints = creditPoints + 10
			PlaySound itemCollect
			Delete newItem.School
		EndIf
		End Select
	Next
End Function

Function DrawLessEnergyItems()
	Local newLessEnergyObject.LessEnergy
	For newLessEnergyObject.LessEnergy = Each LessEnergy
		Select(newLessEnergyObject\lessEnSort)
		;1=Toilet, 2=Food, 3=Ashtray
		Case 1
			DrawImage(toilet,((newLessEnergyObject\lessEnX)-movX),((newLessEnergyObject\lessEnY)-movY))
		Case 2
			DrawImage(food,((newLessEnergyObject\lessEnX)-movX),((newLessEnergyObject\lessEnY)-movY))
		Case 3
			DrawImage(ashtray,((newLessEnergyObject\lessEnX)-movX),((newLessEnergyObject\lessEnY)-movY))
		End Select
	Next
End Function 

Function LessEnergyItemsCollision()
	If(tut<>0) Then Return
	
	If(MilliSecs()-restTime>timeValue) Then
		Local newLessEnergyObject.LessEnergy
		For newLessEnergyObject.LessEnergy = Each LessEnergy
			Select(newLessEnergyObject\lessEnSort)
				Case 1
					If(ImagesCollide(toilet,((newLessEnergyObject\lessEnX)-movX),((newLessEnergyObject\lessEnY)-movY),0,player,playerPosX,playerPosY,0)) Then
						playerEnergy = playerEnergy-10
						Delete newLessEnergyObject.LessEnergy
					EndIf 
				Case 2
					If(ImagesCollide(food,((newLessEnergyObject\lessEnX)-movX),((newLessEnergyObject\lessEnY)-movY),0,player,playerPosX,playerPosY,0)) Then
						playerEnergy = playerEnergy-15
						Delete newLessEnergyObject.LessEnergy
					EndIf 
				Case 3
					If(ImagesCollide(ashtray,((newLessEnergyObject\lessEnX)-movX),((newLessEnergyObject\lessEnY)-movY),0,player,playerPosX,playerPosY,0)) Then
						playerEnergy = playerEnergy-20
						Delete newLessEnergyObject.LessEnergy
					EndIf
			End Select
		Next
	EndIf 
End Function 

;drawing the monsters
Function DrawMonsters()
	For newMonster.Monster = Each Monster
		Select(newMonster\sort)
			Case 1: DrawImage(monsterLazy, (newMonster\posX)-movX, (newMonster\posY)-movY, newMonster\frame)
			Case 2 : DrawImage(monsterNaughty, (newMonster\posX)-movX, (newMonster\posY)-movY, newMonster\frame)
			Case 3 : DrawImage(monsterZero, (newMonster\posX)-movX, (newMonster\posY)-movY, newMonster\frame)
			Case 4 : DrawImage(monsterHonk, (newMonster\posX)-movX, (newMonster\posY)-movY, newMonster\frame)
		End Select
	Next 	
End Function 

Function MoveMonsters()
	If(moveAny<>1) Then Return
	
	If(MilliSecs()-restTime>timeValue) Then
		For newMonster.Monster = Each Monster
			If(newMonster\sort=1) Then 
				If(newMonster\direction=1) Then
					If(newMonster\posX-newMonster\startX<=80) Then
						newMonster\posX = newMonster\posX+2
						If(newMonster\frame>3) Then newMonster\frame = 0
						newMonster\animCounter = newMonster\animCounter-1
						If(newMonster\animCounter=0) Then
							newMonster\animCounter = 8
							newMonster\frame = newMonster\frame+1
							If(newMonster\frame=4) Then newMonster\frame = 0
						EndIf 
					EndIf
					If(newMonster\posX-newMonster\startX>80) Then newMonster\direction = 0 ;change left
				ElseIf(newMonster\direction=0) Then
					If(newMonster\posX-newMonster\startX>=-80) Then 
						newMonster\posX = newMonster\posX-2
						If(newMonster\frame>3) Then newMonster\frame = 0
						newMonster\animCounter = newMonster\animCounter-1
						If(newMonster\animCounter=0) Then
							newMonster\animCounter = 8
							newMonster\frame = newMonster\frame+1
							If(newMonster\frame>3) Then newMonster\frame = 0
						EndIf 
					EndIf
					If(newMonster\posX-newMonster\startX<-80) Then newMonster\direction = 1 ;change right
				EndIf
			ElseIf(newMonster\sort=2) Then
				If(newMonster\direction=1) Then
					If(newMonster\posX-newMonster\startX<=70) Then
						newMonster\posX = newMonster\posX + 2
						If(newMonster\frame>4) Then newMonster\frame = 0
						newMonster\animCounter = newMonster\animCounter-1
						If(newMonster\animCounter = 0) Then
							newMonster\animCounter = 8
							newMonster\frame = newMonster\frame+1
							If(newMonster\frame>4) Then newMonster\frame = 0
						EndIf 
					EndIf 
					If(newMonster\posX-newMonster\startX>70) Then newMonster\direction = 0 ;change left
				ElseIf(newMonster\direction=0) Then
					If(newMonster\posX-newMonster\startX>=-70) Then
						newMonster\posX = newMonster\posX - 2
						If(newMonster\frame>8) Then newMonster\frame = 5
						newMonster\animCounter = newMonster\animCounter-1
						If(newMonster\animCounter=0) Then
							newMonster\animCounter = 8
							newMonster\frame = newMonster\frame+1
							If(newMonster\frame>8) Then newMonster\frame = 5
						EndIf 
					EndIf
					If(newMonster\posX-newMonster\startX<-70) Then newMonster\direction = 1 ;change right
				EndIf
			ElseIf(newMonster\sort=3) Then
				If(newMonster\direction=1) Then
					If(newMonster\posX-newMonster\startX<=70) Then
						newMonster\posX = newMonster\posX+2
						If(newMonster\frame>3) Then newMonster\frame = 0
						newMonster\animCounter = newMonster\animCounter-1
						If(newMonster\animCounter=0) Then
							newMonster\animCounter = 8
							newMonster\frame = newMonster\frame+1
							If(newMonster\frame>3) Then newMonster\frame = 0
						EndIf 
					EndIf
					If(newMonster\posX-newMonster\startX>70) Then newMonster\direction = 0 ;change left
				ElseIf(newMonster\direction=0) Then
					If(newMonster\posX-newMonster\startX>=-70) Then
						newMonster\posX = newMonster\posX-2
						If(newMonster\frame>3) Then newMonster\frame = 0
						newMonster\animCounter = newMonster\animCounter-1
						If(newMonster\animCounter=0) Then
							newMonster\animCounter = 8
							newMonster\frame = newMonster\frame+1
							If(newMonster\frame>3) Then newMonster\frame = 0
						EndIf 
					EndIf
					If(newMonster\posX-newMonster\startX<-70) Then newMonster\direction = 1 ;change right
				EndIf
			ElseIf(newMonster\sort=4) Then
				If(newMonster\direction=1) Then
					If(newMonster\posX-newMonster\startX<=70) Then
						newMonster\posX = newMonster\posX+Rnd(1,6)
						If(newMonster\frame>2) Then newMonster\frame = 0
						newMonster\animCounter = newMonster\animCounter-1
						If(newMonster\animCounter=0) Then
							newMonster\animCounter = 8
							newMonster\frame = newMonster\frame+1
							If(newMonster\frame>2) Then newMonster\frame = 0
						EndIf 
					EndIf
					If(newMonster\posX-newMonster\startX>70) Then newMonster\direction = 0 ;change left
				ElseIf(newMonster\direction=0) Then
					If(newMonster\posX-newMonster\startX>=-70) Then
						newMonster\posX = newMonster\posX-Rnd(1,6)
						If(newMonster\frame>5) Then newMonster\frame = 3
						newMonster\animCounter = newMonster\animCounter-1
						If(newMonster\animCounter=0) Then
							newMonster\animCounter = 8
							newMonster\frame = newMonster\frame+1
							If(newMonster\frame>5) Then newMonster\frame = 3
						EndIf 
					EndIf
					If(newMonster\posX-newMonster\startX<-70) Then newMonster\direction = 1 ;change right
				EndIf
			EndIf  
		Next
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
				playerMove = 0
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
				playerMove = 0
				doDrawPlayer = 0
			EndIf 
			ShowAbi() 
	End Select

	;another important thing: if energy <= 0 then start last level again
	If(playerEnergy<=0 Or KeyHit(68)) Then
		If(start=1) Then
			start = 0
			PlaySound(levelAgain)
			If(GivePos=0) Then
				GivePos = 1
				Select level
					Case 2
						movX = MOV_X_LVL1
						movY = MOV_Y_LVL1
					Case 3
						movX = MOV_X_LVL2
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
				Delay(1000)
				playerEnergy = 100
				lives = lives-1 
			ElseIf(GivePos=1) Then
				GivePos = 0
				Select level
					Case 2
						movX = MOV_X_LVL1
						movY = MOV_Y_LVL1
					Case 3
						movX = MOV_X_LVL2
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
				Delay(1000)
				playerEnergy = 100
				lives = lives-1
			EndIf
		ElseIf(start=0) Then
			start = 1
			If(GivePos=0) Then
				GivePos = 1
				Select level
					Case 2
						movX = MOV_X_LVL1
						movY = MOV_Y_LVL1
					Case 3
						movX = MOV_X_LVL2
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
				Delay(1000)
				playerEnergy = 100
				lives = lives-1 
			ElseIf(GivePos=1) Then
				GivePos = 0
				Select level
					Case 2
						movX = MOV_X_LVL1
						movY = MOV_Y_LVL1
					Case 3
						movX = MOV_X_LVL2
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
				Delay(1000)
				playerEnergy = 100
				lives = lives-1 
			EndIf 
		EndIf 
	EndIf   
	If(lives<=0) Then
		Delete Each Coin
		Delete Each Energy
		Delete Each School
		Delete Each LessEnergy
		Delete Each Monster
		Delete Each Teacher
		Delete Each Sneak
		Delete Each Rest
		LoadLevel(1)
		text_var = 0
		movX = 5400
		movY = 480
		Text(200,200,"Du bist zu oft sitzen geblieben. Jetzt musst du leider wieder von vorne anfangen.")
		Text(200,215,"Bitte [Enter] drücken...")
		If(KeyHit(28)) Then
			movX = (-288)
			movY = 480
			level = 1
			lives = 10
		EndIf
	EndIf
End Function

Function MonsterCollision()
	If(moveAny<>1) Then Return
	
	If(MilliSecs()-restTime>timeValue) Then	; if player didn't collect a Rest
		For newMonster.Monster = Each Monster
			Select newMonster\sort
				Case 1
					If(ImagesCollide(monsterLazy,(newMonster\posX)-movX,(newMonster\posY)-movY,0,player,playerPosX,playerPosY,0)) Then
						playerEnergy = playerEnergy-15
						Delete newMonster.Monster
					EndIf
				Case 2
					If(ImagesCollide(monsterNaughty,(newMonster\posX)-movX,(newMonster\posY)-movY,0,player,playerPosX,playerPosY,0)) Then
						creditPoints = creditPoints-15
						Delete newMonster.Monster
					EndIf 
				Case 3
					If(ImagesCollide(monsterZero,(newMonster\posX)-movX,(newMonster\posY)-movY,0,player,playerPosX,playerPosY,0)) Then
						playerEnergy = playerEnergy-25
						Delete newMonster.Monster
					EndIf 
				Case 4
					If(ImagesCollide(monsterHonk,(newMonster\posX)-movX,(newMonster\posY)-movY,0,player,playerPosX,playerPosY,0)) Then
						playerEnergy = playerEnergy-30
						creditPoints = creditPoints-Rnd(10,30)
						Delete newMonster.Monster
					EndIf 
			End Select
		Next
	EndIf
End Function

Function DrawTeacher()
	Local newTeacher.Teacher
	For newTeacher.Teacher = Each Teacher
		DrawImage(teacher,(newTeacher\posX)-movX,(newTeacher\posY)-movY,newTeacher\frame)
	Next
End Function 

Function MoveTeacher()
	If(moveAny=0) Then Return
	
	Local newTeacher.Teacher
	For newTeacher.Teacher = Each Teacher
		If(newTeacher\direction=1) Then
			If(newTeacher\posX-newTeacher\startX<=80) Then
				newTeacher\posX = newTeacher\posX+2
				If newTeacher\frame>3 Then newTeacher\frame = 0
				newTeacher\animCounter = newTeacher\animCounter-1
				If newTeacher\animCounter = 0 Then
					newTeacher\animCounter = 6
					newTeacher\frame = newTeacher\frame+1
					If newTeacher\frame=3 Then newTeacher\frame = 0
				EndIf
			EndIf  	
			If(newTeacher\posX-newTeacher\startX>80) Then newTeacher\direction = 0
		ElseIf(newTeacher\direction=0) Then
			If(newTeacher\posX-newTeacher\startX>=-80) Then
				newTeacher\posX = newTeacher\posX-2
				If(newTeacher\frame<3) Then newTeacher\frame = 3
				newTeacher\animCounter = newTeacher\animCounter-1
				If(newTeacher\animCounter=0) Then
					newTeacher\animCounter = 6
					newTeacher\frame = newTeacher\frame+1
					If(newTeacher\frame>5) Then newTeacher\frame = 3
				EndIf 
			EndIf 
			If(newTeacher\posX-newTeacher\startX<-80) Then newTeacher\direction = 1
		EndIf
	Next
End Function

Function TeacherTrade()
	If(doTrade<>1) Then Return
	;just after the first messages

	If(score>=15) Then	;if player has enough money to deal
		Local newTeacher.Teacher
		For newTeacher.Teacher = Each Teacher
			If(ImagesCollide(teacher,((newTeacher\posX)-movX),((newTeacher\posY)-movY),0,player,playerPosX,playerPosY,0)) Then
				moveAny = 0
				playerMove = 0
				jumpAllow = 0
				
				Select nextStep
					Case 0
						point = (score - (score Mod 15))/15	;e.g. you have 43 Coin, so you can get 8 points, 3 left
						Text(0,15,tradeText(0)+point+tradeText(1))
						If(KeyHit(28)) Then nextStep = nextStep+1
					Case 1
						Locate(0,30)
						choice$ = Trim$(Input$(tradeText(2)))
						If(KeyHit(28) And choice>=0) Then nextStep = nextStep+1
					Case 2
						If(Trim$(choice$) = "ja") Then
							Text(0,15,tradeText(3)+point+tradeText(4))
							
							If KeyHit(28) Then
								Delete newTeacher
								text_var = text_var +1 ;this is only for the tutorial
								moveAny = 1
								playerMove = 1
								nextStep = 0			;reset for next time :)
								score = score - (point*10)
								creditPoints = creditPoints+point
								jumpAllow = 1
								Exit
							EndIf
						ElseIf(Trim$(choice$) = "nein") Then
							Text(0,15,tradeText(5))
							
							If(KeyHit(28)) Then
								Delete newTeacher
								text_var = text_var+1
								moveAny = 1
								playerMove = 1
								nextStep = 0
								jumpAllow = 1
								Exit 
							EndIf
						Else
							Text(0,15,tradeText(6)+choice+tradeText(7))
							
							If(KeyHit(28)) Then
								text_var = text_var+1
								moveAny = 1
								playerMove = 1
								nextStep = 0
								jumpAllow = 1
								Delete newTeacher
								Exit
							EndIf 
						EndIf
				End Select
			EndIf
		Next
	ElseIf(score<15) Then
		For newTeacher.Teacher = Each Teacher
			If(ImagesCollide(teacher,((newTeacher\posX)-movX),((newTeacher\posY)-movY),0,player,playerPosX,playerPosY,0)) Then
				
				Text(0,0,tradeText(8))
				Text(0,15,tradeText(9))
				
				If(KeyHit(28)) Then
					Delete newTeacher
					text_var = text_var+1
					moveAny = 1
					Exit
				EndIf
			EndIf
		Next
	EndIf
End Function 

Function DrawSneak()
	Local newSneak.Sneak
	For newSneak.Sneak = Each Sneak
		DrawImage(sneak,((newSneak\posX)-movX),((newSneak\posY)-movY),newSneak\frame)
	Next
End Function

Function MoveSneak()
	If(moveAny<>0) Then
		Local newSneak.Sneak
		For newSneak.Sneak = Each Sneak
			If(newSneak\direction=1) Then 
				If(newSneak\posX-newSneak\startX<=80) Then
					newSneak\posX = newSneak\posX +2
					If(newSneak\frame>3) Then newSneak\frame = 0
					newSneak\animCounter = newSneak\animCounter -1
					If(newSneak\animCounter=0) Then
						newSneak\animCounter = 6
						newSneak\frame = newSneak\frame +1
						If(newSneak\frame=3) Then newSneak\frame = 0
					EndIf
				EndIf
				If(newSneak\posX-newSneak\startX>80) Then newSneak\direction = 0
			ElseIf(newSneak\direction=0) Then 
				If(newSneak\posX-newSneak\startX>=-80) Then
					newSneak\posX = newSneak\posX -2
					If(newSneak\frame<3) Then newSneak\frame = 3
					newSneak\animCounter = newSneak\animCounter-1
					If(newSneak\animCounter=0) Then
						newSneak\animCounter = 6
						newSneak\frame = newSneak\frame+1
						If(newSneak\frame>5) Then newSneak\frame = 3
					EndIf 
				EndIf 
				If(newSneak\posX-newSneak\startX<-80) Then newSneak\direction = 1
			EndIf 
		Next
	EndIf
End Function

Function SneakTrade()
	If(doTrade<>1) Then Return

	;attention: sneak doesn't care if the player has enough coins or not
	
		Local newSneak.Sneak
		For newSneak.Sneak = Each Sneak
			If(ImagesCollide(sneak,((newSneak\posX)-movX),((newSneak\posY)-movY),0,player,playerPosX,playerPosY,0)) Then
				moveAny = 0
				playerMove = 0
				jumpAllow = 0
		
				Select nextStep ;as in the text_var-funct., the steps are requested after each other
					Case 0 ;standard
						point = Rnd(8,30); he tells you an arbitrary amount of points!
						Text(0,15,tradeText(0)+point+tradeText(1))
						If(KeyHit(28)) Then nextStep = nextStep+1
					Case 1
						Locate(0,30)
						choice$ = Trim$(Input$(tradeText(2)))
						
						If(KeyHit(28) And choice>=0) Then nextStep = nextStep+1
					Case 2
						If(Trim$(choice$) <> "nein") Then
							Text(0,15,tradeText(10))
							Color(255,0,0)
							Text(0,30,tradeText(11))
							Color(128,255,128)
							Text(0,45,tradeText(12))
							
							If(KeyHit(28)) Then
								score = 0
								creditPoints = creditPoints-15
								text_var = text_var+1
								moveAny = 1
								playerMove = 1
								nextStep = 0
								jumpAllow = 1
								Delete newSneak
								Exit
							EndIf
						ElseIf(Trim$(choice$) = "nein") Then
							Text(0,15,tradeText(13))
							
							If(KeyHit(28)) Then
								text_var = text_var+1
								moveAny = 1
								playerMove = 1
								nextStep = 0
								jumpAllow = 1
								Delete newSneak
								Exit
							EndIf
						EndIf
				End Select
			EndIf
		Next
End Function 

Function DrawRest()
	Local newRest.Rest
	For newRest.Rest = Each Rest
		If(newRest\sort=1) Then
			DrawImage(eighthRest,(newRest\posX)-movX,(newRest\posY)-movY)
		ElseIf(newRest\sort=2) Then
			DrawImage(crotchetRest,(newRest\posX)-movX,(newRest\posY)-movY)
		EndIf
	Next	
End Function 

Function RestCollision()
	Local newRest.Rest
	For newRest.Rest = Each Rest
		If ImagesCollide(eighthRest,(newRest\posX)-movX,(newRest\posY)-movY,0,player,playerPosX,playerPosY,0) Then
			Delete newRest.Rest
			restTime = MilliSecs()
			timeValue = 7500
		ElseIf ImagesCollide(crotchetRest,(newRest\posX)-movX,(newRest\posY)-movY,0,player,playerPosX,playerPosY,0) Then
			Delete newRest.Rest
			restTime = MilliSecs()
			timeValue = 15000
		EndIf 
	Next 
End Function

Function PlayerShoot()
	If(moveAny=0) Then Return
	If(shootAble=0) Then Return
	
	If(KeyHit(157)) Then ; if ctrl-right is hit ==> change back to KeyDown!!
		PlaySound(throwBook)
		shootAble = 0
		shootTime = MilliSecs()
		
		If(movingRight) Then 
			Local newBookRight.ShootRight = New ShootRight
			newBookRight.ShootRight\shootX = ((playerPosX)+movX)+10
			newBookRight.ShootRight\shootY = ((playerPosY)+movY)
		Else
			Local newBookLeft.ShootLeft = New ShootLeft
			newBookLeft.ShootLeft\shootX = ((playerPosX)+movX)-10
			newBookLeft.ShootLeft\shootY = ((playerPosY)+movY)
		EndIf
	EndIf 
End Function 

Function DrawShoot()
	If(moveAny=0) Then Return
	
	Local newBookRight.ShootRight
	For newBookRight.ShootRight = Each ShootRight
		DrawImage(book,(newBookRight.ShootRight\shootX)-movX,(newBookRight.ShootRight\shootY)-movY)
		newBookRight\shootX = newBookRight\shootX+9
	Next
	
	Local newBookLeft.ShootLeft
	For newBookLeft.ShootLeft = Each ShootLeft
		DrawImage(book,(newBookLeft.ShootLeft\shootX)-movX,(newBookLeft.ShootLeft\shootY)-movY)
		newBookLeft\shootX = newBookLeft\shootX-9
	Next
End Function

Function ShootCollision()
	Local newBookRight.ShootRight
	For newMonster.Monster = Each Monster
		For newBookRight.ShootRight = Each ShootRight
			If(ImagesCollide(book,((newBookRight\shootX)-movX),((newBookRight\shootY)-movY),0,monsterLazy,((newMonster\posX)-movX),((newMonster\posY)-movY),0)) Then
				Delete newMonster.Monster
				Delete newBookRight.ShootRight
				PlaySound(monsterDie)
				shootAble = 1 
			ElseIf(ImagesCollide(book,((newBookRight\shootX)-movX),((newBookRight\shootY)-movY),0,monsterNaughty,((newMonster\posX)-movX),((newMonster\posY)-movY),0)) Then
				Delete newMonster.Monster
				Delete newBookRight.ShootRight
				PlaySound(monsterDie)
				shootAble = 1
			ElseIf(ImagesCollide(book,((newBookRight\shootX)-movX),((newBookRight\shootY)-movY),0,monsterZero,((newMonster\posX)-movX),((newMonster\posY)-movY),0)) Then
				Delete newMonster.Monster
				Delete newBookRight.ShootRight
				PlaySound(monsterDie)
				shootAble = 1
			ElseIf(ImagesCollide(book,((newBookRight\shootX)-movX),((newBookRight\shootY)-movY),0,monsterHonk,((newMonster\posX)-movX),((newMonster\posY)-movY),0)) Then
				Delete newMonster.Monster
				Delete newBookRight.ShootRight
				PlaySound(monsterDie)
				shootAble = 1
			EndIf
		Next
	Next
	
	Local newBookLeft.ShootLeft
	For newMonster.Monster = Each Monster
		For newBookLeft.ShootLeft = Each ShootLeft
			If(ImagesCollide(book,((newBookLeft\shootX)-movX),((newBookLeft\shootY)-movY),0,monsterLazy,((newMonster\posX)-movX),((newMonster\posY)-movY),0)) Then
				Delete newMonster.Monster
				Delete newBookLeft.ShootLeft
				PlaySound(monsterDie)
				shootAble = 1 
			ElseIf(ImagesCollide(book,((newBookLeft\shootX)-movX),((newBookLeft\shootY)-movY),0,monsterNaughty,((newMonster\posX)-movX),((newMonster\posY)-movY),0)) Then
				Delete newMonster.Monster
				Delete newBookLeft.ShootLeft
				PlaySound(monsterDie)
				shootAble = 1
			ElseIf(ImagesCollide(book,((newBookLeft\shootX)-movX),((newBookLeft\shootY)-movY),0,monsterZero,((newMonster\posX)-movX),((newMonster\posY)-movY),0)) Then
				Delete newMonster.Monster
				Delete newBookLeft.ShootLeft
				PlaySound(monsterDie)
				shootAble = 1
			ElseIf(ImagesCollide(book,((newBookLeft\shootX)-movX),((newBookLeft\shootY)-movY),0,monsterHonk,((newMonster\posX)-movX),((newMonster\posY)-movY),0)) Then
				Delete newMonster.Monster
				Delete newBookLeft.ShootLeft
				PlaySound(monsterDie)
				shootAble = 1
			EndIf
		Next
	Next

	;if the book doesnt collide with any item, it will be deleted after 1.5 seconds!
	For newBookRight.ShootRight = Each ShootRight
		If((MilliSecs()-shootTime)>1500) Then
			Delete newBookRight.ShootRight
			shootAble = 1
		EndIf
	Next
	
	For newBookLeft.ShootLeft = Each ShootLeft
		If((MilliSecs()-shootTime)>1500) Then
			Delete newBookLeft.ShootLeft
			shootAble = 1
		EndIf
	Next
End Function 

Function PlayerJump()
	If(jumpAllow<>1) Then Return	; if player is not at the beginning of tutorial level 

	If(KeyDown(57)) Then
		If(jump=False) Then
			jump=True
			PlaySound(jumpSound)
			posYTemp = 18
		EndIf
	EndIf ; otherwise, it would keep the player in the air
	
	;in Case of collision
	If((currentLevel((playerPosX+movX+12) /32,(playerPosY+movY) /32)=1 Or currentLevel((playerPosX+movX) /32,(playerPosY+movY) /32)=1) And jump=True) Then
		jump = True
		posYTemp = 0 
	EndIf 
	
	
	If(jump=True) Then
		posYTemp = posYTemp-1
		movY = movY-posYTemp
	EndIf
	
	If(posYTemp<=0) Then
		If(currentLevel((playerPosX+movX+12)/32,(playerPosY+movY+32)/32)=1 Or currentLevel((playerPosX+movX+20)/32,(playerPosY+movY+32)/32)=1) Then 
			jump = False
			Local temp_y = movY /32	;\
			movY = temp_y *32	;/ sets the exact position of Player if he stands in a tile
		EndIf
	EndIf
	
	
	If(jump=False) Then
		If(currentLevel((playerPosX+movX+12)/32,(playerPosY+movY+32)/32)=0) Then	;if there is no brick above him
			jump = True
			posYTemp = 0
		EndIf
	EndIf 
	
	If(movY<-416) Then
		movY = -416
		jump = True
		posYTemp = 0
	EndIf
	
	If(movY>=480) Then 
		movY = 480		; the max. value of Movy must be set!
		jump = False
	EndIf
End Function 

Function LoadLevel(number)
	Local newCoin.Coin
	Local newEnergyObject.Energy
	Local newItem.School
	Local newLessEnergyObject.LessEnergy
	Local newTeacher.Teacher
	Local newSneak.Sneak
	Local newDoor.Door
	Local newRest.Rest
	
	Local currentLine$
	Local currentCommaPos
	
	Select(number)
		Case 1
			stream = ReadFile("lvl/tut.lvl")
			ReadLine(stream)	;Coin heading
			Repeat
				currentLine$ = ReadLine(stream)
				If(currentLine$="") Then Exit
				newCoin.Coin = New Coin
				newCoin\coinX = Left(currentLine,4)
				newCoin\coinY = Mid(currentLine,6,3)
				newCoin\sort = Right(currentLine,1)
			Forever
			ReadLine(stream)	;energy heading
			Repeat
				currentLine$ = ReadLine(stream)
				If(currentLine$="") Then Exit
				newEnergyObject.Energy = New Energy
				newEnergyObject\enX = Left(currentLine,3)
				newEnergyObject\enY = Mid(currentLine,5,3)
				newEnergyObject\sort = Right(currentLine,1)
			Forever
			ReadLine(stream)	;items heading
			Repeat
				currentLine$ = ReadLine(stream)
				If(currentLine$="") Then Exit
				newItem.School = New School
				newItem\schoolX = Left(currentLine,3)
				newItem\schoolY = Mid(currentLine,5,3)
				newItem\schoolSort = Right(currentLine,1)
			Forever
			ReadLine(stream)	;less energy heading
			Repeat
				currentLine$ = ReadLine(stream)
				If(currentLine$="") Then Exit
				newLessEnergyObject.LessEnergy = New LessEnergy
				newLessEnergyObject\lessEnX = Left(currentLine,3)
				newLessEnergyObject\lessEnY = Mid(currentLine,5,3)
				newLessEnergyObject\lessEnSort = Right(currentLine,1)
			Forever
			ReadLine(stream)	;monster heading
			Repeat
				currentLine$ = ReadLine(stream)
				If(currentLine$="") Then Exit
				newMonster.Monster = New Monster
				newMonster\sort = Left(currentLine,1)
				newMonster\posX = Mid(currentLine,3,4)
				newMonster\posY = Mid(currentLine,8,3)
				newMonster\direction = Mid(currentLine,12,1)
				newMonster\animCounter = Mid(currentLine,14,1)
				newMonster\frame = Mid(currentLine,16,1)
				newMonster\startX = Mid(currentLine,18,4)
				newMonster\energy = Right(currentLine,3)
			Forever
			ReadLine(stream)	;teacher heading
			Repeat
				currentLine$ = ReadLine(stream)
				If(currentLine$="") Then Exit
				newTeacher.Teacher = New Teacher
				newTeacher\posX= Left(currentLine,4)
				newTeacher\posY= Mid(currentLine,6,3)
				newTeacher\frame = Mid(currentLine,10,1)
				newTeacher\direction = Mid(currentLine,12,1)
				newTeacher\animCounter = Mid(currentLine,14,1)
				newTeacher\startX = Right(currentLine,4)
			Forever
			ReadLine(stream)	;sneak heading
			Repeat
				currentLine$ = ReadLine(stream)
				If(currentLine$="") Then Exit
				newSneak.Sneak = New Sneak
				newSneak\posX = Left(currentLine,4)
				newSneak\posY = Mid(currentLine,6,3)
				newSneak\frame = Mid(currentLine,10,1)
				newSneak\direction = Mid(currentLine,12,1)
				newSneak\animCounter = Mid(currentLine,14,1)
				newSneak\startX = Right(currentLine,4)
			Forever
			ReadLine(stream)	;level door heading
			currentLine$ = ReadLine(stream)
			newDoor.Door = New Door
			newDoor\posX = Left(currentLine,4)
			newDoor\posY = Mid(currentLine,6,3)
			newDoor\frame = Right(currentLine,1)
			ReadLine(stream)	;empty
			ReadLine(stream)	;bricks heading
			For brickY = 0 To 24
				currentLine$ = ReadLine(stream)
				For brickX = 0 To 181
					currentLevel(brickX,brickY) = Mid(currentLine,(brickX+1)*2-1,1)
				Next
			Next
			CloseFile(stream)
		Case 2,3,4,5
			pointMinimum = 70 ; here, the minimum of points that a player has to collect, is set
			If(xyz=0) Then
				movX = MOV_X_LVL1
				movY = MOV_Y_LVL1
				tut = 0
			EndIf 
			
			stream = ReadFile("lvl/"+(number+1)+".lvl")
			ReadLine(stream)	;Coin heading
			Repeat
				currentLine$ = ReadLine(stream)
				If(currentLine$="") Then Exit
				currentCommaPos = Instr(currentLine,",")
				newCoin.Coin = New Coin
				newCoin\coinX = Left(currentLine,currentCommaPos-1)
				newCoin\coinY = Mid(currentLine,currentCommaPos+1,3)
				newCoin\sort = Right(currentLine,1)
			Forever
			ReadLine(stream)	;energy heading
			Repeat
				currentLine$ = ReadLine(stream)
				If(currentLine$="") Then Exit
				currentCommaPos = Instr(currentLine,",")
				newEnergyObject.Energy = New Energy
				newEnergyObject\enX = Left(currentLine,currentCommaPos-1)
				newEnergyObject\enY = Mid(currentLine,currentCommaPos+1,3)
				newEnergyObject\sort = Right(currentLine,1)
			Forever
			ReadLine(stream)	;items heading
			Repeat
				currentLine$ = ReadLine(stream)
				If(currentLine$="") Then Exit
				currentCommaPos = Instr(currentLine,",")
				newItem.School = New School
				newItem\schoolX = Left(currentLine,currentCommaPos-1)
				newItem\schoolY = Mid(currentLine,currentCommaPos+1,3)
				currentCommaPos = Instr(currentLine,",",currentCommaPos+1)
				newItem\schoolSort = Mid(currentLine,currentCommaPos+1)
			Forever
			ReadLine(stream)	;less energy heading
			Repeat
				currentLine$ = ReadLine(stream)
				If(currentLine$="") Then Exit
				currentCommaPos = Instr(currentLine,",")
				newLessEnergyObject.LessEnergy = New LessEnergy
				newLessEnergyObject\lessEnX = Left(currentLine,currentCommaPos-1)
				newLessEnergyObject\lessEnY = Mid(currentLine,currentCommaPos+1,3)
				newLessEnergyObject\lessEnSort = Right(currentLine,1)
			Forever
			ReadLine(stream)	;monster heading
			Repeat
				currentLine$ = ReadLine(stream)
				If(currentLine$="") Then Exit
				currentCommaPos = Instr(currentLine,",")
				newMonster.Monster = New Monster
				newMonster\sort = Left(currentLine,1)
				newMonster\posX = Mid(currentLine,currentCommaPos+1,Instr(currentLine,",",currentCommaPos+1))
				currentCommaPos = Instr(currentLine,",",currentCommaPos+1)
				newMonster\posY = Mid(currentLine,currentCommaPos+1,3)
				newMonster\direction = Mid(currentLine,currentCommaPos+5,1)
				newMonster\animCounter = Mid(currentLine,currentCommaPos+7,1)
				newMonster\frame = Mid(currentLine,currentCommaPos+9,1)
				newMonster\startX = Mid(currentLine,currentCommaPos+11,Instr(currentLine,",",currentCommaPos+1))
				newMonster\energy = Right(currentLine,3)
			Forever
			ReadLine(stream)	;teacher heading
			Repeat
				currentLine$ = ReadLine(stream)
				If(currentLine$="") Then Exit
				newTeacher.Teacher = New Teacher
				newTeacher\posX = Left(currentLine,4)
				newTeacher\posY = Mid(currentLine,5,3)
				newTeacher\frame = Mid(currentLine,9,1)
				newTeacher\direction = Mid(currentLine,11,1)
				newTeacher\animCounter = Mid(currentLine,13,1)
				newTeacher\startX = Right(currentLine,4)
			Forever
			ReadLine(stream)	;sneak heading
			Repeat
				currentLine$ = ReadLine(stream)
				If(currentLine$="") Then Exit
				newSneak.Sneak = New Sneak
				newSneak\posX = Left(currentLine,4)
				newSneak\posY = Mid(currentLine,5,3)
				newSneak\frame = Mid(currentLine,9,1)
				newSneak\direction = Mid(currentLine,11,1)
				newSneak\animCounter = Mid(currentLine,13,1)
				newSneak\startX = Right(currentLine,4)
			Forever
			ReadLine(stream)	;level door heading
			currentLine$ = ReadLine(stream)
			newDoor.Door = New Door
			newDoor\posX = Left(currentLine,4)
			newDoor\posY = Mid(currentLine,6,3)
			newDoor\frame = Right(currentLine,1)
			ReadLine(stream)	;empty
			ReadLine(stream)	;bricks heading
			For brickY = 0 To 24
				currentLine$ = ReadLine(stream)
				For brickX = 0 To 181
					currentLevel(brickX,brickY) = Mid(currentLine,(brickX+1)*2-1,1)
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
				newEnergyObject.Energy = New Energy
				newEnergyObject\enX = Left(currentLine,currentCommaPos-1)
				newEnergyObject\enY = Mid(currentLine,currentCommaPos+1,Instr(currentLine,",",currentCommaPos+1))
				newEnergyObject\sort = Right(currentLine,1)
			Forever
			ReadLine(stream)	;item heading
			Repeat
				currentLine$ = ReadLine(stream)
				If(currentLine$="") Then Exit
				currentCommaPos = Instr(currentLine,",")
				newItem.School = New School
				newItem\schoolX = Left(currentLine,currentCommaPos-1)
				newItem\schoolY = Mid(currentLine,currentCommaPos+1,Instr(currentLine,",",currentCommaPos+1))
				newItem\schoolSort = Right(currentLine,2)
			Forever
			ReadLine(stream)	;less energy heading
			Repeat
				currentLine$ = ReadLine(stream)
				If(currentLine$="") Then Exit
				currentCommaPos = Instr(currentLine,",")
				newLessEnergyObject.LessEnergy = New LessEnergy
				newLessEnergyObject\lessEnX = Left(currentLine,currentCommaPos-1)
				newLessEnergyObject\lessEnY = Mid(currentLine,currentCommaPos+1,Instr(currentLine,",",currentCommaPos+1))
				newLessEnergyObject\lessEnSort = Right(currentLine,1)
			Forever
			ReadLine(stream)	;monster heading
			Repeat
				currentLine$ = ReadLine(stream)
				If(currentLine$="") Then Exit
				currentCommaPos = Instr(currentLine,",")
				newMonster.Monster = New Monster
				newMonster\sort = Left(currentLine,1)
				newMonster\posX = Mid(currentLine,3,currentCommaPos-1)
				newMonster\posY = Mid(currentLine,currentCommaPos+1,3)
				newMonster\direction = Mid(currentLine,currentCommaPos+6,1)
				newMonster\animCounter = Mid(currentLine,currentCommaPos+8,1)
				newMonster\frame = Mid(currentLine,currentCommaPos+10,1)
				newMonster\startX = Mid(currentLine,currentCommaPos+12,Len(currentLine)-(currentCommaPos+12)-4)
				newMonster\energy = Right(currentLine,3)
			Forever
			ReadLine(stream)	;rest heading
			Repeat
				currentLine$ = ReadLine(stream)
				If(currentLine$="") Then Exit
				currentCommaPos = Instr(currentLine,",")
				newRest.Rest = New Rest
				newRest\posX = Left(currentLine,currentCommaPos-1)
				newRest\posY = Mid(currentLine,currentCommaPos+1,3)
				newRest\sort = Right(currentLine,1)
			Forever
			ReadLine(stream)	;level door heading
			Repeat
				currentLine$ = ReadLine(stream)
				If(currentLine$="") Then Exit
				currentCommaPos = Instr(currentLine,",")
				newDoor.Door = New Door
				newDoor\posX = Left(currentLine,currentCommaPos-1)
				newDoor\posY = Mid(currentLine,currentCommaPos+1,3)
				newDoor\frame = Right(currentLine,1)
			Forever
			ReadLine(stream)	;empty
			ReadLine(stream)	;bricks heading
			For brickY = 0 To 24
				currentLine$ = ReadLine(stream)
				For brickX = 0 To 181
					currentLevel(brickX,brickY) = Mid(currentLine,(brickX+1)*2-1,1)
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
	If(doTut<>1) Then Return
	
	SetFont(tutFont)
	Color(200,200,0)

	;start the level
	Select text_var
		Case 0 ;the first text
			tut = 1
			jumpAllow = 0 ;player is not able to jump
			moveAny = 0
			
			Text(10,30,tutText(0))
			Text(10,45,tutText(1))
			Text(10,60,tutText(2))
			Text(10,75,tutText(3))
			
			If(KeyHit(28)) Then
				;playerMove = 1 ==> just after the last text
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
				playerMove = 1
			EndIf
		;now he walks to the root
		Case 5
			tut = 1
			
			Local newItem.School
			For newItem.School = Each School
				If(ImagesCollide(root,((newItem\schoolX)-movX),((newItem\schoolY)-movY),0,player,playerPosX,playerPosY,0)) Then
				didCollide = 1
				playerMove = 0
				Text(10,30,tutText(15))
				Text(10,45,tutText(16))
				Text(10,60,tutText(17))
				Text(10,75,tutText(18))
				Text(10,90,tutText(19))
			EndIf 
			Next 
			
			If(KeyHit(28) And didCollide) Then
				text_var = text_var+1
				playerMove = 1
				tut = 0
				didCollide = 0
			EndIf
	
		;now he walks to the sandwich
		Case 6
			tut = 1
			
			Local newEnergyObject.Energy
			For newEnergyObject.Energy = Each Energy
				If(ImagesCollide(sandwich,((newEnergyObject\enX)-movX),((newEnergyObject\enY)-movY),0,player,playerPosX,playerPosY,0)) Then
					didCollide = 1
					playerMove = 0
					Text(10,30,tutText(20))
					Text(10,45,tutText(21))
					Text(10,60,tutText(22))
					Text(10,75,tutText(23))
				EndIf	
			Next
			
			If(KeyHit(28) And didCollide) Then
				text_var = text_var+1
				playerMove = 1
				tut = 0
				didCollide = 0
			EndIf
		Case 7
			tut = 1
			
			Local newLessEnergyObject.LessEnergy
			For newLessEnergyObject.LessEnergy = Each LessEnergy
				If(ImagesCollide(toilet,((newLessEnergyObject\lessEnX)-movX),((newLessEnergyObject\lessEnY)-movY),0,player,playerPosX,playerPosY,0)) Then
					didCollide = 1
					playerMove = 0
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
				playerMove = 1
				tut = 0
				moveAny = 1
			EndIf
		Case 9
			tut = 1
			
			If(movX = 712) Then
				didCollide = 1 		;this is a few metres behind the 1st monster
				playerMove = 0
				moveAny = 0
				Text(10,30,tutText(33))
				Text(10,45,tutText(34))
				Text(10,60,tutText(35))
			EndIf
			
			If(KeyHit(28) And didCollide) Then
				text_var = text_var +1
				playerMove = 1
				moveAny = 1
				didCollide = 0
				movX = 716 			; he must be placed behind the orig. pos. else he repeats it always!
			EndIf 
		Case 10
			If(movX = 1012) Then		;this is a few metres behind the 2nd monster
				didCollide = 1
				playerMove = 0
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
				playerMove = 1
				didCollide = 0
				jumpAllow = 1
			EndIf 
		Case 12
			If(movX = 1664) Then 
				playerMove = 0
				didCollide = 1
				moveAny = 0
				jumpAllow = 0
				
				Text(10,30,tutText(42))
				Text(10,45,tutText(43))
			EndIf 
		
			If KeyHit(28) And didCollide Then
				text_var = text_var+1
				playerMove = 1
				moveAny = 1
				jumpAllow = 1
			EndIf
		Case 13
			Local newTeacher.Teacher
			For newTeacher.Teacher = Each Teacher
				If(ImagesCollide(teacher,((newTeacher\posX)-movX),((newTeacher\posY)-movY),0,player,playerPosX,playerPosY,0)) Then
					doTrade = 0
					moveAny = 0
					jumpAllow = 0
					didCollide = 1
					playerMove = 0
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
			playerMove = 0
			moveAny = 0
			Text(10,30,tutText(47))
			Text(10,45,tutText(48))
			Text(10,60,tutText(49))
			
			If(KeyHit(28)) Then
				text_var = text_var+1
				playerMove = 1
				didCollide = 0
				moveAny = 1
				jumpAllow = 1
				doTrade = 0
			EndIf 
		Case 16
			Local newSneak.Sneak
			For newSneak.Sneak = Each Sneak
				If(ImagesCollide(sneak,((newSneak\posX)-movX),((newSneak\posY)-movY),0,player,playerPosX,playerPosY,0)) Then
					nextStep = 0 ; this is just for that the variable can be used
					moveAny = 0
					jumpAllow = 0
					didCollide = 1
					playerMove = 0
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
			playerMove = 0
			moveAny = 0
			Text(10,30,tutText(55))
			
			If(KeyHit(28)) Then
				playerMove = 1
				moveAny = 1
				text_var = text_var+1 
				jumpAllow = 1
			EndIf 
		Case 19
			If(movX = 2184) Then 
				playerMove = 0
				Text(10,30,tutText(56))
				Text(10,45,tutText(57))
				Text(10,60,tutText(59))
				Text(10,75,tutText(60))
			EndIf 
			
			If(KeyHit(28)) Then
				playerMove = 1
				moveAny = 1
				doTrade = 1
				text_var = text_var +1 
				score = 0
				playerEnergy = 100
			EndIf 
	End Select 
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
		playerMove = 1
		lives = 3 ; for this level, player has 3 chances!
		;delete old stuff from level tutorial
		Delete Each Coin
		Delete Each Energy
		Delete Each School
		Delete Each LessEnergy
		Delete Each Monster
		Delete Each Teacher
		Delete Each Sneak
		Delete Each Rest
		Delete Each Door
		ResumeChannel(backGround)
	EndIf 
End Function 

Function WriteScore()
	If (level <> 6) And (level < 9) Then
		Text 570,0,"Punkte: "+creditPoints
		Text 570,15,"Geld: "+score+" Euro"
		Text 570,30,"Energie: "+playerEnergy+"%"
		Text 570,45,"Leben: "+lives
		Text 280,0,"mindestens benötigte Punkte: "+pointMinimum
	EndIf 
End Function 

Function DrawLevelDoor()
	If(creditPoints >= pointMinimum) Then
		Local newDoor.Door
		For newDoor.Door = Each Door
			DrawImage(door,((newDoor\posX)-movX),((newDoor\posY)-movY),newDoor\frame)
		Next
		ElseIf creditPoints < pointMinimum Then
			For newDoor.Door = Each Door
				DrawImage(door,((newDoor\posX)-movX),((newDoor\posY)-movY),0)
		Next
	EndIf 
End Function 

Function LevelDoorCollision()
	Local newDoor.Door
	For newDoor.Door = Each Door
		If ImagesCollide(door,((newDoor\posX)-movX),((newDoor\posY)-movY),0,player,playerPosX,playerPosY,0) Then
			If creditPoints >= pointMinimum Then ; if player has enough Coin to finish that level
				PauseChannel backGround
				Delay 500
				;delete the stuff of the level before
				Delete Each Coin
				Delete Each Energy
				Delete Each School
				Delete Each LessEnergy
				Delete Each Monster
				Delete Each Teacher
				Delete Each Sneak
				Delete Each Rest
				PlaySound(levelChange)
				
				level = level+1
				Delete newDoor.Door
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
				playerEnergy = playerEnergy+100
			Case "Punkte"
				creditPoints = creditPoints+100
			Case "Geld"
				score = score+100
			Case "Level+"
				Delete Each Coin
				Delete Each Energy
				Delete Each School
				Delete Each LessEnergy
				Delete Each Monster
				Delete Each Teacher
				Delete Each Sneak
				Delete Each Door
				playerMove = 1
				moveAny = 1
				jumpAllow = 1
				doTut = 0
				tut = 0
				playerEnergy = 100
				level = level+1
			Case "Level-"
				Delete Each Coin
				Delete Each Energy
				Delete Each School
				Delete Each LessEnergy
				Delete Each Monster
				Delete Each Teacher
				Delete Each Sneak
				Delete Each Door
				playerMove = 1
				moveAny = 1
				jumpAllow = 1
				doTut = 0
				tut = 0
				playerEnergy = 100
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
		stream = WriteFile("savegame.dat")
		WriteInt(stream,level)
		If(FileType("savegame.dat")=1) Then
			If(start=0) Then
				WriteInt(stream,(start+1))
			Else 
				WriteInt(stream,(start-1))
			EndIf
		Else
			WriteInt(stream,start)
		EndIf
		WriteInt(stream,doTrade)
		WriteInt(stream,nextStep)
		WriteInt(stream,point)
		WriteInt(stream,moveAny)
		WriteInt(stream,playerMove)
		WriteInt(stream,playerEnergy)
		WriteInt(stream,score)
		WriteInt(stream,lives)
		WriteInt(stream,creditPoints)
		WriteInt(stream,pointMinimum)
		WriteInt(stream,jumpAllow)
		WriteInt(stream,tut)
		WriteInt(stream,text_var)
		WriteInt(stream,doTut)
		WriteInt(stream,doDrawPlayer)
		WriteInt(stream,movX)
		WriteInt(stream,movY)
		CloseFile(stream)
	EndIf 
End Function

Function LoadGame()
	If(KeyHit(63)) Then
		If(FileType("savegame.dat")=1) Then
			stream = ReadFile("savegame.dat")
			level = ReadInt(stream)
			start = ReadInt(stream)
			doTrade = ReadInt(stream)
			nextStep = ReadInt(stream)
			point = ReadInt(stream)
			moveAny = ReadInt(stream)
			playerMove = ReadInt(stream)
			playerEnergy = ReadInt(stream)
			score = ReadInt(stream)
			lives = ReadInt(stream)
			creditPoints = ReadInt(stream)
			pointMinimum = ReadInt(stream)
			jumpAllow = ReadInt(stream)
			tut = ReadInt(stream)
			text_var = ReadInt(stream)
			doTut = ReadInt(stream)
			doDrawPlayer = ReadInt(stream)
			movX = ReadInt(stream)
			movY = ReadInt(stream)
			CloseFile(stream)
		EndIf
	EndIf
End Function 


Type Image
	Field obj
	Field animated
End Type

Type Coin
	Field coinX
	Field coinY
	Field sort
End Type

Type Energy
	Field enX
	Field enY
	Field sort
End Type

Type School
	Field schoolX
	Field schoolY
	Field schoolSort
End Type 

Type LessEnergy
	Field lessEnX
	Field lessEnY
	Field lessEnSort
End Type 

Type Monster
	Field sort
	Field posX
	Field posY
	Field direction
	Field animCounter
	Field frame 
	Field startX
	Field energy
End Type 

Type Teacher
	Field posX
	Field posY
	Field frame
	Field direction
	Field animCounter
	Field startX
End Type 

Type Sneak
	Field posX
	Field posY
	Field frame
	Field direction
	Field animCounter
	Field startX
End Type 

Type ShootRight
	Field shootX
	Field shootY
End Type

Type ShootLeft
	Field shootX
	Field shootY
End Type 

;level door
Type Door
	Field posX
	Field posY
	Field frame
End Type 

Type Rest
	Field posX
	Field posY
	Field sort
End Type
;~IDEal Editor Parameters:
;~F#1ED#56E#579#5EB#6C6#6E6#6ED#70E#760#767#788#7C3#7CE#7DD#7F2#802#849#87C#9A4#9E6
;~F#B04#B3A#B44#B51#B6D#B82#BB6#BC2#BE4#C01#C06#C0C#C12#C18#C1E#C29#C32#C3B#C40#C46
;~F#C4C
;~C#Blitz3D