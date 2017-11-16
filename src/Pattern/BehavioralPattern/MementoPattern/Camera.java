package Pattern.BehavioralPattern.MementoPattern;


import java.util.ArrayList;
import java.util.List;


//摄像机保存帧和回放
public class Camera {


    private List<CameraFrame> cameraFrameList = new ArrayList<CameraFrame>();

    public List<CameraFrame> getCameraFrameList() {
        return cameraFrameList;
    }

    public void addCameraFrame(CameraFrame cameraFrame) {
        cameraFrameList.add(cameraFrame);
    }

    public CameraFrame getCameraFrame(int index) {
        return cameraFrameList.get(index);
    }


}