package Pattern.BehavioralPattern.MementoPattern;


import java.util.ArrayList;
import java.util.List;


//摄像机保存帧和回放
public class Main {

    public static void main(String[] args) {
        Actor actor = new Actor();
        Camera camera = new Camera();


        //录制时间100帧
        for (int i = 0; i < 100; i++) {
            actor.setPerform(i + ". frame- perform");
            actor.setSound(i + ". frame- sound");

            if (i > 50 && i < 60)
                actor.getStateFromCamera(camera.getCameraFrame(i - 20));

            camera.addCameraFrame(actor.createCameraFrame());
        }


        //重放摄影
        for (CameraFrame cameraFrame : camera.getCameraFrameList()) {
            System.out.println(cameraFrame.getPerform() + "    " + cameraFrame.getSound());

        }

    }
}