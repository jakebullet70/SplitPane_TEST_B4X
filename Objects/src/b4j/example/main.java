package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class main extends javafx.application.Application{
public static main mostCurrent = new main();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			anywheresoftware.b4a.shell.ShellBA.delegateBA = new anywheresoftware.b4j.objects.FxBA("b4j.example", null, null);
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.main", ba);
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}

 
    public static void main(String[] args) {
    	launch(args);
    }
    public void start (javafx.stage.Stage stage) {
        try {
            if (!false)
                System.setProperty("prism.lcdtext", "false");
            anywheresoftware.b4j.objects.FxBA.application = this;
		    anywheresoftware.b4a.keywords.Common.setDensity(javafx.stage.Screen.getPrimary().getDpi());
            anywheresoftware.b4a.keywords.Common.LogDebug("Program started.");
            initializeProcessGlobals();
            anywheresoftware.b4j.objects.Form frm = new anywheresoftware.b4j.objects.Form();
            frm.initWithStage(ba, stage, 800, 600);
            ba.raiseEvent(null, "appstart", frm, (String[])getParameters().getRaw().toArray(new String[0]));
        } catch (Throwable t) {
            BA.printException(t, true);
            System.exit(1);
        }
    }


private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static anywheresoftware.b4j.objects.Form _mainform = null;
public static anywheresoftware.b4j.objects.SplitPaneWrapper _splitmain = null;
public static anywheresoftware.b4j.objects.ListViewWrapper _lstsites = null;
public static anywheresoftware.b4j.objects.WebViewWrapper _webview1 = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txturl = null;
public static anywheresoftware.b4j.objects.ListViewWrapper _lsthistory = null;
public static anywheresoftware.b4j.objects.ListViewWrapper _lstfavorites = null;
public static anywheresoftware.b4j.objects.SplitPaneWrapper _splitright = null;
public static String  _appstart(anywheresoftware.b4j.objects.Form _form1,String[] _args) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "appstart", false))
	 {return ((String) Debug.delegate(ba, "appstart", new Object[] {_form1,_args}));}
RDebugUtils.currentLine=65536;
 //BA.debugLineNum = 65536;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
RDebugUtils.currentLine=65537;
 //BA.debugLineNum = 65537;BA.debugLine="MainForm = Form1";
_mainform = _form1;
RDebugUtils.currentLine=65538;
 //BA.debugLineNum = 65538;BA.debugLine="MainForm.SetFormStyle(\"UNIFIED\")";
_mainform.SetFormStyle("UNIFIED");
RDebugUtils.currentLine=65539;
 //BA.debugLineNum = 65539;BA.debugLine="MainForm.RootPane.LoadLayout(\"Main\")";
_mainform.getRootPane().LoadLayout(ba,"Main");
RDebugUtils.currentLine=65540;
 //BA.debugLineNum = 65540;BA.debugLine="splitMain.LoadLayout(\"LeftSide\")";
_splitmain.LoadLayout(ba,"LeftSide");
RDebugUtils.currentLine=65541;
 //BA.debugLineNum = 65541;BA.debugLine="splitMain.LoadLayout(\"Center\")";
_splitmain.LoadLayout(ba,"Center");
RDebugUtils.currentLine=65542;
 //BA.debugLineNum = 65542;BA.debugLine="splitMain.LoadLayout(\"RightSide\")";
_splitmain.LoadLayout(ba,"RightSide");
RDebugUtils.currentLine=65544;
 //BA.debugLineNum = 65544;BA.debugLine="splitMain.SetSizeLimits(0, 0, 200)";
_splitmain.SetSizeLimits((int) (0),0,200);
RDebugUtils.currentLine=65545;
 //BA.debugLineNum = 65545;BA.debugLine="splitMain.SetSizeLimits(2, 0, 300)";
