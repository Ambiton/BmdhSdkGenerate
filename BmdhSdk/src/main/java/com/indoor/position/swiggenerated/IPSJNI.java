/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.indoor.position.swiggenerated;

public class IPSJNI {
  public final static native long new_SatelliteInfoList__SWIG_0();
  public final static native long new_SatelliteInfoList__SWIG_1(long jarg1, SatelliteInfoList jarg1_);
  public final static native long SatelliteInfoList_capacity(long jarg1, SatelliteInfoList jarg1_);
  public final static native void SatelliteInfoList_reserve(long jarg1, SatelliteInfoList jarg1_, long jarg2);
  public final static native boolean SatelliteInfoList_isEmpty(long jarg1, SatelliteInfoList jarg1_);
  public final static native void SatelliteInfoList_clear(long jarg1, SatelliteInfoList jarg1_);
  public final static native long new_SatelliteInfoList__SWIG_2(int jarg1, long jarg2, SatelliteInfo jarg2_);
  public final static native int SatelliteInfoList_doSize(long jarg1, SatelliteInfoList jarg1_);
  public final static native void SatelliteInfoList_doAdd__SWIG_0(long jarg1, SatelliteInfoList jarg1_, long jarg2, SatelliteInfo jarg2_);
  public final static native void SatelliteInfoList_doAdd__SWIG_1(long jarg1, SatelliteInfoList jarg1_, int jarg2, long jarg3, SatelliteInfo jarg3_);
  public final static native long SatelliteInfoList_doRemove(long jarg1, SatelliteInfoList jarg1_, int jarg2);
  public final static native long SatelliteInfoList_doGet(long jarg1, SatelliteInfoList jarg1_, int jarg2);
  public final static native long SatelliteInfoList_doSet(long jarg1, SatelliteInfoList jarg1_, int jarg2, long jarg3, SatelliteInfo jarg3_);
  public final static native void SatelliteInfoList_doRemoveRange(long jarg1, SatelliteInfoList jarg1_, int jarg2, int jarg3);
  public final static native void delete_SatelliteInfoList(long jarg1);
  public final static native long new_SatelliteIndoorMeasurementList__SWIG_0();
  public final static native long new_SatelliteIndoorMeasurementList__SWIG_1(long jarg1, SatelliteIndoorMeasurementList jarg1_);
  public final static native long SatelliteIndoorMeasurementList_capacity(long jarg1, SatelliteIndoorMeasurementList jarg1_);
  public final static native void SatelliteIndoorMeasurementList_reserve(long jarg1, SatelliteIndoorMeasurementList jarg1_, long jarg2);
  public final static native boolean SatelliteIndoorMeasurementList_isEmpty(long jarg1, SatelliteIndoorMeasurementList jarg1_);
  public final static native void SatelliteIndoorMeasurementList_clear(long jarg1, SatelliteIndoorMeasurementList jarg1_);
  public final static native long new_SatelliteIndoorMeasurementList__SWIG_2(int jarg1, long jarg2, SatelliteIndoorMeasurement jarg2_);
  public final static native int SatelliteIndoorMeasurementList_doSize(long jarg1, SatelliteIndoorMeasurementList jarg1_);
  public final static native void SatelliteIndoorMeasurementList_doAdd__SWIG_0(long jarg1, SatelliteIndoorMeasurementList jarg1_, long jarg2, SatelliteIndoorMeasurement jarg2_);
  public final static native void SatelliteIndoorMeasurementList_doAdd__SWIG_1(long jarg1, SatelliteIndoorMeasurementList jarg1_, int jarg2, long jarg3, SatelliteIndoorMeasurement jarg3_);
  public final static native long SatelliteIndoorMeasurementList_doRemove(long jarg1, SatelliteIndoorMeasurementList jarg1_, int jarg2);
  public final static native long SatelliteIndoorMeasurementList_doGet(long jarg1, SatelliteIndoorMeasurementList jarg1_, int jarg2);
  public final static native long SatelliteIndoorMeasurementList_doSet(long jarg1, SatelliteIndoorMeasurementList jarg1_, int jarg2, long jarg3, SatelliteIndoorMeasurement jarg3_);
  public final static native void SatelliteIndoorMeasurementList_doRemoveRange(long jarg1, SatelliteIndoorMeasurementList jarg1_, int jarg2, int jarg3);
  public final static native void delete_SatelliteIndoorMeasurementList(long jarg1);
  public final static native void IndoorPositionProcessor_updateSatelliteInfo(long jarg1, IndoorPositionProcessor jarg1_, long jarg2, SatelliteInfoList jarg2_, double[] jarg3);
  public final static native int IndoorPositionProcessor_initialAPBCaKFOneDimen();
  public final static native int IndoorPositionProcessor_initialAPBCKFTwoDimen();
  public final static native long IndoorPositionProcessor_run(long jarg1, IndoorPositionProcessor jarg1_, long jarg2, SatelliteIndoorMeasurementList jarg2_, long jarg3, SatelliteIndoorMeasurementList jarg3_, long jarg4, Inputparameter jarg4_);
  public final static native long new_IndoorPositionProcessor();
  public final static native void delete_IndoorPositionProcessor(long jarg1);
  public final static native void delete_SatelliteInfo(long jarg1);
  public final static native long new_SatelliteInfo(double jarg1, double jarg2, double jarg3, int jarg4);
  public final static native double SatelliteInfo_getXAxisCoordinate(long jarg1, SatelliteInfo jarg1_);
  public final static native double SatelliteInfo_getYAxisCoordinate(long jarg1, SatelliteInfo jarg1_);
  public final static native double SatelliteInfo_getZAxisCoordinate(long jarg1, SatelliteInfo jarg1_);
  public final static native int SatelliteInfo_getSvid(long jarg1, SatelliteInfo jarg1_);
  public final static native void delete_SatelliteIndoorMeasurement(long jarg1);
  public final static native long SatelliteIndoorMeasurement_setSvid(long jarg1, SatelliteIndoorMeasurement jarg1_, int jarg2);
  public final static native int SatelliteIndoorMeasurement_getSvid(long jarg1, SatelliteIndoorMeasurement jarg1_);
  public final static native long SatelliteIndoorMeasurement_setPseudorange(long jarg1, SatelliteIndoorMeasurement jarg1_, double jarg2);
  public final static native double SatelliteIndoorMeasurement_getPseudorange(long jarg1, SatelliteIndoorMeasurement jarg1_);
  public final static native double SatelliteIndoorMeasurement_getcn0DbHz(long jarg1, SatelliteIndoorMeasurement jarg1_);
  public final static native double SatelliteIndoorMeasurement_getpseudorangeRateMetersPerSecond(long jarg1, SatelliteIndoorMeasurement jarg1_);
  public final static native void SatelliteIndoorMeasurement_setpseudorangeRateMetersPerSecond(long jarg1, SatelliteIndoorMeasurement jarg1_, double jarg2);
  public final static native double SatelliteIndoorMeasurement_getaccumulatedDeltaRangeMeters(long jarg1, SatelliteIndoorMeasurement jarg1_);
  public final static native void SatelliteIndoorMeasurement_setaccumulatedDeltaRangeMeters(long jarg1, SatelliteIndoorMeasurement jarg1_, double jarg2);
  public final static native float SatelliteIndoorMeasurement_getcarrierFrequencyHz(long jarg1, SatelliteIndoorMeasurement jarg1_);
  public final static native void SatelliteIndoorMeasurement_setcarrierFrequencyHz(long jarg1, SatelliteIndoorMeasurement jarg1_, float jarg2);
  public final static native int SatelliteIndoorMeasurement_getaccumulatedDeltaRangeState(long jarg1, SatelliteIndoorMeasurement jarg1_);
  public final static native void SatelliteIndoorMeasurement_setaccumulatedDeltaRangeState(long jarg1, SatelliteIndoorMeasurement jarg1_, int jarg2);
  public final static native double SatelliteIndoorMeasurement_getreceivedSvTimeUncertaintyNanos(long jarg1, SatelliteIndoorMeasurement jarg1_);
  public final static native void SatelliteIndoorMeasurement_setreceivedSvTimeUncertaintyNanos(long jarg1, SatelliteIndoorMeasurement jarg1_, double jarg2);
  public final static native double SatelliteIndoorMeasurement_getpseudorangeRateUncertaintyMetersPerSecond(long jarg1, SatelliteIndoorMeasurement jarg1_);
  public final static native void SatelliteIndoorMeasurement_setpseudorangeRateUncertaintyMetersPerSecond(long jarg1, SatelliteIndoorMeasurement jarg1_, double jarg2);
  public final static native double SatelliteIndoorMeasurement_getaccumulatedDeltaRangeUncertaintyMeters(long jarg1, SatelliteIndoorMeasurement jarg1_);
  public final static native void SatelliteIndoorMeasurement_setaccumulatedDeltaRangeUncertaintyMeters(long jarg1, SatelliteIndoorMeasurement jarg1_, double jarg2);
  public final static native long new_SatelliteIndoorMeasurement();
  public final static native void delete_Inputparameter(long jarg1);
  public final static native void Inputparameter_roomCenter_set(long jarg1, Inputparameter jarg1_, double[] jarg2);
  public final static native double[] Inputparameter_roomCenter_get(long jarg1, Inputparameter jarg1_);
  public final static native void Inputparameter_threshold_x_y_set(long jarg1, Inputparameter jarg1_, double[] jarg2);
  public final static native double[] Inputparameter_threshold_x_y_get(long jarg1, Inputparameter jarg1_);
  public final static native void Inputparameter_bluetoothCheckResult_set(long jarg1, Inputparameter jarg1_, boolean jarg2);
  public final static native boolean Inputparameter_bluetoothCheckResult_get(long jarg1, Inputparameter jarg1_);
  public final static native void Inputparameter_bluetoothReferLocation_set(long jarg1, Inputparameter jarg1_, double[] jarg2);
  public final static native double[] Inputparameter_bluetoothReferLocation_get(long jarg1, Inputparameter jarg1_);
  public final static native void Inputparameter_fixedCoor_set(long jarg1, Inputparameter jarg1_, double[] jarg2);
  public final static native double[] Inputparameter_fixedCoor_get(long jarg1, Inputparameter jarg1_);
  public final static native void Inputparameter_stepjingwei_set(long jarg1, Inputparameter jarg1_, double[] jarg2);
  public final static native double[] Inputparameter_stepjingwei_get(long jarg1, Inputparameter jarg1_);
  public final static native void Inputparameter_setroomCenter(long jarg1, Inputparameter jarg1_, double[] jarg2);
  public final static native void Inputparameter_setthreshold_x_y(long jarg1, Inputparameter jarg1_, double[] jarg2);
  public final static native void Inputparameter_setbluetoothCheckResult(long jarg1, Inputparameter jarg1_, boolean jarg2);
  public final static native void Inputparameter_setbluetoothReferLocation(long jarg1, Inputparameter jarg1_, double[] jarg2);
  public final static native void Inputparameter_setfixedCoor(long jarg1, Inputparameter jarg1_, double[] jarg2);
  public final static native void Inputparameter_setstepjingwei(long jarg1, Inputparameter jarg1_, double[] jarg2);
  public final static native long new_Inputparameter(double[] jarg1, double[] jarg2, boolean jarg3, double[] jarg4, double[] jarg5, double[] jarg6);
  public final static native void IndoorPositionMeasurement_setDescription(long jarg1, IndoorPositionMeasurement jarg1_, String jarg2);
  public final static native void IndoorPositionMeasurement_x_set(long jarg1, IndoorPositionMeasurement jarg1_, double jarg2);
  public final static native double IndoorPositionMeasurement_x_get(long jarg1, IndoorPositionMeasurement jarg1_);
  public final static native void IndoorPositionMeasurement_y_set(long jarg1, IndoorPositionMeasurement jarg1_, double jarg2);
  public final static native double IndoorPositionMeasurement_y_get(long jarg1, IndoorPositionMeasurement jarg1_);
  public final static native void IndoorPositionMeasurement_z_set(long jarg1, IndoorPositionMeasurement jarg1_, double jarg2);
  public final static native double IndoorPositionMeasurement_z_get(long jarg1, IndoorPositionMeasurement jarg1_);
  public final static native void IndoorPositionMeasurement_locatestate_set(long jarg1, IndoorPositionMeasurement jarg1_, int jarg2);
  public final static native int IndoorPositionMeasurement_locatestate_get(long jarg1, IndoorPositionMeasurement jarg1_);
  public final static native void IndoorPositionMeasurement_L5_x_set(long jarg1, IndoorPositionMeasurement jarg1_, double jarg2);
  public final static native double IndoorPositionMeasurement_L5_x_get(long jarg1, IndoorPositionMeasurement jarg1_);
  public final static native void IndoorPositionMeasurement_L5_y_set(long jarg1, IndoorPositionMeasurement jarg1_, double jarg2);
  public final static native double IndoorPositionMeasurement_L5_y_get(long jarg1, IndoorPositionMeasurement jarg1_);
  public final static native void IndoorPositionMeasurement_L5_z_set(long jarg1, IndoorPositionMeasurement jarg1_, double jarg2);
  public final static native double IndoorPositionMeasurement_L5_z_get(long jarg1, IndoorPositionMeasurement jarg1_);
  public final static native void IndoorPositionMeasurement_L5locatestate_set(long jarg1, IndoorPositionMeasurement jarg1_, int jarg2);
  public final static native int IndoorPositionMeasurement_L5locatestate_get(long jarg1, IndoorPositionMeasurement jarg1_);
  public final static native void IndoorPositionMeasurement_L1_x_set(long jarg1, IndoorPositionMeasurement jarg1_, double jarg2);
  public final static native double IndoorPositionMeasurement_L1_x_get(long jarg1, IndoorPositionMeasurement jarg1_);
  public final static native void IndoorPositionMeasurement_L1_y_set(long jarg1, IndoorPositionMeasurement jarg1_, double jarg2);
  public final static native double IndoorPositionMeasurement_L1_y_get(long jarg1, IndoorPositionMeasurement jarg1_);
  public final static native void IndoorPositionMeasurement_L1_z_set(long jarg1, IndoorPositionMeasurement jarg1_, double jarg2);
  public final static native double IndoorPositionMeasurement_L1_z_get(long jarg1, IndoorPositionMeasurement jarg1_);
  public final static native void IndoorPositionMeasurement_L1locatestate_set(long jarg1, IndoorPositionMeasurement jarg1_, int jarg2);
  public final static native int IndoorPositionMeasurement_L1locatestate_get(long jarg1, IndoorPositionMeasurement jarg1_);
  public final static native void IndoorPositionMeasurement_L5kf_x_set(long jarg1, IndoorPositionMeasurement jarg1_, double jarg2);
  public final static native double IndoorPositionMeasurement_L5kf_x_get(long jarg1, IndoorPositionMeasurement jarg1_);
  public final static native void IndoorPositionMeasurement_L5kf_y_set(long jarg1, IndoorPositionMeasurement jarg1_, double jarg2);
  public final static native double IndoorPositionMeasurement_L5kf_y_get(long jarg1, IndoorPositionMeasurement jarg1_);
  public final static native void IndoorPositionMeasurement_L5kf_z_set(long jarg1, IndoorPositionMeasurement jarg1_, double jarg2);
  public final static native double IndoorPositionMeasurement_L5kf_z_get(long jarg1, IndoorPositionMeasurement jarg1_);
  public final static native void IndoorPositionMeasurement_L5kflocatestate_set(long jarg1, IndoorPositionMeasurement jarg1_, int jarg2);
  public final static native int IndoorPositionMeasurement_L5kflocatestate_get(long jarg1, IndoorPositionMeasurement jarg1_);
  public final static native long new_IndoorPositionMeasurement(double jarg1, double jarg2, double jarg3, boolean jarg4, int jarg5);
  public final static native double IndoorPositionMeasurement_getXAxisCoordinate(long jarg1, IndoorPositionMeasurement jarg1_);
  public final static native double IndoorPositionMeasurement_getYAxisCoordinate(long jarg1, IndoorPositionMeasurement jarg1_);
  public final static native double IndoorPositionMeasurement_getZAxisCoordinate(long jarg1, IndoorPositionMeasurement jarg1_);
  public final static native int IndoorPositionMeasurement_getlocatestate(long jarg1, IndoorPositionMeasurement jarg1_);
  public final static native String IndoorPositionMeasurement_getDescription(long jarg1, IndoorPositionMeasurement jarg1_);
  public final static native boolean IndoorPositionMeasurement_isSuccessful(long jarg1, IndoorPositionMeasurement jarg1_);
  public final static native void delete_IndoorPositionMeasurement(long jarg1);
}
