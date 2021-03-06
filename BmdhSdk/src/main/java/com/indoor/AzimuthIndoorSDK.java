package com.indoor;

import android.content.Context;
import androidx.annotation.Keep;

import com.indoor.position.IPSMeasurement;
import com.indoor.utils.KLog;
import com.indoor.utils.Utils;
@Keep
public class AzimuthIndoorSDK {
    private static final String TAG = "AzimuthIndoorSDK";
    private static final String SDK_VERSION = "V1.0";
    private static volatile AzimuthIndoorSDK mInstance;

    private AzimuthIndoorConfig mAzimuthIndoorConfig = null;
    private Context mContext;
    private AzimuthIndoorStrategy mAzimuthIndoorStrategy;


    private AzimuthIndoorSDK() {

    }

    public static AzimuthIndoorSDK getInstance() {
        if (mInstance == null) {
            synchronized (AzimuthIndoorSDK.class) {
                if (mInstance == null) {
                    mInstance = new AzimuthIndoorSDK();
                }
            }
        }
        return mInstance;
    }

    /**
     * 获取SDK版本号
     *
     * @return 返回SDK版本号
     */
    public String getSDKVersion() {
        return SDK_VERSION;
    }

    /**
     * 当前是否在室内
     *
     * @return 当前是否在室内
     */
    public boolean isCurrentIndoor() {
        if (mAzimuthIndoorStrategy == null) {
            KLog.e(TAG, "mAzimuthIndoorStrategy is null");
            return false;
        }
        return mAzimuthIndoorStrategy.ismIsIndoor();
    }

    /**
     * 开启室内定位服务
     *
     * @param callback 获取到位置信息后的回调，1s回调一次
     */
    public void startIndoorLocation(long mapId, IPSMeasurement.Callback callback) {
        if (mAzimuthIndoorStrategy == null) {
            KLog.e(TAG, "mAzimuthIndoorStrategy is null");
            return;
        }
        mAzimuthIndoorStrategy.startIndoorSdkLocate(mapId, callback);
    }


    /**
     * 对当前室内外环境改变，当前室内楼层改变，已经服务断开了的监听
     *
     * @param listener 监听器
     */
    public void setIndoorOrOutdoorChangedListener(IAzimuthNaviManager.INaviIndoorStateChangeListener listener) {

    }

    /**
     * 初始化SDK环境，
     *a
     * @param context          环境上下文
     * @param azimuthIndoorConfig 使用默认值则传入AzimuthIndoorConfig.DEFAULT
     */
    public void init(Context context, AzimuthIndoorConfig azimuthIndoorConfig, IAzimuthNaviManager.IInitSDKListener iInitSDKListener) {
        mContext = context.getApplicationContext();
        KLog.init(true);
        Utils.init(context);
        mAzimuthIndoorConfig = azimuthIndoorConfig;
        mAzimuthIndoorStrategy = new AzimuthIndoorStrategy(mContext);
//        mAzimuthIndoorStrategy.verifySDK(iInitSDKListener);
    }


    /****************************在Activit或Fragment的各个生命周期做不同的设置，比如蓝牙扫描频率************************************************/
    public void onCreate() {

    }

    public void onResume() {

    }

    public void onPause() {

    }


    public void onStop() {

    }

    public void onDestroy() {

    }


    /**
     * 销毁当前SDK资源
     */
    public void exitSDK() {
        mAzimuthIndoorStrategy.clearData();
    }


}