_splitmain.SetSizeLimits((int) (2),0,300);
RDebugUtils.currentLine=65546;
 //BA.debugLineNum = 65546;BA.debugLine="CreateRightSizeLayout";
_createrightsizelayout();
RDebugUtils.currentLine=65547;
 //BA.debugLineNum = 65547;BA.debugLine="lstSites.Items.AddAll(File.ReadList(File.DirAsset";
_lstsites.getItems().AddAll(anywheresoftware.b4a.keywords.Common.File.ReadList(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"sites.txt"));
RDebugUtils.currentLine=65548;
 //BA.debugLineNum = 65548;BA.debugLine="MainForm.Show";
_mainform.Show();
RDebugUtils.currentLine=65549;
 //BA.debugLineNum = 65549;BA.debugLine="lstSites.SelectedIndex = 0";
_lstsites.setSelectedIndex((int) (0));
RDebugUtils.currentLine=65550;
 //BA.debugLineNum = 65550;BA.debugLine="End Sub";
return "";
}
public static String  _createrightsizelayout() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "createrightsizelayout", false))
	 {return ((String) Debug.delegate(ba, "createrightsizelayout", null));}
RDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Private Sub CreateRightSizeLayout";
RDebugUtils.currentLine=131073;
 //BA.debugLineNum = 131073;BA.debugLine="splitRight.LoadLayout(\"RightHistory\")";
_splitright.LoadLayout(ba,"RightHistory");
RDebugUtils.currentLine=131074;
 //BA.debugLineNum = 131074;BA.debugLine="splitRight.LoadLayout(\"RightFavorites\")";
_splitright.LoadLayout(ba,"RightFavorites");
RDebugUtils.currentLine=131075;
 //BA.debugLineNum = 131075;BA.debugLine="lstFavorites.Items.Add(\"http://www.b4x.com\")";
_lstfavorites.getItems().Add((Object)("http://www.b4x.com"));
RDebugUtils.currentLine=131076;
 //BA.debugLineNum = 131076;BA.debugLine="End Sub";
return "";
}
public static String  _btngo_action() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "btngo_action", false))
	 {return ((String) Debug.delegate(ba, "btngo_action", null));}
int _currentindex = 0;
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Sub btnGo_Action";
RDebugUtils.currentLine=327681;
 //BA.debugLineNum = 327681;BA.debugLine="txtUrl.Text = txtUrl.Text.Trim";
_txturl.setText(_txturl.getText().trim());
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="If txtUrl.Text.Length = 0 Then Return";
if (_txturl.getText().length()==0) { 
if (true) return "";};
RDebugUtils.currentLine=327683;
 //BA.debugLineNum = 327683;BA.debugLine="If txtUrl.Text.StartsWith(\"http\") = False Then tx";
if (_txturl.getText().startsWith("http")==anywheresoftware.b4a.keywords.Common.False) { 
_txturl.setText("http://"+_txturl.getText());};
RDebugUtils.currentLine=327684;
 //BA.debugLineNum = 327684;BA.debugLine="Dim currentIndex As Int = lstHistory.Items.IndexO";
_currentindex = _lsthistory.getItems().IndexOf((Object)(_txturl.getText()));
RDebugUtils.currentLine=327685;
 //BA.debugLineNum = 327685;BA.debugLine="If currentIndex > -1 Then lstHistory.Items.Remove";
if (_currentindex>-1) { 
_lsthistory.getItems().RemoveAt(_currentindex);};
RDebugUtils.currentLine=327686;
 //BA.debugLineNum = 327686;BA.debugLine="lstHistory.Items.InsertAt(0, txtUrl.Text)";
_lsthistory.getItems().InsertAt((int) (0),(Object)(_txturl.getText()));
RDebugUtils.currentLine=327687;
 //BA.debugLineNum = 327687;BA.debugLine="WebView1.LoadUrl(txtUrl.Text)";
