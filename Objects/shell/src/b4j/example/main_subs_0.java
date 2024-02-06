package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _appstart(RemoteObject _form1,RemoteObject _args) throws Exception{
try {
		Debug.PushSubsStack("AppStart (main) ","main",0,main.ba,main.mostCurrent,18);
if (RapidSub.canDelegate("appstart")) { return b4j.example.main.remoteMe.runUserSub(false, "main","appstart", _form1, _args);}
Debug.locals.put("Form1", _form1);
Debug.locals.put("Args", _args);
 BA.debugLineNum = 18;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 19;BA.debugLine="MainForm = Form1";
Debug.ShouldStop(262144);
main._mainform = _form1;
 BA.debugLineNum = 20;BA.debugLine="MainForm.SetFormStyle(\"UNIFIED\")";
Debug.ShouldStop(524288);
main._mainform.runVoidMethod ("SetFormStyle",(Object)(RemoteObject.createImmutable("UNIFIED")));
 BA.debugLineNum = 21;BA.debugLine="MainForm.RootPane.LoadLayout(\"Main\")";
Debug.ShouldStop(1048576);
main._mainform.runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",main.ba,(Object)(RemoteObject.createImmutable("Main")));
 BA.debugLineNum = 22;BA.debugLine="splitMain.LoadLayout(\"LeftSide\")";
Debug.ShouldStop(2097152);
main._splitmain.runVoidMethodAndSync ("LoadLayout",main.ba,(Object)(RemoteObject.createImmutable("LeftSide")));
 BA.debugLineNum = 23;BA.debugLine="splitMain.LoadLayout(\"Center\")";
Debug.ShouldStop(4194304);
main._splitmain.runVoidMethodAndSync ("LoadLayout",main.ba,(Object)(RemoteObject.createImmutable("Center")));
 BA.debugLineNum = 24;BA.debugLine="splitMain.LoadLayout(\"RightSide\")";
Debug.ShouldStop(8388608);
main._splitmain.runVoidMethodAndSync ("LoadLayout",main.ba,(Object)(RemoteObject.createImmutable("RightSide")));
 BA.debugLineNum = 26;BA.debugLine="splitMain.SetSizeLimits(0, 0, 200)";
Debug.ShouldStop(33554432);
main._splitmain.runVoidMethod ("SetSizeLimits",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 200)));
 BA.debugLineNum = 27;BA.debugLine="splitMain.SetSizeLimits(2, 0, 300)";
Debug.ShouldStop(67108864);
main._splitmain.runVoidMethod ("SetSizeLimits",(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 300)));
 BA.debugLineNum = 28;BA.debugLine="CreateRightSizeLayout";
Debug.ShouldStop(134217728);
_createrightsizelayout();
 BA.debugLineNum = 29;BA.debugLine="lstSites.Items.AddAll(File.ReadList(File.DirAsset";
Debug.ShouldStop(268435456);
main._lstsites.runMethod(false,"getItems").runVoidMethod ("AddAll",(Object)(main.__c.getField(false,"File").runMethod(false,"ReadList",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("sites.txt")))));
 BA.debugLineNum = 30;BA.debugLine="MainForm.Show";
Debug.ShouldStop(536870912);
main._mainform.runVoidMethodAndSync ("Show");
 BA.debugLineNum = 31;BA.debugLine="lstSites.SelectedIndex = 0";
Debug.ShouldStop(1073741824);
main._lstsites.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btngo_action() throws Exception{
try {
		Debug.PushSubsStack("btnGo_Action (main) ","main",0,main.ba,main.mostCurrent,50);
if (RapidSub.canDelegate("btngo_action")) { return b4j.example.main.remoteMe.runUserSub(false, "main","btngo_action");}
RemoteObject _currentindex = RemoteObject.createImmutable(0);
 BA.debugLineNum = 50;BA.debugLine="Sub btnGo_Action";
Debug.ShouldStop(131072);
 BA.debugLineNum = 51;BA.debugLine="txtUrl.Text = txtUrl.Text.Trim";
Debug.ShouldStop(262144);
main._txturl.runMethod(true,"setText",main._txturl.runMethod(true,"getText").runMethod(true,"trim"));
 BA.debugLineNum = 52;BA.debugLine="If txtUrl.Text.Length = 0 Then Return";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",main._txturl.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 53;BA.debugLine="If txtUrl.Text.StartsWith(\"http\") = False Then tx";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",main._txturl.runMethod(true,"getText").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("http"))),main.__c.getField(true,"False"))) { 
main._txturl.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("http://"),main._txturl.runMethod(true,"getText")));};
 BA.debugLineNum = 54;BA.debugLine="Dim currentIndex As Int = lstHistory.Items.IndexO";
