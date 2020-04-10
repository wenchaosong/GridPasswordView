# 格子密码控件

## 使用步骤

#### Step 1.
```
dependencies{
    compile 'com.ms:gridpasswordview:1.0.0'
}
```
或者引用本地lib
```groovy
compile project(':gridpasswordview')
```

#### Step 2.
```xml
<com.ms.gridpasswordview.GridPasswordView
        android:id="@+id/pswView"
        android:layout_width="match_parent"
        android:layout_height="45dp"
        android:layout_gravity="center_horizontal"
        android:layout_marginLeft="30dp"
        android:layout_marginTop="20dp"
        android:layout_marginRight="30dp"
        app:gpv_gridColor="#ffffff"
        app:gpv_lineColor="#a0a0a3"
        app:gpv_lineWidth="1dp"
        app:gpv_passwordLength="6"
        app:gpv_passwordType="number"
        app:gpv_passwordVisible="false"
        app:gpv_textColor="#333333"
        app:gpv_textSize="25sp" />
```