_webview1.LoadUrl(_txturl.getText());
RDebugUtils.currentLine=327688;
 //BA.debugLineNum = 327688;BA.debugLine="End Sub";
return "";
}
public static String  _lstfavorites_selectedindexchanged(int _index) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "lstfavorites_selectedindexchanged", false))
	 {return ((String) Debug.delegate(ba, "lstfavorites_selectedindexchanged", new Object[] {_index}));}
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Sub lstFavorites_SelectedIndexChanged(Index As Int";
RDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="If Index = -1 Then Return";
if (_index==-1) { 
if (true) return "";};
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="lstFavorites.SelectedIndex = -1";
_lstfavorites.setSelectedIndex((int) (-1));
RDebugUtils.currentLine=524291;
 //BA.debugLineNum = 524291;BA.debugLine="txtUrl.Text = lstFavorites.Items.Get(Index)";
_txturl.setText(BA.ObjectToString(_lstfavorites.getItems().Get(_index)));
RDebugUtils.currentLine=524292;
 //BA.debugLineNum = 524292;BA.debugLine="btnGo_Action";
_btngo_action();
RDebugUtils.currentLine=524293;
 //BA.debugLineNum = 524293;BA.debugLine="End Sub";
return "";
}
public static String  _lsthistory_selectedindexchanged(int _index) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "lsthistory_selectedindexchanged", false))
	 {return ((String) Debug.delegate(ba, "lsthistory_selectedindexchanged", new Object[] {_index}));}
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Sub lstHistory_SelectedIndexChanged(Index As Int)";
RDebugUtils.currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="If Index = -1 Then Return";
if (_index==-1) { 
if (true) return "";};
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="txtUrl.Text = lstHistory.Items.Get(Index)";
_txturl.setText(BA.ObjectToString(_lsthistory.getItems().Get(_index)));
RDebugUtils.currentLine=458755;
 //BA.debugLineNum = 458755;BA.debugLine="lstHistory.SelectedIndex = -1";
_lsthistory.setSelectedIndex((int) (-1));
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="btnGo_Action";
_btngo_action();
RDebugUtils.currentLine=458757;
 //BA.debugLineNum = 458757;BA.debugLine="End Sub";
return "";
}
public static String  _lstsites_selectedindexchanged(int _index) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "lstsites_selectedindexchanged", false))
	 {return ((String) Debug.delegate(ba, "lstsites_selectedindexchanged", new Object[] {_index}));}
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub lstSites_SelectedIndexChanged(Index As Int)";
RDebugUtils.currentLine=196609;
 //BA.debugLineNum = 196609;BA.debugLine="If Index = -1 Then Return";
if (_index==-1) { 
if (true) return "";};
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="txtUrl.Text = $\"http://www.${lstSites.Items.Get(I";
_txturl.setText(("http://www."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",_lstsites.getItems().Get(_index))+""));
RDebugUtils.currentLine=196611;
 //BA.debugLineNum = 196611;BA.debugLine="btnGo_Action";
_btngo_action();
RDebugUtils.currentLine=196612;
 //BA.debugLineNum = 196612;BA.debugLine="End Sub";
return "";
}
public static String  _txturl_action() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "txturl_action", false))
	 {return ((String) Debug.delegate(ba, "txturl_action", null));}
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Sub txtUrl_Action";
RDebugUtils.currentLine=262145;
 //BA.debugLineNum = 262145;BA.debugLine="btnGo_Action";
_btngo_action();
RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="End Sub";
return "";
}
public static String  _webview1_pagefinished(String _url) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "webview1_pagefinished", false))
	 {return ((String) Debug.delegate(ba, "webview1_pagefinished", new Object[] {_url}));}
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Sub WebView1_PageFinished (Url As String)";
RDebugUtils.currentLine=393217;
 //BA.debugLineNum = 393217;BA.debugLine="txtUrl.Text = Url";
_txturl.setText(_url);
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="End Sub";
return "";
}
}