Debug.ShouldStop(2097152);
_currentindex = main._lsthistory.runMethod(false,"getItems").runMethod(true,"IndexOf",(Object)((main._txturl.runMethod(true,"getText"))));Debug.locals.put("currentIndex", _currentindex);Debug.locals.put("currentIndex", _currentindex);
 BA.debugLineNum = 55;BA.debugLine="If currentIndex > -1 Then lstHistory.Items.Remove";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean(">",_currentindex,BA.numberCast(double.class, -(double) (0 + 1)))) { 
main._lsthistory.runMethod(false,"getItems").runVoidMethod ("RemoveAt",(Object)(_currentindex));};
 BA.debugLineNum = 56;BA.debugLine="lstHistory.Items.InsertAt(0, txtUrl.Text)";
Debug.ShouldStop(8388608);
main._lsthistory.runMethod(false,"getItems").runVoidMethod ("InsertAt",(Object)(BA.numberCast(int.class, 0)),(Object)((main._txturl.runMethod(true,"getText"))));
 BA.debugLineNum = 57;BA.debugLine="WebView1.LoadUrl(txtUrl.Text)";
Debug.ShouldStop(16777216);
main._webview1.runVoidMethod ("LoadUrl",(Object)(main._txturl.runMethod(true,"getText")));
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createrightsizelayout() throws Exception{
try {
		Debug.PushSubsStack("CreateRightSizeLayout (main) ","main",0,main.ba,main.mostCurrent,34);
if (RapidSub.canDelegate("createrightsizelayout")) { return b4j.example.main.remoteMe.runUserSub(false, "main","createrightsizelayout");}
 BA.debugLineNum = 34;BA.debugLine="Private Sub CreateRightSizeLayout";
Debug.ShouldStop(2);
 BA.debugLineNum = 35;BA.debugLine="splitRight.LoadLayout(\"RightHistory\")";
Debug.ShouldStop(4);
main._splitright.runVoidMethodAndSync ("LoadLayout",main.ba,(Object)(RemoteObject.createImmutable("RightHistory")));
 BA.debugLineNum = 36;BA.debugLine="splitRight.LoadLayout(\"RightFavorites\")";
Debug.ShouldStop(8);
main._splitright.runVoidMethodAndSync ("LoadLayout",main.ba,(Object)(RemoteObject.createImmutable("RightFavorites")));
 BA.debugLineNum = 37;BA.debugLine="lstFavorites.Items.Add(\"http://www.b4x.com\")";
Debug.ShouldStop(16);
main._lstfavorites.runMethod(false,"getItems").runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("http://www.b4x.com"))));
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lstfavorites_selectedindexchanged(RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("lstFavorites_SelectedIndexChanged (main) ","main",0,main.ba,main.mostCurrent,71);
if (RapidSub.canDelegate("lstfavorites_selectedindexchanged")) { return b4j.example.main.remoteMe.runUserSub(false, "main","lstfavorites_selectedindexchanged", _index);}
Debug.locals.put("Index", _index);
 BA.debugLineNum = 71;BA.debugLine="Sub lstFavorites_SelectedIndexChanged(Index As Int";
Debug.ShouldStop(64);
 BA.debugLineNum = 72;BA.debugLine="If Index = -1 Then Return";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_index,BA.numberCast(double.class, -(double) (0 + 1)))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 73;BA.debugLine="lstFavorites.SelectedIndex = -1";
Debug.ShouldStop(256);
main._lstfavorites.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, -(double) (0 + 1)));
 BA.debugLineNum = 74;BA.debugLine="txtUrl.Text = lstFavorites.Items.Get(Index)";
Debug.ShouldStop(512);
main._txturl.runMethod(true,"setText",BA.ObjectToString(main._lstfavorites.runMethod(false,"getItems").runMethod(false,"Get",(Object)(_index))));
 BA.debugLineNum = 75;BA.debugLine="btnGo_Action";
