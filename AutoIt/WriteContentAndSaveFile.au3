Run("notepad.exe","C:\Windows")
Sleep(2000)
Send("Welcome to AutoIt tool , It is used for Windows Automation")
Send("{ENTER}")
Send("This tool used Basic Language for Writing testcases ")
Sleep(2000)
WinClose("*Untitled - Notepad")
Sleep(2000)
ControlClick("Notepad","&Save","Button1")
Sleep(2000)
ControlSetText("Save As","*.txt","Edit1","D:\GitQARepository3\CurrentworkSpace\AutoIt\SampleFile.txt")
Sleep(2000)
ControlClick("Save As","&Save","Button2")
Sleep(2000)
if (WinExists("Confirm Save As")) Then
	ControlClick("Confirm Save As","&Yes","Button1")
EndIf

