package androidx.pluginmgr.delegate;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;

import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.io.InputStream;

/**
 * 本类继承自 API 23 版本的 Resources, 如果导入出现错误, 删减出错的方法.
 * @author Lody
 * @version 1.0
 */
@SuppressLint("NewApi")
public class DelegateResources extends Resources {

    private String mHostPkgName;
    private String mPluginPkgName;
    private Resources mBase;

    public DelegateResources(Resources base, String hostPkgName, String pluginPkgName) {
        super(base.getAssets(),base.getDisplayMetrics(),base.getConfiguration());
        this.mHostPkgName = hostPkgName;
        this.mPluginPkgName = pluginPkgName;
        this.mBase = base;
    }

    public static Resources getSystem() {
        return Resources.getSystem();
    }

    @Override
    public CharSequence getText(int id) throws NotFoundException {
        return mBase.getText(id);
    }

    @Override
    public CharSequence getQuantityText(int id, int quantity) throws NotFoundException {
        return mBase.getQuantityText(id, quantity);
    }

    @Override
    public String getString(int id) throws NotFoundException {
        return mBase.getString(id);
    }

    @Override
    public String getString(int id, Object... formatArgs) throws NotFoundException {
        return mBase.getString(id, formatArgs);
    }

    @Override
    public String getQuantityString(int id, int quantity, Object... formatArgs) throws NotFoundException {
        return mBase.getQuantityString(id, quantity, formatArgs);
    }

    @Override
    public String getQuantityString(int id, int quantity) throws NotFoundException {
        return mBase.getQuantityString(id, quantity);
    }

    @Override
    public CharSequence getText(int id, CharSequence def) {
        return mBase.getText(id, def);
    }

    @Override
    public CharSequence[] getTextArray(int id) throws NotFoundException {
        return mBase.getTextArray(id);
    }

    @Override
    public String[] getStringArray(int id) throws NotFoundException {
        return mBase.getStringArray(id);
    }

    @Override
    public int[] getIntArray(int id) throws NotFoundException {
        return mBase.getIntArray(id);
    }

    @Override
    public TypedArray obtainTypedArray(int id) throws NotFoundException {
        return mBase.obtainTypedArray(id);
    }

    @Override
    public float getDimension(int id) throws NotFoundException {
        return mBase.getDimension(id);
    }

    @Override
    public int getDimensionPixelOffset(int id) throws NotFoundException {
        return mBase.getDimensionPixelOffset(id);
    }

    @Override
    public int getDimensionPixelSize(int id) throws NotFoundException {
        return mBase.getDimensionPixelSize(id);
    }

    @TargetApi(Build.VERSION_CODES.CUPCAKE)
    @Override
    public float getFraction(int id, int base, int pbase) {
        return mBase.getFraction(id, base, pbase);
    }

    @Override
    @Deprecated
    public Drawable getDrawable(int id) throws NotFoundException {
        return mBase.getDrawable(id);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    public Drawable getDrawable(int id, Theme theme) throws NotFoundException {
        return mBase.getDrawable(id, theme);
    }


    @Override
    @Deprecated
    public Drawable getDrawableForDensity(int id, int density) throws NotFoundException {
        return mBase.getDrawableForDensity(id, density);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    public Drawable getDrawableForDensity(int id, int density, Theme theme) {
        return mBase.getDrawableForDensity(id, density, theme);
    }

    @Override
    public Movie getMovie(int id) throws NotFoundException {
        return mBase.getMovie(id);
    }

    @Override
    @Deprecated
    public int getColor(int id) throws NotFoundException {
        return mBase.getColor(id);
    }

    @TargetApi(Build.VERSION_CODES.M)
    @Override
    public int getColor(int id, Theme theme) throws NotFoundException {
        return mBase.getColor(id, theme);
    }

    @Override
    @Deprecated
    public ColorStateList getColorStateList(int id) throws NotFoundException {
        return mBase.getColorStateList(id);
    }

    @TargetApi(Build.VERSION_CODES.M)
    @Override
    public ColorStateList getColorStateList(int id, Theme theme) throws NotFoundException {
        return mBase.getColorStateList(id, theme);
    }

    @TargetApi(Build.VERSION_CODES.CUPCAKE)
    @Override
    public boolean getBoolean(int id) throws NotFoundException {
        return mBase.getBoolean(id);
    }

    @Override
    public int getInteger(int id) throws NotFoundException {
        return mBase.getInteger(id);
    }

    @Override
    public XmlResourceParser getLayout(int id) throws NotFoundException {
        return mBase.getLayout(id);
    }

    @Override
    public XmlResourceParser getAnimation(int id) throws NotFoundException {
        return mBase.getAnimation(id);
    }

    @Override
    public XmlResourceParser getXml(int id) throws NotFoundException {
        return mBase.getXml(id);
    }

    @Override
    public InputStream openRawResource(int id) throws NotFoundException {
        return mBase.openRawResource(id);
    }

    @TargetApi(Build.VERSION_CODES.CUPCAKE)
    @Override
    public InputStream openRawResource(int id, TypedValue value) throws NotFoundException {
        return mBase.openRawResource(id, value);
    }

    @Override
    public AssetFileDescriptor openRawResourceFd(int id) throws NotFoundException {
        return mBase.openRawResourceFd(id);
    }

    @Override
    public void getValue(int id, TypedValue outValue, boolean resolveRefs) throws NotFoundException {
        mBase.getValue(id, outValue, resolveRefs);
    }

    @TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1)
    @Override
    public void getValueForDensity(int id, int density, TypedValue outValue, boolean resolveRefs) throws NotFoundException {
        mBase.getValueForDensity(id, density, outValue, resolveRefs);
    }

    @Override
    public void getValue(String name, TypedValue outValue, boolean resolveRefs) throws NotFoundException {
        mBase.getValue(name, outValue, resolveRefs);
    }

    @Override
    public TypedArray obtainAttributes(AttributeSet set, int[] attrs) {
        return mBase.obtainAttributes(set, attrs);
    }

    @Override
    public void updateConfiguration(Configuration config, DisplayMetrics metrics) {
        mBase.updateConfiguration(config, metrics);
    }

    @Override
    public DisplayMetrics getDisplayMetrics() {
        return mBase.getDisplayMetrics();
    }

    @Override
    public Configuration getConfiguration() {
        return mBase.getConfiguration();
    }

    @Override
    public int getIdentifier(String name, String defType, String defPackage) {
        if (defPackage.equals(mHostPkgName)) {
            defPackage = mPluginPkgName;
        }
        return mBase.getIdentifier(name, defType, defPackage);
    }

    @Override
    public String getResourceName(int resid) throws NotFoundException {
        return mBase.getResourceName(resid);
    }

    @Override
    public String getResourcePackageName(int resid) throws NotFoundException {
        return mBase.getResourcePackageName(resid);
    }

    @Override
    public String getResourceTypeName(int resid) throws NotFoundException {
        return mBase.getResourceTypeName(resid);
    }

    @Override
    public String getResourceEntryName(int resid) throws NotFoundException {
        return mBase.getResourceEntryName(resid);
    }

    @TargetApi(Build.VERSION_CODES.CUPCAKE)
    @Override
    public void parseBundleExtras(XmlResourceParser parser, Bundle outBundle) throws XmlPullParserException, IOException {
        mBase.parseBundleExtras(parser, outBundle);
    }

    @TargetApi(Build.VERSION_CODES.CUPCAKE)
    @Override
    public void parseBundleExtra(String tagName, AttributeSet attrs, Bundle outBundle) throws XmlPullParserException {
        mBase.parseBundleExtra(tagName, attrs, outBundle);
    }
}