Debug.ShouldStop(1024);
_btngo_action();
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lsthistory_selectedindexchanged(RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("lstHistory_SelectedIndexChanged (main) ","main",0,main.ba,main.mostCurrent,64);
if (RapidSub.canDelegate("lsthistory_selectedindexchanged")) { return b4j.example.main.remoteMe.runUserSub(false, "main","lsthistory_selectedindexchanged", _index);}
Debug.locals.put("Index", _index);
 BA.debugLineNum = 64;BA.debugLine="Sub lstHistory_SelectedIndexChanged(Index As Int)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 65;BA.debugLine="If Index = -1 Then Return";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_index,BA.numberCast(double.class, -(double) (0 + 1)))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 66;BA.debugLine="txtUrl.Text = lstHistory.Items.Get(Index)";
Debug.ShouldStop(2);
main._txturl.runMethod(true,"setText",BA.ObjectToString(main._lsthistory.runMethod(false,"getItems").runMethod(false,"Get",(Object)(_index))));
 BA.debugLineNum = 67;BA.debugLine="lstHistory.SelectedIndex = -1";
Debug.ShouldStop(4);
main._lsthistory.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, -(double) (0 + 1)));
 BA.debugLineNum = 68;BA.debugLine="btnGo_Action";
Debug.ShouldStop(8);
_btngo_action();
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lstsites_selectedindexchanged(RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("lstSites_SelectedIndexChanged (main) ","main",0,main.ba,main.mostCurrent,40);
if (RapidSub.canDelegate("lstsites_selectedindexchanged")) { return b4j.example.main.remoteMe.runUserSub(false, "main","lstsites_selectedindexchanged", _index);}
Debug.locals.put("Index", _index);
 BA.debugLineNum = 40;BA.debugLine="Sub lstSites_SelectedIndexChanged(Index As Int)";
Debug.ShouldStop(128);
 BA.debugLineNum = 41;BA.debugLine="If Index = -1 Then Return";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_index,BA.numberCast(double.class, -(double) (0 + 1)))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 42;BA.debugLine="txtUrl.Text = $\"http://www.${lstSites.Items.Get(I";
Debug.ShouldStop(512);
main._txturl.runMethod(true,"setText",(RemoteObject.concat(RemoteObject.createImmutable("http://www."),main.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(main._lstsites.runMethod(false,"getItems").runMethod(false,"Get",(Object)(_index)))),RemoteObject.createImmutable(""))));
 BA.debugLineNum = 43;BA.debugLine="btnGo_Action";
Debug.ShouldStop(1024);
_btngo_action();
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4j.example.main");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private fx As JFX";
main._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 8;BA.debugLine="Private MainForm As Form";
main._mainform = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");
 //BA.debugLineNum = 9;BA.debugLine="Private splitMain As SplitPane";
main._splitmain = RemoteObject.createNew ("anywheresoftware.b4j.objects.SplitPaneWrapper");
 //BA.debugLineNum = 10;BA.debugLine="Private lstSites As ListView";
main._lstsites = RemoteObject.createNew ("anywheresoftware.b4j.objects.ListViewWrapper");
 //BA.debugLineNum = 11;BA.debugLine="Private WebView1 As WebView";
main._webview1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.WebViewWrapper");
 //BA.debugLineNum = 12;BA.debugLine="Private txtUrl As TextField";
main._txturl = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 13;BA.debugLine="Private lstHistory As ListView";
main._lsthistory = RemoteObject.createNew ("anywheresoftware.b4j.objects.ListViewWrapper");
 //BA.debugLineNum = 14;BA.debugLine="Private lstFavorites As ListView";
main._lstfavorites = RemoteObject.createNew ("anywheresoftware.b4j.objects.ListViewWrapper");
 //BA.debugLineNum = 15;BA.debugLine="Private splitRight As SplitPane";
main._splitright = RemoteObject.createNew ("anywheresoftware.b4j.objects.SplitPaneWrapper");
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _txturl_action() throws Exception{
try {
		Debug.PushSubsStack("txtUrl_Action (main) ","main",0,main.ba,main.mostCurrent,46);
if (RapidSub.canDelegate("txturl_action")) { return b4j.example.main.remoteMe.runUserSub(false, "main","txturl_action");}
 BA.debugLineNum = 46;BA.debugLine="Sub txtUrl_Action";
Debug.ShouldStop(8192);
 BA.debugLineNum = 47;BA.debugLine="btnGo_Action";
Debug.ShouldStop(16384);
_btngo_action();
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _webview1_pagefinished(RemoteObject _url) throws Exception{
try {
		Debug.PushSubsStack("WebView1_PageFinished (main) ","main",0,main.ba,main.mostCurrent,60);
if (RapidSub.canDelegate("webview1_pagefinished")) { return b4j.example.main.remoteMe.runUserSub(false, "main","webview1_pagefinished", _url);}
Debug.locals.put("Url", _url);
 BA.debugLineNum = 60;BA.debugLine="Sub WebView1_PageFinished (Url As String)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 61;BA.debugLine="txtUrl.Text = Url";
Debug.ShouldStop(268435456);
main._txturl.runMethod(true,"setText",_url);
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}