/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.indoor.position.swiggenerated;

public class SatelliteInfoList extends java.util.AbstractList<SatelliteInfo> implements java.util.RandomAccess {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SatelliteInfoList(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SatelliteInfoList obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        IPSJNI.delete_SatelliteInfoList(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SatelliteInfoList(SatelliteInfo[] initialElements) {
    this();
    reserve(initialElements.length);

    for (SatelliteInfo element : initialElements) {
      add(element);
    }
  }

  public SatelliteInfoList(Iterable<SatelliteInfo> initialElements) {
    this();
    for (SatelliteInfo element : initialElements) {
      add(element);
    }
  }

  public SatelliteInfo get(int index) {
    return doGet(index);
  }

  public SatelliteInfo set(int index, SatelliteInfo e) {
    return doSet(index, e);
  }

  public boolean add(SatelliteInfo e) {
    modCount++;
    doAdd(e);
    return true;
  }

  public void add(int index, SatelliteInfo e) {
    modCount++;
    doAdd(index, e);
  }

  public SatelliteInfo remove(int index) {
    modCount++;
    return doRemove(index);
  }

  protected void removeRange(int fromIndex, int toIndex) {
    modCount++;
    doRemoveRange(fromIndex, toIndex);
  }

  public int size() {
    return doSize();
  }

  public SatelliteInfoList() {
    this(IPSJNI.new_SatelliteInfoList__SWIG_0(), true);
  }

  public SatelliteInfoList(SatelliteInfoList other) {
    this(IPSJNI.new_SatelliteInfoList__SWIG_1(SatelliteInfoList.getCPtr(other), other), true);
  }

  public long capacity() {
    return IPSJNI.SatelliteInfoList_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    IPSJNI.SatelliteInfoList_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return IPSJNI.SatelliteInfoList_isEmpty(swigCPtr, this);
  }

  public void clear() {
    IPSJNI.SatelliteInfoList_clear(swigCPtr, this);
  }

  public SatelliteInfoList(int count, SatelliteInfo value) {
    this(IPSJNI.new_SatelliteInfoList__SWIG_2(count, SatelliteInfo.getCPtr(value), value), true);
  }

  private int doSize() {
    return IPSJNI.SatelliteInfoList_doSize(swigCPtr, this);
  }

  private void doAdd(SatelliteInfo x) {
    IPSJNI.SatelliteInfoList_doAdd__SWIG_0(swigCPtr, this, SatelliteInfo.getCPtr(x), x);
  }

  private void doAdd(int index, SatelliteInfo x) {
    IPSJNI.SatelliteInfoList_doAdd__SWIG_1(swigCPtr, this, index, SatelliteInfo.getCPtr(x), x);
  }

  private SatelliteInfo doRemove(int index) {
    return new SatelliteInfo(IPSJNI.SatelliteInfoList_doRemove(swigCPtr, this, index), true);
  }

  private SatelliteInfo doGet(int index) {
    return new SatelliteInfo(IPSJNI.SatelliteInfoList_doGet(swigCPtr, this, index), false);
  }

  private SatelliteInfo doSet(int index, SatelliteInfo val) {
    return new SatelliteInfo(IPSJNI.SatelliteInfoList_doSet(swigCPtr, this, index, SatelliteInfo.getCPtr(val), val), true);
  }

  private void doRemoveRange(int fromIndex, int toIndex) {
    IPSJNI.SatelliteInfoList_doRemoveRange(swigCPtr, this, fromIndex, toIndex);
  }

}
