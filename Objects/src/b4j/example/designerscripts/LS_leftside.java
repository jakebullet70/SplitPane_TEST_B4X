package b4j.example.designerscripts;
import anywheresoftware.b4a.BA;


public class LS_leftside{

public static void LS_general(anywheresoftware.b4a.BA ba, javafx.scene.Node parent, anywheresoftware.b4j.objects.LayoutValues lv,
anywheresoftware.b4j.objects.LayoutBuilder.LayoutData views, int width, int height, float scale)  throws Exception  {
;
//BA.debugLineNum = 2;BA.debugLine="Label1.HorizontalCenter = 50%x"[LeftSide/General script]
views.get("label1").setLeft((int)((50d / 100 * width) - (views.get("label1").getPrefWidth() / 2)));

}
}