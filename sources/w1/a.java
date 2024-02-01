package w1;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.location.Location;
import android.util.Pair;
import d.m0;
import d.o0;
import d.x0;
import g4.o;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class a {
    public static final String A = "PlanarConfiguration";
    public static final String A0 = "ShutterSpeedValue";
    public static final String A1 = "GPSDOP";
    public static final int A2 = 3;
    public static final short A3 = 15;
    public static final short A4 = 0;
    public static final short A5 = 20306;
    public static final d A6 = new d(J, 513, 4);
    public static final String B = "YCbCrSubSampling";
    public static final String B0 = "ApertureValue";
    public static final String B1 = "GPSSpeedRef";
    public static final int B2 = 4;
    public static final short B3 = 16;
    public static final short B4 = 0;
    public static final short B5 = 21330;
    public static final d B6 = new d(K, 514, 4);
    public static final String C = "YCbCrPositioning";
    public static final String C0 = "BrightnessValue";
    public static final String C1 = "GPSSpeed";
    public static final int C2 = 5;
    public static final short C3 = 17;
    public static final short C4 = 0;
    public static final byte[] C5 = {79, 76, 89, 77, 80, 0};
    public static final HashMap<Integer, d>[] C6;
    public static final String D = "XResolution";
    public static final String D0 = "ExposureBiasValue";
    public static final String D1 = "GPSTrackRef";
    public static final int D2 = 6;
    public static final short D3 = 18;
    public static final short D4 = 0;
    public static final byte[] D5 = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final HashMap<String, d>[] D6;
    public static final String E = "YResolution";
    public static final String E0 = "MaxApertureValue";
    public static final String E1 = "GPSTrack";
    public static final int E2 = 7;
    public static final short E3 = 19;
    public static final short E4 = 1;
    public static final int E5 = 8;
    public static final HashSet<String> E6 = new HashSet<>(Arrays.asList(new String[]{f14477o0, Z0, f14469n0, F0, f14541w1}));
    public static final String F = "ResolutionUnit";
    public static final String F0 = "SubjectDistance";
    public static final String F1 = "GPSImgDirectionRef";
    public static final int F2 = 8;
    public static final short F3 = 20;
    public static final short F4 = 2;
    public static final int F5 = 12;
    public static final HashMap<Integer, Integer> F6 = new HashMap<>();
    public static final String G = "StripOffsets";
    public static final String G0 = "MeteringMode";
    public static final String G1 = "GPSImgDirection";
    public static final List<Integer> G2 = Arrays.asList(new Integer[]{1, 6, 3, 8});
    public static final short G3 = 21;
    public static final short G4 = 0;
    public static final short G5 = 85;
    public static final Charset G6;
    public static final String H = "RowsPerStrip";
    public static final String H0 = "LightSource";
    public static final String H1 = "GPSMapDatum";
    public static final List<Integer> H2 = Arrays.asList(new Integer[]{2, 7, 4, 5});
    public static final short H3 = 22;
    public static final short H4 = 1;
    public static final String H5 = "PENTAX";
    public static final byte[] H6;
    public static final String I = "StripByteCounts";
    public static final String I0 = "Flash";
    public static final String I1 = "GPSDestLatitudeRef";
    public static final short I2 = 1;
    public static final short I3 = 23;
    public static final short I4 = 2;
    public static final int I5 = 6;
    public static final byte I6 = -1;
    public static final String J = "JPEGInterchangeFormat";
    public static final String J0 = "SubjectArea";
    public static final String J1 = "GPSDestLatitude";
    public static final short J2 = 2;
    public static final short J3 = 24;
    public static final short J4 = 3;
    public static SimpleDateFormat J5 = null;
    public static final byte J6 = -40;
    public static final String K = "JPEGInterchangeFormatLength";
    public static final String K0 = "FocalLength";
    public static final String K1 = "GPSDestLongitudeRef";
    public static final short K2 = 1;
    public static final short K3 = 255;
    public static final String K4 = "N";
    public static final short K5 = 18761;
    public static final byte K6 = -64;
    public static final String L = "TransferFunction";
    public static final String L0 = "FlashEnergy";
    public static final String L1 = "GPSDestLongitude";
    public static final short L2 = 2;
    public static final short L3 = 1;
    public static final String L4 = "S";
    public static final short L5 = 19789;
    public static final byte L6 = -63;
    public static final String M = "WhitePoint";
    public static final String M0 = "SpatialFrequencyResponse";
    public static final String M1 = "GPSDestBearingRef";
    public static final short M2 = 2;
    public static final short M3 = 4;
    public static final String M4 = "E";
    public static final byte M5 = 42;
    public static final byte M6 = -62;
    public static final String N = "PrimaryChromaticities";
    public static final String N0 = "FocalPlaneXResolution";
    public static final String N1 = "GPSDestBearing";
    public static final short N2 = 3;
    public static final short N3 = 6;
    public static final String N4 = "W";
    public static final int N5 = 8;
    public static final byte N6 = -61;
    public static final String O = "YCbCrCoefficients";
    public static final String O0 = "FocalPlaneYResolution";
    public static final String O1 = "GPSDestDistanceRef";
    public static final int O2 = 1;
    public static final short O3 = 8;
    public static final short O4 = 0;
    public static final int O5 = 1;
    public static final byte O6 = -59;
    public static final String P = "ReferenceBlackWhite";
    public static final String P0 = "FocalPlaneResolutionUnit";
    public static final String P1 = "GPSDestDistance";
    public static final int P2 = 65535;
    public static final short P3 = 16;
    public static final short P4 = 1;
    public static final int P5 = 2;
    public static final byte P6 = -58;
    public static final String Q = "DateTime";
    public static final String Q0 = "SubjectLocation";
    public static final String Q1 = "GPSProcessingMethod";
    public static final short Q2 = 0;
    public static final short Q3 = 24;
    public static final String Q4 = "A";
    public static final int Q5 = 3;
    public static final byte Q6 = -57;
    public static final String R = "ImageDescription";
    public static final String R0 = "ExposureIndex";
    public static final String R1 = "GPSAreaInformation";
    public static final short R2 = 1;
    public static final short R3 = 32;
    public static final String R4 = "V";
    public static final int R5 = 4;
    public static final byte R6 = -55;
    public static final String S = "Make";
    public static final String S0 = "SensingMethod";
    public static final String S1 = "GPSDateStamp";
    public static final short S2 = 2;
    public static final short S3 = 64;
    public static final String S4 = "2";
    public static final int S5 = 5;
    public static final byte S6 = -54;
    public static final String T = "Model";
    public static final String T0 = "FileSource";
    public static final String T1 = "GPSDifferential";
    public static final short T2 = 3;
    public static final short T3 = 1;
    public static final String T4 = "3";
    public static final int T5 = 6;
    public static final byte T6 = -53;
    public static final String U = "Software";
    public static final String U0 = "SceneType";
    public static final String U1 = "GPSHPositioningError";
    public static final short U2 = 4;
    public static final short U3 = 2;
    public static final String U4 = "K";
    public static final int U5 = 7;
    public static final byte U6 = -51;
    public static final String V = "Artist";
    public static final String V0 = "CFAPattern";
    public static final String V1 = "InteroperabilityIndex";
    public static final short V2 = 5;
    public static final short V3 = 3;
    public static final String V4 = "M";
    public static final int V5 = 8;
    public static final byte V6 = -50;
    public static final String W = "Copyright";
    public static final String W0 = "CustomRendered";
    public static final String W1 = "ThumbnailImageLength";
    public static final short W2 = 6;
    public static final short W3 = 4;
    public static final String W4 = "N";
    public static final int W5 = 9;
    public static final byte W6 = -49;
    public static final String X = "ExifVersion";
    public static final String X0 = "ExposureMode";
    public static final String X1 = "ThumbnailImageWidth";
    public static final short X2 = 7;
    public static final short X3 = 5;
    public static final String X4 = "T";
    public static final int X5 = 10;
    public static final byte X6 = -38;
    public static final String Y = "FlashpixVersion";
    public static final String Y0 = "WhiteBalance";
    public static final String Y1 = "DNGVersion";
    public static final short Y2 = 8;
    public static final short Y3 = 7;
    public static final String Y4 = "M";
    public static final int Y5 = 11;
    public static final byte Y6 = -31;
    public static final String Z = "ColorSpace";
    public static final String Z0 = "DigitalZoomRatio";
    public static final String Z1 = "DefaultCropSize";
    public static final short Z2 = 0;
    public static final short Z3 = 8;
    public static final String Z4 = "K";
    public static final int Z5 = 12;
    public static final byte Z6 = -2;

    /* renamed from: a0  reason: collision with root package name */
    public static final String f14365a0 = "Gamma";

    /* renamed from: a1  reason: collision with root package name */
    public static final String f14366a1 = "FocalLengthIn35mmFilm";

    /* renamed from: a2  reason: collision with root package name */
    public static final String f14367a2 = "ThumbnailImage";

    /* renamed from: a3  reason: collision with root package name */
    public static final short f14368a3 = 1;

    /* renamed from: a4  reason: collision with root package name */
    public static final short f14369a4 = 0;

    /* renamed from: a5  reason: collision with root package name */
    public static final String f14370a5 = "M";

    /* renamed from: a6  reason: collision with root package name */
    public static final int f14371a6 = 13;

    /* renamed from: a7  reason: collision with root package name */
    public static final byte f14372a7 = -39;

    /* renamed from: b0  reason: collision with root package name */
    public static final String f14373b0 = "PixelXDimension";

    /* renamed from: b1  reason: collision with root package name */
    public static final String f14374b1 = "SceneCaptureType";

    /* renamed from: b2  reason: collision with root package name */
    public static final String f14375b2 = "PreviewImageStart";

    /* renamed from: b3  reason: collision with root package name */
    public static final short f14376b3 = 2;

    /* renamed from: b4  reason: collision with root package name */
    public static final short f14377b4 = 1;

    /* renamed from: b5  reason: collision with root package name */
    public static final String f14378b5 = "N";

    /* renamed from: b6  reason: collision with root package name */
    public static final String[] f14379b6 = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE"};

    /* renamed from: b7  reason: collision with root package name */
    public static final int f14380b7 = 0;

    /* renamed from: c0  reason: collision with root package name */
    public static final String f14381c0 = "PixelYDimension";

    /* renamed from: c1  reason: collision with root package name */
    public static final String f14382c1 = "GainControl";

    /* renamed from: c2  reason: collision with root package name */
    public static final String f14383c2 = "PreviewImageLength";

    /* renamed from: c3  reason: collision with root package name */
    public static final short f14384c3 = 3;

    /* renamed from: c4  reason: collision with root package name */
    public static final short f14385c4 = 2;

    /* renamed from: c5  reason: collision with root package name */
    public static final short f14386c5 = 0;

    /* renamed from: c6  reason: collision with root package name */
    public static final int[] f14387c6 = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: c7  reason: collision with root package name */
    public static final int f14388c7 = 1;

    /* renamed from: d0  reason: collision with root package name */
    public static final String f14389d0 = "ComponentsConfiguration";

    /* renamed from: d1  reason: collision with root package name */
    public static final String f14390d1 = "Contrast";

    /* renamed from: d2  reason: collision with root package name */
    public static final String f14391d2 = "AspectFrame";

    /* renamed from: d3  reason: collision with root package name */
    public static final short f14392d3 = 4;

    /* renamed from: d4  reason: collision with root package name */
    public static final short f14393d4 = 3;

    /* renamed from: d5  reason: collision with root package name */
    public static final short f14394d5 = 1;

    /* renamed from: d6  reason: collision with root package name */
    public static final byte[] f14395d6 = {65, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: d7  reason: collision with root package name */
    public static final int f14396d7 = 2;

    /* renamed from: e0  reason: collision with root package name */
    public static final String f14397e0 = "CompressedBitsPerPixel";

    /* renamed from: e1  reason: collision with root package name */
    public static final String f14398e1 = "Saturation";

    /* renamed from: e2  reason: collision with root package name */
    public static final String f14399e2 = "SensorBottomBorder";

    /* renamed from: e3  reason: collision with root package name */
    public static final short f14400e3 = 5;

    /* renamed from: e4  reason: collision with root package name */
    public static final short f14401e4 = 1;

    /* renamed from: e5  reason: collision with root package name */
    public static final int f14402e5 = 1;

    /* renamed from: e6  reason: collision with root package name */
    public static final d[] f14403e6;

    /* renamed from: e7  reason: collision with root package name */
    public static final int f14404e7 = 3;

    /* renamed from: f0  reason: collision with root package name */
    public static final String f14405f0 = "MakerNote";

    /* renamed from: f1  reason: collision with root package name */
    public static final String f14406f1 = "Sharpness";

    /* renamed from: f2  reason: collision with root package name */
    public static final String f14407f2 = "SensorLeftBorder";

    /* renamed from: f3  reason: collision with root package name */
    public static final short f14408f3 = 6;

    /* renamed from: f4  reason: collision with root package name */
    public static final short f14409f4 = 0;

    /* renamed from: f5  reason: collision with root package name */
    public static final int f14410f5 = 2;

    /* renamed from: f6  reason: collision with root package name */
    public static final d[] f14411f6;

    /* renamed from: f7  reason: collision with root package name */
    public static final int f14412f7 = 4;

    /* renamed from: g0  reason: collision with root package name */
    public static final String f14413g0 = "UserComment";

    /* renamed from: g1  reason: collision with root package name */
    public static final String f14414g1 = "DeviceSettingDescription";

    /* renamed from: g2  reason: collision with root package name */
    public static final String f14415g2 = "SensorRightBorder";

    /* renamed from: g3  reason: collision with root package name */
    public static final short f14416g3 = 7;

    /* renamed from: g4  reason: collision with root package name */
    public static final short f14417g4 = 1;

    /* renamed from: g5  reason: collision with root package name */
    public static final int f14418g5 = 6;

    /* renamed from: g6  reason: collision with root package name */
    public static final d[] f14419g6;

    /* renamed from: g7  reason: collision with root package name */
    public static final int f14420g7 = 5;

    /* renamed from: h0  reason: collision with root package name */
    public static final String f14421h0 = "RelatedSoundFile";

    /* renamed from: h1  reason: collision with root package name */
    public static final String f14422h1 = "SubjectDistanceRange";

    /* renamed from: h2  reason: collision with root package name */
    public static final String f14423h2 = "SensorTopBorder";

    /* renamed from: h3  reason: collision with root package name */
    public static final short f14424h3 = 0;

    /* renamed from: h4  reason: collision with root package name */
    public static final short f14425h4 = 0;

    /* renamed from: h5  reason: collision with root package name */
    public static final int f14426h5 = 7;

    /* renamed from: h6  reason: collision with root package name */
    public static final d[] f14427h6;

    /* renamed from: h7  reason: collision with root package name */
    public static final int f14428h7 = 6;

    /* renamed from: i0  reason: collision with root package name */
    public static final String f14429i0 = "DateTimeOriginal";

    /* renamed from: i1  reason: collision with root package name */
    public static final String f14430i1 = "ImageUniqueID";

    /* renamed from: i2  reason: collision with root package name */
    public static final String f14431i2 = "ISO";

    /* renamed from: i3  reason: collision with root package name */
    public static final short f14432i3 = 1;

    /* renamed from: i4  reason: collision with root package name */
    public static final short f14433i4 = 1;

    /* renamed from: i5  reason: collision with root package name */
    public static final int f14434i5 = 8;

    /* renamed from: i6  reason: collision with root package name */
    public static final d[] f14435i6;

    /* renamed from: i7  reason: collision with root package name */
    public static final int f14436i7 = 7;

    /* renamed from: j0  reason: collision with root package name */
    public static final String f14437j0 = "DateTimeDigitized";

    /* renamed from: j1  reason: collision with root package name */
    public static final String f14438j1 = "CameraOwnerName";

    /* renamed from: j2  reason: collision with root package name */
    public static final String f14439j2 = "JpgFromRaw";

    /* renamed from: j3  reason: collision with root package name */
    public static final short f14440j3 = 2;

    /* renamed from: j4  reason: collision with root package name */
    public static final short f14441j4 = 2;

    /* renamed from: j5  reason: collision with root package name */
    public static final int f14442j5 = 32773;

    /* renamed from: j6  reason: collision with root package name */
    public static final d f14443j6 = new d(G, 273, 3);

    /* renamed from: j7  reason: collision with root package name */
    public static final int f14444j7 = 8;

    /* renamed from: k0  reason: collision with root package name */
    public static final String f14445k0 = "SubSecTime";

    /* renamed from: k1  reason: collision with root package name */
    public static final String f14446k1 = "BodySerialNumber";

    /* renamed from: k2  reason: collision with root package name */
    public static final String f14447k2 = "NewSubfileType";

    /* renamed from: k3  reason: collision with root package name */
    public static final short f14448k3 = 3;
    @Deprecated

    /* renamed from: k4  reason: collision with root package name */
    public static final int f14449k4 = 0;

    /* renamed from: k5  reason: collision with root package name */
    public static final int f14450k5 = 34892;

    /* renamed from: k6  reason: collision with root package name */
    public static final d[] f14451k6;

    /* renamed from: k7  reason: collision with root package name */
    public static final int f14452k7 = 9;

    /* renamed from: l0  reason: collision with root package name */
    public static final String f14453l0 = "SubSecTimeOriginal";

    /* renamed from: l1  reason: collision with root package name */
    public static final String f14454l1 = "LensSpecification";

    /* renamed from: l2  reason: collision with root package name */
    public static final String f14455l2 = "SubfileType";

    /* renamed from: l3  reason: collision with root package name */
    public static final short f14456l3 = 4;
    @Deprecated

    /* renamed from: l4  reason: collision with root package name */
    public static final int f14457l4 = 1;

    /* renamed from: l5  reason: collision with root package name */
    public static final int[] f14458l5 = {8, 8, 8};

    /* renamed from: l6  reason: collision with root package name */
    public static final d[] f14459l6;

    /* renamed from: l7  reason: collision with root package name */
    public static final int f14460l7 = 10;

    /* renamed from: m0  reason: collision with root package name */
    public static final String f14461m0 = "SubSecTimeDigitized";

    /* renamed from: m1  reason: collision with root package name */
    public static final String f14462m1 = "LensMake";

    /* renamed from: m2  reason: collision with root package name */
    public static final String f14463m2 = "ExifIFDPointer";

    /* renamed from: m3  reason: collision with root package name */
    public static final short f14464m3 = 5;

    /* renamed from: m4  reason: collision with root package name */
    public static final short f14465m4 = 0;

    /* renamed from: m5  reason: collision with root package name */
    public static final int[] f14466m5 = {4};

    /* renamed from: m6  reason: collision with root package name */
    public static final d[] f14467m6;

    /* renamed from: m7  reason: collision with root package name */
    public static final int f14468m7 = 11;

    /* renamed from: n0  reason: collision with root package name */
    public static final String f14469n0 = "ExposureTime";

    /* renamed from: n1  reason: collision with root package name */
    public static final String f14470n1 = "LensModel";

    /* renamed from: n2  reason: collision with root package name */
    public static final String f14471n2 = "GPSInfoIFDPointer";

    /* renamed from: n3  reason: collision with root package name */
    public static final short f14472n3 = 6;

    /* renamed from: n4  reason: collision with root package name */
    public static final short f14473n4 = 1;

    /* renamed from: n5  reason: collision with root package name */
    public static final int[] f14474n5 = {8};

    /* renamed from: n6  reason: collision with root package name */
    public static final d[] f14475n6;

    /* renamed from: n7  reason: collision with root package name */
    public static final Pattern f14476n7 = Pattern.compile(".*[1-9].*");

    /* renamed from: o0  reason: collision with root package name */
    public static final String f14477o0 = "FNumber";

    /* renamed from: o1  reason: collision with root package name */
    public static final String f14478o1 = "LensSerialNumber";

    /* renamed from: o2  reason: collision with root package name */
    public static final String f14479o2 = "InteroperabilityIFDPointer";

    /* renamed from: o3  reason: collision with root package name */
    public static final short f14480o3 = 255;

    /* renamed from: o4  reason: collision with root package name */
    public static final short f14481o4 = 0;

    /* renamed from: o5  reason: collision with root package name */
    public static final int f14482o5 = 0;

    /* renamed from: o6  reason: collision with root package name */
    public static final int f14483o6 = 0;

    /* renamed from: o7  reason: collision with root package name */
    public static final Pattern f14484o7 = Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");

    /* renamed from: p0  reason: collision with root package name */
    public static final String f14485p0 = "ExposureProgram";

    /* renamed from: p1  reason: collision with root package name */
    public static final String f14486p1 = "GPSVersionID";

    /* renamed from: p2  reason: collision with root package name */
    public static final String f14487p2 = "SubIFDPointer";

    /* renamed from: p3  reason: collision with root package name */
    public static final short f14488p3 = 0;

    /* renamed from: p4  reason: collision with root package name */
    public static final short f14489p4 = 1;

    /* renamed from: p5  reason: collision with root package name */
    public static final int f14490p5 = 1;

    /* renamed from: p6  reason: collision with root package name */
    public static final int f14491p6 = 1;

    /* renamed from: q0  reason: collision with root package name */
    public static final String f14492q0 = "SpectralSensitivity";

    /* renamed from: q1  reason: collision with root package name */
    public static final String f14493q1 = "GPSLatitudeRef";

    /* renamed from: q2  reason: collision with root package name */
    public static final String f14494q2 = "CameraSettingsIFDPointer";

    /* renamed from: q3  reason: collision with root package name */
    public static final short f14495q3 = 1;

    /* renamed from: q4  reason: collision with root package name */
    public static final short f14496q4 = 2;

    /* renamed from: q5  reason: collision with root package name */
    public static final int f14497q5 = 2;

    /* renamed from: q6  reason: collision with root package name */
    public static final int f14498q6 = 2;

    /* renamed from: r  reason: collision with root package name */
    public static final String f14499r = "ExifInterface";
    @Deprecated

    /* renamed from: r0  reason: collision with root package name */
    public static final String f14500r0 = "ISOSpeedRatings";

    /* renamed from: r1  reason: collision with root package name */
    public static final String f14501r1 = "GPSLatitude";

    /* renamed from: r2  reason: collision with root package name */
    public static final String f14502r2 = "ImageProcessingIFDPointer";

    /* renamed from: r3  reason: collision with root package name */
    public static final short f14503r3 = 2;

    /* renamed from: r4  reason: collision with root package name */
    public static final short f14504r4 = 3;

    /* renamed from: r5  reason: collision with root package name */
    public static final int f14505r5 = 6;

    /* renamed from: r6  reason: collision with root package name */
    public static final int f14506r6 = 3;

    /* renamed from: s  reason: collision with root package name */
    public static final boolean f14507s = false;

    /* renamed from: s0  reason: collision with root package name */
    public static final String f14508s0 = "PhotographicSensitivity";

    /* renamed from: s1  reason: collision with root package name */
    public static final String f14509s1 = "GPSLongitudeRef";

    /* renamed from: s2  reason: collision with root package name */
    public static final String f14510s2 = "HasThumbnail";

    /* renamed from: s3  reason: collision with root package name */
    public static final short f14511s3 = 3;

    /* renamed from: s4  reason: collision with root package name */
    public static final short f14512s4 = 0;

    /* renamed from: s5  reason: collision with root package name */
    public static final int f14513s5 = 0;

    /* renamed from: s6  reason: collision with root package name */
    public static final int f14514s6 = 4;

    /* renamed from: t  reason: collision with root package name */
    public static final String f14515t = "ImageWidth";

    /* renamed from: t0  reason: collision with root package name */
    public static final String f14516t0 = "OECF";

    /* renamed from: t1  reason: collision with root package name */
    public static final String f14517t1 = "GPSLongitude";

    /* renamed from: t2  reason: collision with root package name */
    public static final String f14518t2 = "ThumbnailOffset";

    /* renamed from: t3  reason: collision with root package name */
    public static final short f14519t3 = 4;

    /* renamed from: t4  reason: collision with root package name */
    public static final short f14520t4 = 1;

    /* renamed from: t5  reason: collision with root package name */
    public static final int f14521t5 = 1;

    /* renamed from: t6  reason: collision with root package name */
    public static final int f14522t6 = 5;

    /* renamed from: u  reason: collision with root package name */
    public static final String f14523u = "ImageLength";

    /* renamed from: u0  reason: collision with root package name */
    public static final String f14524u0 = "SensitivityType";

    /* renamed from: u1  reason: collision with root package name */
    public static final String f14525u1 = "GPSAltitudeRef";

    /* renamed from: u2  reason: collision with root package name */
    public static final String f14526u2 = "ThumbnailLength";

    /* renamed from: u3  reason: collision with root package name */
    public static final short f14527u3 = 9;

    /* renamed from: u4  reason: collision with root package name */
    public static final short f14528u4 = 2;

    /* renamed from: u5  reason: collision with root package name */
    public static final int f14529u5 = 5000;

    /* renamed from: u6  reason: collision with root package name */
    public static final int f14530u6 = 6;

    /* renamed from: v  reason: collision with root package name */
    public static final String f14531v = "BitsPerSample";

    /* renamed from: v0  reason: collision with root package name */
    public static final String f14532v0 = "StandardOutputSensitivity";

    /* renamed from: v1  reason: collision with root package name */
    public static final String f14533v1 = "GPSAltitude";

    /* renamed from: v2  reason: collision with root package name */
    public static final String f14534v2 = "ThumbnailData";

    /* renamed from: v3  reason: collision with root package name */
    public static final short f14535v3 = 10;

    /* renamed from: v4  reason: collision with root package name */
    public static final short f14536v4 = 3;

    /* renamed from: v5  reason: collision with root package name */
    public static final byte[] f14537v5 = {-1, J6, -1};

    /* renamed from: v6  reason: collision with root package name */
    public static final int f14538v6 = 7;

    /* renamed from: w  reason: collision with root package name */
    public static final String f14539w = "Compression";

    /* renamed from: w0  reason: collision with root package name */
    public static final String f14540w0 = "RecommendedExposureIndex";

    /* renamed from: w1  reason: collision with root package name */
    public static final String f14541w1 = "GPSTimeStamp";

    /* renamed from: w2  reason: collision with root package name */
    public static final int f14542w2 = 512;

    /* renamed from: w3  reason: collision with root package name */
    public static final short f14543w3 = 11;

    /* renamed from: w4  reason: collision with root package name */
    public static final short f14544w4 = 4;

    /* renamed from: w5  reason: collision with root package name */
    public static final String f14545w5 = "FUJIFILMCCD-RAW";

    /* renamed from: w6  reason: collision with root package name */
    public static final int f14546w6 = 8;

    /* renamed from: x  reason: collision with root package name */
    public static final String f14547x = "PhotometricInterpretation";

    /* renamed from: x0  reason: collision with root package name */
    public static final String f14548x0 = "ISOSpeed";

    /* renamed from: x1  reason: collision with root package name */
    public static final String f14549x1 = "GPSSatellites";

    /* renamed from: x2  reason: collision with root package name */
    public static final int f14550x2 = 0;

    /* renamed from: x3  reason: collision with root package name */
    public static final short f14551x3 = 12;

    /* renamed from: x4  reason: collision with root package name */
    public static final short f14552x4 = 0;

    /* renamed from: x5  reason: collision with root package name */
    public static final int f14553x5 = 84;

    /* renamed from: x6  reason: collision with root package name */
    public static final int f14554x6 = 9;

    /* renamed from: y  reason: collision with root package name */
    public static final String f14555y = "Orientation";

    /* renamed from: y0  reason: collision with root package name */
    public static final String f14556y0 = "ISOSpeedLatitudeyyy";

    /* renamed from: y1  reason: collision with root package name */
    public static final String f14557y1 = "GPSStatus";

    /* renamed from: y2  reason: collision with root package name */
    public static final int f14558y2 = 1;

    /* renamed from: y3  reason: collision with root package name */
    public static final short f14559y3 = 13;

    /* renamed from: y4  reason: collision with root package name */
    public static final short f14560y4 = 1;

    /* renamed from: y5  reason: collision with root package name */
    public static final int f14561y5 = 160;

    /* renamed from: y6  reason: collision with root package name */
    public static final d[][] f14562y6;

    /* renamed from: z  reason: collision with root package name */
    public static final String f14563z = "SamplesPerPixel";

    /* renamed from: z0  reason: collision with root package name */
    public static final String f14564z0 = "ISOSpeedLatitudezzz";

    /* renamed from: z1  reason: collision with root package name */
    public static final String f14565z1 = "GPSMeasureMode";

    /* renamed from: z2  reason: collision with root package name */
    public static final int f14566z2 = 2;

    /* renamed from: z3  reason: collision with root package name */
    public static final short f14567z3 = 14;

    /* renamed from: z4  reason: collision with root package name */
    public static final short f14568z4 = 2;

    /* renamed from: z5  reason: collision with root package name */
    public static final int f14569z5 = 4;

    /* renamed from: z6  reason: collision with root package name */
    public static final d[] f14570z6 = {new d(f14487p2, dg.a.Qo, 4), new d(f14463m2, 34665, 4), new d(f14471n2, 34853, 4), new d(f14479o2, 40965, 4), new d(f14494q2, 8224, 1), new d(f14502r2, 8256, 1)};

    /* renamed from: a  reason: collision with root package name */
    public final String f14571a;

    /* renamed from: b  reason: collision with root package name */
    public final AssetManager.AssetInputStream f14572b;

    /* renamed from: c  reason: collision with root package name */
    public int f14573c;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap<String, c>[] f14574d;

    /* renamed from: e  reason: collision with root package name */
    public Set<Integer> f14575e;

    /* renamed from: f  reason: collision with root package name */
    public ByteOrder f14576f = ByteOrder.BIG_ENDIAN;

    /* renamed from: g  reason: collision with root package name */
    public boolean f14577g;

    /* renamed from: h  reason: collision with root package name */
    public int f14578h;

    /* renamed from: i  reason: collision with root package name */
    public int f14579i;

    /* renamed from: j  reason: collision with root package name */
    public byte[] f14580j;

    /* renamed from: k  reason: collision with root package name */
    public int f14581k;

    /* renamed from: l  reason: collision with root package name */
    public int f14582l;

    /* renamed from: m  reason: collision with root package name */
    public int f14583m;

    /* renamed from: n  reason: collision with root package name */
    public int f14584n;

    /* renamed from: o  reason: collision with root package name */
    public int f14585o;

    /* renamed from: p  reason: collision with root package name */
    public int f14586p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f14587q;

    /* renamed from: w1.a$a  reason: collision with other inner class name */
    public static class C0234a extends InputStream implements DataInput {
        public static final ByteOrder S = ByteOrder.LITTLE_ENDIAN;
        public static final ByteOrder T = ByteOrder.BIG_ENDIAN;
        public DataInputStream O;
        public ByteOrder P;
        public final int Q;
        public int R;

        public C0234a(InputStream inputStream) throws IOException {
            this.P = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.O = dataInputStream;
            int available = dataInputStream.available();
            this.Q = available;
            this.R = 0;
            this.O.mark(available);
        }

        public C0234a(byte[] bArr) throws IOException {
            this((InputStream) new ByteArrayInputStream(bArr));
        }

        public int available() throws IOException {
            return this.O.available();
        }

        public int c() {
            return this.R;
        }

        public long f() throws IOException {
            return ((long) readInt()) & 4294967295L;
        }

        public void g(long j10) throws IOException {
            int i10 = this.R;
            if (((long) i10) > j10) {
                this.R = 0;
                this.O.reset();
                this.O.mark(this.Q);
            } else {
                j10 -= (long) i10;
            }
            int i11 = (int) j10;
            if (skipBytes(i11) != i11) {
                throw new IOException("Couldn't seek up to the byteCount");
            }
        }

        public void h(ByteOrder byteOrder) {
            this.P = byteOrder;
        }

        public int read() throws IOException {
            this.R++;
            return this.O.read();
        }

        public int read(byte[] bArr, int i10, int i11) throws IOException {
            int read = this.O.read(bArr, i10, i11);
            this.R += read;
            return read;
        }

        public boolean readBoolean() throws IOException {
            this.R++;
            return this.O.readBoolean();
        }

        public byte readByte() throws IOException {
            int i10 = this.R + 1;
            this.R = i10;
            if (i10 <= this.Q) {
                int read = this.O.read();
                if (read >= 0) {
                    return (byte) read;
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public char readChar() throws IOException {
            this.R += 2;
            return this.O.readChar();
        }

        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        public void readFully(byte[] bArr) throws IOException {
            int length = this.R + bArr.length;
            this.R = length;
            if (length > this.Q) {
                throw new EOFException();
            } else if (this.O.read(bArr, 0, bArr.length) != bArr.length) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        public void readFully(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = this.R + i11;
            this.R = i12;
            if (i12 > this.Q) {
                throw new EOFException();
            } else if (this.O.read(bArr, i10, i11) != i11) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        public int readInt() throws IOException {
            int i10 = this.R + 4;
            this.R = i10;
            if (i10 <= this.Q) {
                int read = this.O.read();
                int read2 = this.O.read();
                int read3 = this.O.read();
                int read4 = this.O.read();
                if ((read | read2 | read3 | read4) >= 0) {
                    ByteOrder byteOrder = this.P;
                    if (byteOrder == S) {
                        return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                    }
                    if (byteOrder == T) {
                        return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                    }
                    throw new IOException("Invalid byte order: " + this.P);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public String readLine() throws IOException {
            return null;
        }

        public long readLong() throws IOException {
            int i10 = this.R + 8;
            this.R = i10;
            if (i10 <= this.Q) {
                int read = this.O.read();
                int read2 = this.O.read();
                int read3 = this.O.read();
                int read4 = this.O.read();
                int read5 = this.O.read();
                int read6 = this.O.read();
                int read7 = this.O.read();
                int read8 = this.O.read();
                if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                    ByteOrder byteOrder = this.P;
                    if (byteOrder == S) {
                        return (((long) read8) << 56) + (((long) read7) << 48) + (((long) read6) << 40) + (((long) read5) << 32) + (((long) read4) << 24) + (((long) read3) << 16) + (((long) read2) << 8) + ((long) read);
                    }
                    int i11 = read2;
                    if (byteOrder == T) {
                        return (((long) read) << 56) + (((long) i11) << 48) + (((long) read3) << 40) + (((long) read4) << 32) + (((long) read5) << 24) + (((long) read6) << 16) + (((long) read7) << 8) + ((long) read8);
                    }
                    throw new IOException("Invalid byte order: " + this.P);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public short readShort() throws IOException {
            int i10 = this.R + 2;
            this.R = i10;
            if (i10 <= this.Q) {
                int read = this.O.read();
                int read2 = this.O.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.P;
                    if (byteOrder == S) {
                        return (short) ((read2 << 8) + read);
                    }
                    if (byteOrder == T) {
                        return (short) ((read << 8) + read2);
                    }
                    throw new IOException("Invalid byte order: " + this.P);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public String readUTF() throws IOException {
            this.R += 2;
            return this.O.readUTF();
        }

        public int readUnsignedByte() throws IOException {
            this.R++;
            return this.O.readUnsignedByte();
        }

        public int readUnsignedShort() throws IOException {
            int i10 = this.R + 2;
            this.R = i10;
            if (i10 <= this.Q) {
                int read = this.O.read();
                int read2 = this.O.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.P;
                    if (byteOrder == S) {
                        return (read2 << 8) + read;
                    }
                    if (byteOrder == T) {
                        return (read << 8) + read2;
                    }
                    throw new IOException("Invalid byte order: " + this.P);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public int skipBytes(int i10) throws IOException {
            int min = Math.min(i10, this.Q - this.R);
            int i11 = 0;
            while (i11 < min) {
                i11 += this.O.skipBytes(min - i11);
            }
            this.R += i11;
            return i11;
        }
    }

    public static class b extends FilterOutputStream {
        public final OutputStream O;
        public ByteOrder P;

        public b(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.O = outputStream;
            this.P = byteOrder;
        }

        public void c(ByteOrder byteOrder) {
            this.P = byteOrder;
        }

        public void f(int i10) throws IOException {
            this.O.write(i10);
        }

        public void g(int i10) throws IOException {
            OutputStream outputStream;
            int i11;
            ByteOrder byteOrder = this.P;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.O.write((i10 >>> 0) & 255);
                this.O.write((i10 >>> 8) & 255);
                this.O.write((i10 >>> 16) & 255);
                outputStream = this.O;
                i11 = i10 >>> 24;
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.O.write((i10 >>> 24) & 255);
                this.O.write((i10 >>> 16) & 255);
                this.O.write((i10 >>> 8) & 255);
                outputStream = this.O;
                i11 = i10 >>> 0;
            } else {
                return;
            }
            outputStream.write(i11 & 255);
        }

        public void h(short s10) throws IOException {
            OutputStream outputStream;
            int i10;
            ByteOrder byteOrder = this.P;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.O.write((s10 >>> 0) & 255);
                outputStream = this.O;
                i10 = s10 >>> 8;
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.O.write((s10 >>> 8) & 255);
                outputStream = this.O;
                i10 = s10 >>> 0;
            } else {
                return;
            }
            outputStream.write(i10 & 255);
        }

        public void i(long j10) throws IOException {
            g((int) j10);
        }

        public void k(int i10) throws IOException {
            h((short) i10);
        }

        public void write(byte[] bArr) throws IOException {
            this.O.write(bArr);
        }

        public void write(byte[] bArr, int i10, int i11) throws IOException {
            this.O.write(bArr, i10, i11);
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f14588a;

        /* renamed from: b  reason: collision with root package name */
        public final int f14589b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f14590c;

        public c(int i10, int i11, byte[] bArr) {
            this.f14588a = i10;
            this.f14589b = i11;
            this.f14590c = bArr;
        }

        public static c a(String str) {
            if (str.length() != 1 || str.charAt(0) < '0' || str.charAt(0) > '1') {
                byte[] bytes = str.getBytes(a.G6);
                return new c(1, bytes.length, bytes);
            }
            return new c(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
        }

        public static c b(double d10, ByteOrder byteOrder) {
            return c(new double[]{d10}, byteOrder);
        }

        public static c c(double[] dArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.f14387c6[12] * dArr.length)]);
            wrap.order(byteOrder);
            for (double putDouble : dArr) {
                wrap.putDouble(putDouble);
            }
            return new c(12, dArr.length, wrap.array());
        }

        public static c d(int i10, ByteOrder byteOrder) {
            return e(new int[]{i10}, byteOrder);
        }

        public static c e(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.f14387c6[9] * iArr.length)]);
            wrap.order(byteOrder);
            for (int putInt : iArr) {
                wrap.putInt(putInt);
            }
            return new c(9, iArr.length, wrap.array());
        }

        public static c f(f fVar, ByteOrder byteOrder) {
            return g(new f[]{fVar}, byteOrder);
        }

        public static c g(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.f14387c6[10] * fVarArr.length)]);
            wrap.order(byteOrder);
            for (f fVar : fVarArr) {
                wrap.putInt((int) fVar.f14595a);
                wrap.putInt((int) fVar.f14596b);
            }
            return new c(10, fVarArr.length, wrap.array());
        }

        public static c h(String str) {
            byte[] bytes = (str + 0).getBytes(a.G6);
            return new c(2, bytes.length, bytes);
        }

        public static c i(long j10, ByteOrder byteOrder) {
            return j(new long[]{j10}, byteOrder);
        }

        public static c j(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.f14387c6[4] * jArr.length)]);
            wrap.order(byteOrder);
            for (long j10 : jArr) {
                wrap.putInt((int) j10);
            }
            return new c(4, jArr.length, wrap.array());
        }

        public static c k(f fVar, ByteOrder byteOrder) {
            return l(new f[]{fVar}, byteOrder);
        }

        public static c l(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.f14387c6[5] * fVarArr.length)]);
            wrap.order(byteOrder);
            for (f fVar : fVarArr) {
                wrap.putInt((int) fVar.f14595a);
                wrap.putInt((int) fVar.f14596b);
            }
            return new c(5, fVarArr.length, wrap.array());
        }

        public static c m(int i10, ByteOrder byteOrder) {
            return n(new int[]{i10}, byteOrder);
        }

        public static c n(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.f14387c6[3] * iArr.length)]);
            wrap.order(byteOrder);
            for (int i10 : iArr) {
                wrap.putShort((short) i10);
            }
            return new c(3, iArr.length, wrap.array());
        }

        public double o(ByteOrder byteOrder) {
            Object r10 = r(byteOrder);
            if (r10 == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            } else if (r10 instanceof String) {
                return Double.parseDouble((String) r10);
            } else {
                if (r10 instanceof long[]) {
                    long[] jArr = (long[]) r10;
                    if (jArr.length == 1) {
                        return (double) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (r10 instanceof int[]) {
                    int[] iArr = (int[]) r10;
                    if (iArr.length == 1) {
                        return (double) iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (r10 instanceof double[]) {
                    double[] dArr = (double[]) r10;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (r10 instanceof f[]) {
                    f[] fVarArr = (f[]) r10;
                    if (fVarArr.length == 1) {
                        return fVarArr[0].a();
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
        }

        public int p(ByteOrder byteOrder) {
            Object r10 = r(byteOrder);
            if (r10 == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            } else if (r10 instanceof String) {
                return Integer.parseInt((String) r10);
            } else {
                if (r10 instanceof long[]) {
                    long[] jArr = (long[]) r10;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (r10 instanceof int[]) {
                    int[] iArr = (int[]) r10;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
        }

        public String q(ByteOrder byteOrder) {
            Object r10 = r(byteOrder);
            if (r10 == null) {
                return null;
            }
            if (r10 instanceof String) {
                return (String) r10;
            }
            StringBuilder sb2 = new StringBuilder();
            int i10 = 0;
            if (r10 instanceof long[]) {
                long[] jArr = (long[]) r10;
                while (i10 < jArr.length) {
                    sb2.append(jArr[i10]);
                    i10++;
                    if (i10 != jArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (r10 instanceof int[]) {
                int[] iArr = (int[]) r10;
                while (i10 < iArr.length) {
                    sb2.append(iArr[i10]);
                    i10++;
                    if (i10 != iArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (r10 instanceof double[]) {
                double[] dArr = (double[]) r10;
                while (i10 < dArr.length) {
                    sb2.append(dArr[i10]);
                    i10++;
                    if (i10 != dArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (!(r10 instanceof f[])) {
                return null;
            } else {
                f[] fVarArr = (f[]) r10;
                while (i10 < fVarArr.length) {
                    sb2.append(fVarArr[i10].f14595a);
                    sb2.append('/');
                    sb2.append(fVarArr[i10].f14596b);
                    i10++;
                    if (i10 != fVarArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:139:0x0147 A[SYNTHETIC, Splitter:B:139:0x0147] */
        /* JADX WARNING: Removed duplicated region for block: B:147:0x014e A[SYNTHETIC, Splitter:B:147:0x014e] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object r(java.nio.ByteOrder r9) {
            /*
                r8 = this;
                r0 = 0
                w1.a$a r1 = new w1.a$a     // Catch:{ IOException -> 0x014b, all -> 0x0144 }
                byte[] r2 = r8.f14590c     // Catch:{ IOException -> 0x014b, all -> 0x0144 }
                r1.<init>((byte[]) r2)     // Catch:{ IOException -> 0x014b, all -> 0x0144 }
                r1.h(r9)     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                int r9 = r8.f14588a     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                r2 = 0
                r3 = 1
                switch(r9) {
                    case 1: goto L_0x0117;
                    case 2: goto L_0x00d1;
                    case 3: goto L_0x00bc;
                    case 4: goto L_0x00a7;
                    case 5: goto L_0x0089;
                    case 6: goto L_0x0117;
                    case 7: goto L_0x00d1;
                    case 8: goto L_0x0074;
                    case 9: goto L_0x005f;
                    case 10: goto L_0x003f;
                    case 11: goto L_0x0029;
                    case 12: goto L_0x0014;
                    default: goto L_0x0012;
                }     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
            L_0x0012:
                goto L_0x013d
            L_0x0014:
                int r9 = r8.f14589b     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                double[] r9 = new double[r9]     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
            L_0x0018:
                int r3 = r8.f14589b     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                if (r2 >= r3) goto L_0x0025
                double r3 = r1.readDouble()     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                r9[r2] = r3     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                int r2 = r2 + 1
                goto L_0x0018
            L_0x0025:
                r1.close()     // Catch:{ IOException -> 0x0028 }
            L_0x0028:
                return r9
            L_0x0029:
                int r9 = r8.f14589b     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                double[] r9 = new double[r9]     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
            L_0x002d:
                int r3 = r8.f14589b     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                if (r2 >= r3) goto L_0x003b
                float r3 = r1.readFloat()     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                double r3 = (double) r3     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                r9[r2] = r3     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                int r2 = r2 + 1
                goto L_0x002d
            L_0x003b:
                r1.close()     // Catch:{ IOException -> 0x003e }
            L_0x003e:
                return r9
            L_0x003f:
                int r9 = r8.f14589b     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                w1.a$f[] r9 = new w1.a.f[r9]     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
            L_0x0043:
                int r3 = r8.f14589b     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                if (r2 >= r3) goto L_0x005b
                int r3 = r1.readInt()     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                long r3 = (long) r3     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                int r5 = r1.readInt()     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                long r5 = (long) r5     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                w1.a$f r7 = new w1.a$f     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                r7.<init>(r3, r5)     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                r9[r2] = r7     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                int r2 = r2 + 1
                goto L_0x0043
            L_0x005b:
                r1.close()     // Catch:{ IOException -> 0x005e }
            L_0x005e:
                return r9
            L_0x005f:
                int r9 = r8.f14589b     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                int[] r9 = new int[r9]     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
            L_0x0063:
                int r3 = r8.f14589b     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                if (r2 >= r3) goto L_0x0070
                int r3 = r1.readInt()     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                r9[r2] = r3     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                int r2 = r2 + 1
                goto L_0x0063
            L_0x0070:
                r1.close()     // Catch:{ IOException -> 0x0073 }
            L_0x0073:
                return r9
            L_0x0074:
                int r9 = r8.f14589b     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                int[] r9 = new int[r9]     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
            L_0x0078:
                int r3 = r8.f14589b     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                if (r2 >= r3) goto L_0x0085
                short r3 = r1.readShort()     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                r9[r2] = r3     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                int r2 = r2 + 1
                goto L_0x0078
            L_0x0085:
                r1.close()     // Catch:{ IOException -> 0x0088 }
            L_0x0088:
                return r9
            L_0x0089:
                int r9 = r8.f14589b     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                w1.a$f[] r9 = new w1.a.f[r9]     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
            L_0x008d:
                int r3 = r8.f14589b     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                if (r2 >= r3) goto L_0x00a3
                long r3 = r1.f()     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                long r5 = r1.f()     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                w1.a$f r7 = new w1.a$f     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                r7.<init>(r3, r5)     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                r9[r2] = r7     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                int r2 = r2 + 1
                goto L_0x008d
            L_0x00a3:
                r1.close()     // Catch:{ IOException -> 0x00a6 }
            L_0x00a6:
                return r9
            L_0x00a7:
                int r9 = r8.f14589b     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                long[] r9 = new long[r9]     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
            L_0x00ab:
                int r3 = r8.f14589b     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                if (r2 >= r3) goto L_0x00b8
                long r3 = r1.f()     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                r9[r2] = r3     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                int r2 = r2 + 1
                goto L_0x00ab
            L_0x00b8:
                r1.close()     // Catch:{ IOException -> 0x00bb }
            L_0x00bb:
                return r9
            L_0x00bc:
                int r9 = r8.f14589b     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                int[] r9 = new int[r9]     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
            L_0x00c0:
                int r3 = r8.f14589b     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                if (r2 >= r3) goto L_0x00cd
                int r3 = r1.readUnsignedShort()     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                r9[r2] = r3     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                int r2 = r2 + 1
                goto L_0x00c0
            L_0x00cd:
                r1.close()     // Catch:{ IOException -> 0x00d0 }
            L_0x00d0:
                return r9
            L_0x00d1:
                int r9 = r8.f14589b     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                byte[] r4 = w1.a.f14395d6     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                int r4 = r4.length     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                if (r9 < r4) goto L_0x00ee
                r9 = r2
            L_0x00d9:
                byte[] r4 = w1.a.f14395d6     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                int r5 = r4.length     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                if (r9 >= r5) goto L_0x00eb
                byte[] r5 = r8.f14590c     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                byte r5 = r5[r9]     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                byte r6 = r4[r9]     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                if (r5 == r6) goto L_0x00e8
                r3 = r2
                goto L_0x00eb
            L_0x00e8:
                int r9 = r9 + 1
                goto L_0x00d9
            L_0x00eb:
                if (r3 == 0) goto L_0x00ee
                int r2 = r4.length     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
            L_0x00ee:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                r9.<init>()     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
            L_0x00f3:
                int r3 = r8.f14589b     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                if (r2 >= r3) goto L_0x010f
                byte[] r3 = r8.f14590c     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                byte r3 = r3[r2]     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                if (r3 != 0) goto L_0x00fe
                goto L_0x010f
            L_0x00fe:
                r4 = 32
                if (r3 < r4) goto L_0x0107
                char r3 = (char) r3     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                r9.append(r3)     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                goto L_0x010c
            L_0x0107:
                r3 = 63
                r9.append(r3)     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
            L_0x010c:
                int r2 = r2 + 1
                goto L_0x00f3
            L_0x010f:
                java.lang.String r9 = r9.toString()     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                r1.close()     // Catch:{ IOException -> 0x0116 }
            L_0x0116:
                return r9
            L_0x0117:
                byte[] r9 = r8.f14590c     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                int r4 = r9.length     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                if (r4 != r3) goto L_0x0132
                byte r4 = r9[r2]     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                if (r4 < 0) goto L_0x0132
                if (r4 > r3) goto L_0x0132
                java.lang.String r9 = new java.lang.String     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                char[] r3 = new char[r3]     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                int r4 = r4 + 48
                char r4 = (char) r4     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                r3[r2] = r4     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                r9.<init>(r3)     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                r1.close()     // Catch:{ IOException -> 0x0131 }
            L_0x0131:
                return r9
            L_0x0132:
                java.lang.String r2 = new java.lang.String     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                java.nio.charset.Charset r3 = w1.a.G6     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                r2.<init>(r9, r3)     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                r1.close()     // Catch:{ IOException -> 0x013c }
            L_0x013c:
                return r2
            L_0x013d:
                r1.close()     // Catch:{ IOException -> 0x0140 }
            L_0x0140:
                return r0
            L_0x0141:
                r9 = move-exception
                r0 = r1
                goto L_0x0145
            L_0x0144:
                r9 = move-exception
            L_0x0145:
                if (r0 == 0) goto L_0x014a
                r0.close()     // Catch:{ IOException -> 0x014a }
            L_0x014a:
                throw r9
            L_0x014b:
                r1 = r0
            L_0x014c:
                if (r1 == 0) goto L_0x0151
                r1.close()     // Catch:{ IOException -> 0x0151 }
            L_0x0151:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: w1.a.c.r(java.nio.ByteOrder):java.lang.Object");
        }

        public int s() {
            return a.f14387c6[this.f14588a] * this.f14589b;
        }

        public String toString() {
            return "(" + a.f14379b6[this.f14588a] + ", data length:" + this.f14590c.length + ")";
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f14591a;

        /* renamed from: b  reason: collision with root package name */
        public final String f14592b;

        /* renamed from: c  reason: collision with root package name */
        public final int f14593c;

        /* renamed from: d  reason: collision with root package name */
        public final int f14594d;

        public d(String str, int i10, int i11) {
            this.f14592b = str;
            this.f14591a = i10;
            this.f14593c = i11;
            this.f14594d = -1;
        }

        public d(String str, int i10, int i11, int i12) {
            this.f14592b = str;
            this.f14591a = i10;
            this.f14593c = i11;
            this.f14594d = i12;
        }

        public boolean a(int i10) {
            int i11;
            int i12 = this.f14593c;
            if (i12 == 7 || i10 == 7 || i12 == i10 || (i11 = this.f14594d) == i10) {
                return true;
            }
            if ((i12 == 4 || i11 == 4) && i10 == 3) {
                return true;
            }
            if ((i12 == 9 || i11 == 9) && i10 == 8) {
                return true;
            }
            return (i12 == 12 || i11 == 12) && i10 == 11;
        }
    }

    @x0({x0.a.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public final long f14595a;

        /* renamed from: b  reason: collision with root package name */
        public final long f14596b;

        public f(double d10) {
            this((long) (d10 * 10000.0d), 10000);
        }

        public f(long j10, long j11) {
            if (j11 == 0) {
                this.f14595a = 0;
                this.f14596b = 1;
                return;
            }
            this.f14595a = j10;
            this.f14596b = j11;
        }

        public double a() {
            return ((double) this.f14595a) / ((double) this.f14596b);
        }

        public String toString() {
            return this.f14595a + "/" + this.f14596b;
        }
    }

    static {
        d[] dVarArr = {new d(f14447k2, 254, 4), new d(f14455l2, 255, 4), new d(f14515t, 256, 3, 4), new d(f14523u, 257, 3, 4), new d(f14531v, dg.a.Vh, 3), new d(f14539w, dg.a.f17850ai, 3), new d(f14547x, dg.a.f17955fi, 3), new d(R, 270, 2), new d(S, dg.a.Si, 2), new d(T, dg.a.Ti, 2), new d(G, 273, 3, 4), new d(f14555y, 274, 3), new d(f14563z, dg.a.Cj, 3), new d(H, dg.a.Dj, 3, 4), new d(I, dg.a.Ej, 3, 4), new d(D, dg.a.fk, 5), new d(E, dg.a.ik, 5), new d(A, dg.a.jk, 3), new d(F, dg.a.vl, 3), new d(L, 301, 3), new d(U, dg.a.rm, 2), new d(Q, dg.a.sm, 2), new d(V, 315, 2), new d(M, 318, 5), new d(N, dg.a.ln, 5), new d(f14487p2, dg.a.Qo, 4), new d(J, 513, 4), new d(K, 514, 4), new d(O, 529, 5), new d(B, 530, 3), new d(C, 531, 3), new d(P, 532, 5), new d(W, 33432, 2), new d(f14463m2, 34665, 4), new d(f14471n2, 34853, 4), new d(f14423h2, 4, 4), new d(f14407f2, 5, 4), new d(f14399e2, 6, 4), new d(f14415g2, 7, 4), new d(f14431i2, 23, 3), new d(f14439j2, 46, 7)};
        f14403e6 = dVarArr;
        d[] dVarArr2 = {new d(f14469n0, 33434, 5), new d(f14477o0, 33437, 5), new d(f14485p0, 34850, 3), new d(f14492q0, 34852, 2), new d(f14508s0, 34855, 3), new d(f14516t0, 34856, 7), new d(X, 36864, 2), new d(f14429i0, 36867, 2), new d(f14437j0, 36868, 2), new d(f14389d0, 37121, 7), new d(f14397e0, 37122, 5), new d(A0, 37377, 10), new d(B0, 37378, 5), new d(C0, 37379, 10), new d(D0, 37380, 10), new d(E0, 37381, 5), new d(F0, 37382, 5), new d(G0, 37383, 3), new d(H0, 37384, 3), new d(I0, 37385, 3), new d(K0, 37386, 5), new d(J0, 37396, 3), new d(f14405f0, 37500, 7), new d(f14413g0, 37510, 7), new d(f14445k0, 37520, 2), new d(f14453l0, 37521, 2), new d(f14461m0, 37522, 2), new d(Y, 40960, 7), new d(Z, 40961, 3), new d(f14373b0, 40962, 3, 4), new d(f14381c0, 40963, 3, 4), new d(f14421h0, 40964, 2), new d(f14479o2, 40965, 4), new d(L0, 41483, 5), new d(M0, 41484, 7), new d(N0, 41486, 5), new d(O0, 41487, 5), new d(P0, 41488, 3), new d(Q0, 41492, 3), new d(R0, 41493, 5), new d(S0, 41495, 3), new d(T0, 41728, 7), new d(U0, 41729, 7), new d(V0, 41730, 7), new d(W0, 41985, 3), new d(X0, 41986, 3), new d(Y0, 41987, 3), new d(Z0, 41988, 5), new d(f14366a1, 41989, 3), new d(f14374b1, 41990, 3), new d(f14382c1, 41991, 3), new d(f14390d1, 41992, 3), new d(f14398e1, 41993, 3), new d(f14406f1, 41994, 3), new d(f14414g1, 41995, 7), new d(f14422h1, 41996, 3), new d(f14430i1, 42016, 2), new d(Y1, 50706, 1), new d(Z1, 50720, 3, 4)};
        f14411f6 = dVarArr2;
        d[] dVarArr3 = {new d(f14486p1, 0, 1), new d(f14493q1, 1, 2), new d(f14501r1, 2, 5), new d(f14509s1, 3, 2), new d(f14517t1, 4, 5), new d(f14525u1, 5, 1), new d(f14533v1, 6, 5), new d(f14541w1, 7, 5), new d(f14549x1, 8, 2), new d(f14557y1, 9, 2), new d(f14565z1, 10, 2), new d(A1, 11, 5), new d(B1, 12, 2), new d(C1, 13, 5), new d(D1, 14, 2), new d(E1, 15, 5), new d(F1, 16, 2), new d(G1, 17, 5), new d(H1, 18, 2), new d(I1, 19, 2), new d(J1, 20, 5), new d(K1, 21, 2), new d(L1, 22, 5), new d(M1, 23, 2), new d(N1, 24, 5), new d(O1, 25, 2), new d(P1, 26, 5), new d(Q1, 27, 7), new d(R1, 28, 7), new d(S1, 29, 2), new d(T1, 30, 3)};
        f14419g6 = dVarArr3;
        d[] dVarArr4 = {new d(V1, 1, 2)};
        f14427h6 = dVarArr4;
        d[] dVarArr5 = {new d(f14447k2, 254, 4), new d(f14455l2, 255, 4), new d(X1, 256, 3, 4), new d(W1, 257, 3, 4), new d(f14531v, dg.a.Vh, 3), new d(f14539w, dg.a.f17850ai, 3), new d(f14547x, dg.a.f17955fi, 3), new d(R, 270, 2), new d(S, dg.a.Si, 2), new d(T, dg.a.Ti, 2), new d(G, 273, 3, 4), new d(f14555y, 274, 3), new d(f14563z, dg.a.Cj, 3), new d(H, dg.a.Dj, 3, 4), new d(I, dg.a.Ej, 3, 4), new d(D, dg.a.fk, 5), new d(E, dg.a.ik, 5), new d(A, dg.a.jk, 3), new d(F, dg.a.vl, 3), new d(L, 301, 3), new d(U, dg.a.rm, 2), new d(Q, dg.a.sm, 2), new d(V, 315, 2), new d(M, 318, 5), new d(N, dg.a.ln, 5), new d(f14487p2, dg.a.Qo, 4), new d(J, 513, 4), new d(K, 514, 4), new d(O, 529, 5), new d(B, 530, 3), new d(C, 531, 3), new d(P, 532, 5), new d(W, 33432, 2), new d(f14463m2, 34665, 4), new d(f14471n2, 34853, 4), new d(Y1, 50706, 1), new d(Z1, 50720, 3, 4)};
        f14435i6 = dVarArr5;
        d[] dVarArr6 = {new d(f14367a2, 256, 7), new d(f14494q2, 8224, 4), new d(f14502r2, 8256, 4)};
        f14451k6 = dVarArr6;
        d[] dVarArr7 = {new d(f14375b2, 257, 4), new d(f14383c2, dg.a.Vh, 4)};
        f14459l6 = dVarArr7;
        d[] dVarArr8 = {new d(f14391d2, 4371, 3)};
        f14467m6 = dVarArr8;
        d[] dVarArr9 = {new d(Z, 55, 3)};
        f14475n6 = dVarArr9;
        d[][] dVarArr10 = {dVarArr, dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr, dVarArr6, dVarArr7, dVarArr8, dVarArr9};
        f14562y6 = dVarArr10;
        C6 = new HashMap[dVarArr10.length];
        D6 = new HashMap[dVarArr10.length];
        Charset forName = Charset.forName(b6.c.f4237k);
        G6 = forName;
        H6 = o.f7962h.getBytes(forName);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        J5 = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i10 = 0;
        while (true) {
            d[][] dVarArr11 = f14562y6;
            if (i10 < dVarArr11.length) {
                C6[i10] = new HashMap<>();
                D6[i10] = new HashMap<>();
                for (d dVar : dVarArr11[i10]) {
                    C6[i10].put(Integer.valueOf(dVar.f14591a), dVar);
                    D6[i10].put(dVar.f14592b, dVar);
                }
                i10++;
            } else {
                HashMap<Integer, Integer> hashMap = F6;
                d[] dVarArr12 = f14570z6;
                hashMap.put(Integer.valueOf(dVarArr12[0].f14591a), 5);
                hashMap.put(Integer.valueOf(dVarArr12[1].f14591a), 1);
                hashMap.put(Integer.valueOf(dVarArr12[2].f14591a), 2);
                hashMap.put(Integer.valueOf(dVarArr12[3].f14591a), 3);
                hashMap.put(Integer.valueOf(dVarArr12[4].f14591a), 7);
                hashMap.put(Integer.valueOf(dVarArr12[5].f14591a), 8);
                return;
            }
        }
    }

    public a(@m0 InputStream inputStream) throws IOException {
        d[][] dVarArr = f14562y6;
        this.f14574d = new HashMap[dVarArr.length];
        this.f14575e = new HashSet(dVarArr.length);
        if (inputStream != null) {
            AssetManager.AssetInputStream assetInputStream = null;
            this.f14571a = null;
            this.f14572b = inputStream instanceof AssetManager.AssetInputStream ? (AssetManager.AssetInputStream) inputStream : assetInputStream;
            O(inputStream);
            return;
        }
        throw new IllegalArgumentException("inputStream cannot be null");
    }

    public a(@m0 String str) throws IOException {
        d[][] dVarArr = f14562y6;
        this.f14574d = new HashMap[dVarArr.length];
        this.f14575e = new HashSet(dVarArr.length);
        if (str != null) {
            FileInputStream fileInputStream = null;
            this.f14572b = null;
            this.f14571a = str;
            try {
                FileInputStream fileInputStream2 = new FileInputStream(str);
                try {
                    O(fileInputStream2);
                    b(fileInputStream2);
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    b(fileInputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                b(fileInputStream);
                throw th;
            }
        } else {
            throw new IllegalArgumentException("filename cannot be null");
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:68|69|70) */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        java.lang.Double.parseDouble(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x015c, code lost:
        return new android.util.Pair<>(12, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0162, code lost:
        return new android.util.Pair<>(2, -1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:68:0x014e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> C(java.lang.String r12) {
        /*
            java.lang.String r0 = ","
            boolean r1 = r12.contains(r0)
            r2 = 0
            r3 = 1
            r4 = 2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r6 = -1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            if (r1 == 0) goto L_0x00a6
            java.lang.String[] r12 = r12.split(r0, r6)
            r0 = r12[r2]
            android.util.Pair r0 = C(r0)
            java.lang.Object r1 = r0.first
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 != r4) goto L_0x0029
            return r0
        L_0x0029:
            int r1 = r12.length
            if (r3 >= r1) goto L_0x00a5
            r1 = r12[r3]
            android.util.Pair r1 = C(r1)
            java.lang.Object r2 = r1.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r4 = r0.first
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x004d
            java.lang.Object r2 = r1.second
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r4 = r0.first
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x004b
            goto L_0x004d
        L_0x004b:
            r2 = r6
            goto L_0x0055
        L_0x004d:
            java.lang.Object r2 = r0.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
        L_0x0055:
            java.lang.Object r4 = r0.second
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r4 == r6) goto L_0x0080
            java.lang.Object r4 = r1.first
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r8 = r0.second
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L_0x0077
            java.lang.Object r1 = r1.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r4 = r0.second
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0080
        L_0x0077:
            java.lang.Object r1 = r0.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            goto L_0x0081
        L_0x0080:
            r1 = r6
        L_0x0081:
            if (r2 != r6) goto L_0x008b
            if (r1 != r6) goto L_0x008b
            android.util.Pair r12 = new android.util.Pair
            r12.<init>(r5, r7)
            return r12
        L_0x008b:
            if (r2 != r6) goto L_0x0097
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.<init>(r1, r7)
            goto L_0x00a2
        L_0x0097:
            if (r1 != r6) goto L_0x00a2
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.<init>(r1, r7)
        L_0x00a2:
            int r3 = r3 + 1
            goto L_0x0029
        L_0x00a5:
            return r0
        L_0x00a6:
            java.lang.String r0 = "/"
            boolean r1 = r12.contains(r0)
            r8 = 0
            if (r1 == 0) goto L_0x0105
            java.lang.String[] r12 = r12.split(r0, r6)
            int r0 = r12.length
            if (r0 != r4) goto L_0x00ff
            r0 = r12[r2]     // Catch:{ NumberFormatException -> 0x00ff }
            double r0 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x00ff }
            long r0 = (long) r0     // Catch:{ NumberFormatException -> 0x00ff }
            r12 = r12[r3]     // Catch:{ NumberFormatException -> 0x00ff }
            double r2 = java.lang.Double.parseDouble(r12)     // Catch:{ NumberFormatException -> 0x00ff }
            long r2 = (long) r2     // Catch:{ NumberFormatException -> 0x00ff }
            int r12 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            r4 = 10
            if (r12 < 0) goto L_0x00f5
            int r12 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r12 >= 0) goto L_0x00d0
            goto L_0x00f5
        L_0x00d0:
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r12 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            r0 = 5
            if (r12 > 0) goto L_0x00eb
            int r12 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r12 <= 0) goto L_0x00dd
            goto L_0x00eb
        L_0x00dd:
            android.util.Pair r12 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x00ff }
            r12.<init>(r1, r0)     // Catch:{ NumberFormatException -> 0x00ff }
            return r12
        L_0x00eb:
            android.util.Pair r12 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x00ff }
            r12.<init>(r0, r7)     // Catch:{ NumberFormatException -> 0x00ff }
            return r12
        L_0x00f5:
            android.util.Pair r12 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x00ff }
            r12.<init>(r0, r7)     // Catch:{ NumberFormatException -> 0x00ff }
            return r12
        L_0x00ff:
            android.util.Pair r12 = new android.util.Pair
            r12.<init>(r5, r7)
            return r12
        L_0x0105:
            long r0 = java.lang.Long.parseLong(r12)     // Catch:{ NumberFormatException -> 0x014e }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ NumberFormatException -> 0x014e }
            long r1 = r0.longValue()     // Catch:{ NumberFormatException -> 0x014e }
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            r2 = 4
            if (r1 < 0) goto L_0x0130
            long r3 = r0.longValue()     // Catch:{ NumberFormatException -> 0x014e }
            r10 = 65535(0xffff, double:3.23786E-319)
            int r1 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r1 > 0) goto L_0x0130
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x014e }
            r1 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x014e }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ NumberFormatException -> 0x014e }
            r0.<init>(r1, r2)     // Catch:{ NumberFormatException -> 0x014e }
            return r0
        L_0x0130:
            long r0 = r0.longValue()     // Catch:{ NumberFormatException -> 0x014e }
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x0144
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x014e }
            r1 = 9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x014e }
            r0.<init>(r1, r7)     // Catch:{ NumberFormatException -> 0x014e }
            return r0
        L_0x0144:
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x014e }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch:{ NumberFormatException -> 0x014e }
            r0.<init>(r1, r7)     // Catch:{ NumberFormatException -> 0x014e }
            return r0
        L_0x014e:
            java.lang.Double.parseDouble(r12)     // Catch:{ NumberFormatException -> 0x015d }
            android.util.Pair r12 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x015d }
            r0 = 12
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x015d }
            r12.<init>(r0, r7)     // Catch:{ NumberFormatException -> 0x015d }
            return r12
        L_0x015d:
            android.util.Pair r12 = new android.util.Pair
            r12.<init>(r5, r7)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.a.C(java.lang.String):android.util.Pair");
    }

    public static boolean H(byte[] bArr) throws IOException {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = f14537v5;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }

    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    public static double d(String str, String str2) {
        try {
            String[] split = str.split(",", -1);
            String[] split2 = split[0].split("/", -1);
            String[] split3 = split[1].split("/", -1);
            String[] split4 = split[2].split("/", -1);
            double parseDouble = (Double.parseDouble(split2[0].trim()) / Double.parseDouble(split2[1].trim())) + ((Double.parseDouble(split3[0].trim()) / Double.parseDouble(split3[1].trim())) / 60.0d) + ((Double.parseDouble(split4[0].trim()) / Double.parseDouble(split4[1].trim())) / 3600.0d);
            if (!str2.equals(L4)) {
                if (!str2.equals(N4)) {
                    if (!str2.equals("N")) {
                        if (!str2.equals(M4)) {
                            throw new IllegalArgumentException();
                        }
                    }
                    return parseDouble;
                }
            }
            return -parseDouble;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            throw new IllegalArgumentException();
        }
    }

    public static long[] e(Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                jArr[i10] = (long) iArr[i10];
            }
            return jArr;
        } else if (obj instanceof long[]) {
            return (long[]) obj;
        } else {
            return null;
        }
    }

    public static int f(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        int i10 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return i10;
            }
            i10 += read;
            outputStream.write(bArr, 0, read);
        }
    }

    @o0
    public byte[] A() {
        InputStream inputStream;
        Throwable th2;
        if (!this.f14577g) {
            return null;
        }
        byte[] bArr = this.f14580j;
        if (bArr != null) {
            return bArr;
        }
        try {
            inputStream = this.f14572b;
            if (inputStream != null) {
                try {
                    if (inputStream.markSupported()) {
                        inputStream.reset();
                    } else {
                        b(inputStream);
                        return null;
                    }
                } catch (IOException unused) {
                    b(inputStream);
                    return null;
                } catch (Throwable th3) {
                    th2 = th3;
                    b(inputStream);
                    throw th2;
                }
            } else {
                inputStream = this.f14571a != null ? new FileInputStream(this.f14571a) : null;
            }
            if (inputStream != null) {
                if (inputStream.skip((long) this.f14578h) == ((long) this.f14578h)) {
                    byte[] bArr2 = new byte[this.f14579i];
                    if (inputStream.read(bArr2) == this.f14579i) {
                        this.f14580j = bArr2;
                        b(inputStream);
                        return bArr2;
                    }
                    throw new IOException("Corrupted image");
                }
                throw new IOException("Corrupted image");
            }
            throw new FileNotFoundException();
        } catch (IOException unused2) {
            inputStream = null;
            b(inputStream);
            return null;
        } catch (Throwable th4) {
            th2 = th4;
            inputStream = null;
            b(inputStream);
            throw th2;
        }
    }

    @o0
    public long[] B() {
        if (!this.f14577g) {
            return null;
        }
        return new long[]{(long) this.f14578h, (long) this.f14579i};
    }

    public final void D(C0234a aVar, HashMap hashMap) throws IOException {
        int i10;
        c cVar = (c) hashMap.get(J);
        c cVar2 = (c) hashMap.get(K);
        if (cVar != null && cVar2 != null) {
            int p10 = cVar.p(this.f14576f);
            int min = Math.min(cVar2.p(this.f14576f), aVar.available() - p10);
            int i11 = this.f14573c;
            if (i11 == 4 || i11 == 9 || i11 == 10) {
                i10 = this.f14582l;
            } else {
                if (i11 == 7) {
                    i10 = this.f14583m;
                }
                if (p10 > 0 && min > 0) {
                    this.f14577g = true;
                    this.f14578h = p10;
                    this.f14579i = min;
                    if (this.f14571a == null && this.f14572b == null) {
                        byte[] bArr = new byte[min];
                        aVar.g((long) p10);
                        aVar.readFully(bArr);
                        this.f14580j = bArr;
                        return;
                    }
                    return;
                }
            }
            p10 += i10;
            if (p10 > 0) {
            }
        }
    }

    public final void E(C0234a aVar, HashMap hashMap) throws IOException {
        c cVar = (c) hashMap.get(G);
        c cVar2 = (c) hashMap.get(I);
        if (cVar != null && cVar2 != null) {
            long[] e10 = e(cVar.r(this.f14576f));
            long[] e11 = e(cVar2.r(this.f14576f));
            if (e10 != null && e11 != null) {
                long j10 = 0;
                for (long j11 : e11) {
                    j10 += j11;
                }
                int i10 = (int) j10;
                byte[] bArr = new byte[i10];
                int i11 = 0;
                int i12 = 0;
                for (int i13 = 0; i13 < e10.length; i13++) {
                    int i14 = (int) e11[i13];
                    int i15 = ((int) e10[i13]) - i11;
                    aVar.g((long) i15);
                    int i16 = i11 + i15;
                    byte[] bArr2 = new byte[i14];
                    aVar.read(bArr2);
                    i11 = i16 + i14;
                    System.arraycopy(bArr2, 0, bArr, i12, i14);
                    i12 += i14;
                }
                this.f14577g = true;
                this.f14580j = bArr;
                this.f14579i = i10;
            }
        }
    }

    public boolean F() {
        return this.f14577g;
    }

    public boolean G() {
        int l10 = l(f14555y, 1);
        return l10 == 2 || l10 == 7 || l10 == 4 || l10 == 5;
    }

    public final boolean I(byte[] bArr) throws IOException {
        C0234a aVar = new C0234a(bArr);
        ByteOrder R7 = R(aVar);
        this.f14576f = R7;
        aVar.h(R7);
        short readShort = aVar.readShort();
        aVar.close();
        return readShort == 20306 || readShort == 21330;
    }

    public final boolean J(byte[] bArr) throws IOException {
        byte[] bytes = f14545w5.getBytes(Charset.defaultCharset());
        for (int i10 = 0; i10 < bytes.length; i10++) {
            if (bArr[i10] != bytes[i10]) {
                return false;
            }
        }
        return true;
    }

    public final boolean K(byte[] bArr) throws IOException {
        C0234a aVar = new C0234a(bArr);
        ByteOrder R7 = R(aVar);
        this.f14576f = R7;
        aVar.h(R7);
        short readShort = aVar.readShort();
        aVar.close();
        return readShort == 85;
    }

    public final boolean L(HashMap hashMap) throws IOException {
        c cVar;
        c cVar2 = (c) hashMap.get(f14531v);
        if (cVar2 == null) {
            return false;
        }
        int[] iArr = (int[]) cVar2.r(this.f14576f);
        int[] iArr2 = f14458l5;
        if (Arrays.equals(iArr2, iArr)) {
            return true;
        }
        if (this.f14573c != 3 || (cVar = (c) hashMap.get(f14547x)) == null) {
            return false;
        }
        int p10 = cVar.p(this.f14576f);
        return (p10 == 1 && Arrays.equals(iArr, f14474n5)) || (p10 == 6 && Arrays.equals(iArr, iArr2));
    }

    public final boolean M(HashMap hashMap) throws IOException {
        c cVar = (c) hashMap.get(f14523u);
        c cVar2 = (c) hashMap.get(f14515t);
        if (cVar == null || cVar2 == null) {
            return false;
        }
        return cVar.p(this.f14576f) <= 512 && cVar2.p(this.f14576f) <= 512;
    }

    public boolean N() {
        int i10 = this.f14581k;
        return i10 == 6 || i10 == 7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0045, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r4.f14587q = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004d, code lost:
        a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0050, code lost:
        throw r5;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0047 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void O(@d.m0 java.io.InputStream r5) throws java.io.IOException {
        /*
            r4 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            w1.a$d[][] r2 = f14562y6     // Catch:{ IOException -> 0x0047 }
            int r2 = r2.length     // Catch:{ IOException -> 0x0047 }
            if (r1 >= r2) goto L_0x0013
            java.util.HashMap<java.lang.String, w1.a$c>[] r2 = r4.f14574d     // Catch:{ IOException -> 0x0047 }
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ IOException -> 0x0047 }
            r3.<init>()     // Catch:{ IOException -> 0x0047 }
            r2[r1] = r3     // Catch:{ IOException -> 0x0047 }
            int r1 = r1 + 1
            goto L_0x0002
        L_0x0013:
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0047 }
            r2 = 5000(0x1388, float:7.006E-42)
            r1.<init>(r5, r2)     // Catch:{ IOException -> 0x0047 }
            int r5 = r4.s(r1)     // Catch:{ IOException -> 0x0047 }
            r4.f14573c = r5     // Catch:{ IOException -> 0x0047 }
            w1.a$a r5 = new w1.a$a     // Catch:{ IOException -> 0x0047 }
            r5.<init>((java.io.InputStream) r1)     // Catch:{ IOException -> 0x0047 }
            int r1 = r4.f14573c     // Catch:{ IOException -> 0x0047 }
            switch(r1) {
                case 0: goto L_0x003b;
                case 1: goto L_0x003b;
                case 2: goto L_0x003b;
                case 3: goto L_0x003b;
                case 4: goto L_0x0037;
                case 5: goto L_0x003b;
                case 6: goto L_0x003b;
                case 7: goto L_0x0033;
                case 8: goto L_0x003b;
                case 9: goto L_0x002f;
                case 10: goto L_0x002b;
                case 11: goto L_0x003b;
                default: goto L_0x002a;
            }     // Catch:{ IOException -> 0x0047 }
        L_0x002a:
            goto L_0x003e
        L_0x002b:
            r4.x(r5)     // Catch:{ IOException -> 0x0047 }
            goto L_0x003e
        L_0x002f:
            r4.u(r5)     // Catch:{ IOException -> 0x0047 }
            goto L_0x003e
        L_0x0033:
            r4.t(r5)     // Catch:{ IOException -> 0x0047 }
            goto L_0x003e
        L_0x0037:
            r4.p(r5, r0, r0)     // Catch:{ IOException -> 0x0047 }
            goto L_0x003e
        L_0x003b:
            r4.v(r5)     // Catch:{ IOException -> 0x0047 }
        L_0x003e:
            r4.f0(r5)     // Catch:{ IOException -> 0x0047 }
            r5 = 1
            r4.f14587q = r5     // Catch:{ IOException -> 0x0047 }
            goto L_0x0049
        L_0x0045:
            r5 = move-exception
            goto L_0x004d
        L_0x0047:
            r4.f14587q = r0     // Catch:{ all -> 0x0045 }
        L_0x0049:
            r4.a()
            return
        L_0x004d:
            r4.a()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.a.O(java.io.InputStream):void");
    }

    public final void P(C0234a aVar, int i10) throws IOException {
        ByteOrder R7 = R(aVar);
        this.f14576f = R7;
        aVar.h(R7);
        int readUnsignedShort = aVar.readUnsignedShort();
        int i11 = this.f14573c;
        if (i11 == 7 || i11 == 10 || readUnsignedShort == 42) {
            int readInt = aVar.readInt();
            if (readInt < 8 || readInt >= i10) {
                throw new IOException("Invalid first Ifd offset: " + readInt);
            }
            int i12 = readInt - 8;
            if (i12 > 0 && aVar.skipBytes(i12) != i12) {
                throw new IOException("Couldn't jump to first Ifd: " + i12);
            }
            return;
        }
        throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
    }

    public final void Q() {
        for (int i10 = 0; i10 < this.f14574d.length; i10++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("The size of tag group[");
            sb2.append(i10);
            sb2.append("]: ");
            sb2.append(this.f14574d[i10].size());
            for (Map.Entry next : this.f14574d[i10].entrySet()) {
                c cVar = (c) next.getValue();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("tagName: ");
                sb3.append((String) next.getKey());
                sb3.append(", tagType: ");
                sb3.append(cVar.toString());
                sb3.append(", tagValue: '");
                sb3.append(cVar.q(this.f14576f));
                sb3.append("'");
            }
        }
    }

    public final ByteOrder R(C0234a aVar) throws IOException {
        short readShort = aVar.readShort();
        if (readShort == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
    }

    public final void S(byte[] bArr, int i10) throws IOException {
        C0234a aVar = new C0234a(bArr);
        P(aVar, bArr.length);
        T(aVar, i10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0209  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void T(w1.a.C0234a r22, int r23) throws java.io.IOException {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            java.util.Set<java.lang.Integer> r3 = r0.f14575e
            int r4 = r1.R
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            int r3 = r1.R
            int r3 = r3 + 2
            int r4 = r1.Q
            if (r3 <= r4) goto L_0x001a
            return
        L_0x001a:
            short r3 = r22.readShort()
            int r4 = r1.R
            int r5 = r3 * 12
            int r4 = r4 + r5
            int r5 = r1.Q
            if (r4 > r5) goto L_0x02ce
            if (r3 > 0) goto L_0x002b
            goto L_0x02ce
        L_0x002b:
            r5 = 0
        L_0x002c:
            r6 = 0
            if (r5 >= r3) goto L_0x0276
            int r9 = r22.readUnsignedShort()
            int r10 = r22.readUnsignedShort()
            int r11 = r22.readInt()
            int r12 = r22.c()
            long r12 = (long) r12
            r14 = 4
            long r12 = r12 + r14
            java.util.HashMap<java.lang.Integer, w1.a$d>[] r16 = C6
            r4 = r16[r2]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
            java.lang.Object r4 = r4.get(r8)
            w1.a$d r4 = (w1.a.d) r4
            r8 = 7
            if (r4 != 0) goto L_0x0065
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "Skip the tag entry since tag number is not defined: "
            r14.append(r15)
            r14.append(r9)
        L_0x0062:
            r18 = r9
            goto L_0x00c6
        L_0x0065:
            if (r10 <= 0) goto L_0x00b7
            int[] r14 = f14387c6
            int r15 = r14.length
            if (r10 < r15) goto L_0x006d
            goto L_0x00b7
        L_0x006d:
            boolean r15 = r4.a(r10)
            if (r15 != 0) goto L_0x008f
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "Skip the tag entry since data format ("
            r14.append(r15)
            java.lang.String[] r15 = f14379b6
            r15 = r15[r10]
            r14.append(r15)
            java.lang.String r15 = ") is unexpected for tag: "
            r14.append(r15)
            java.lang.String r15 = r4.f14592b
            r14.append(r15)
            goto L_0x0062
        L_0x008f:
            if (r10 != r8) goto L_0x0093
            int r10 = r4.f14593c
        L_0x0093:
            r15 = r9
            long r8 = (long) r11
            r14 = r14[r10]
            r18 = r15
            long r14 = (long) r14
            long r8 = r8 * r14
            int r14 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r14 < 0) goto L_0x00a9
            r14 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r14 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r14 <= 0) goto L_0x00a7
            goto L_0x00a9
        L_0x00a7:
            r14 = 1
            goto L_0x00c8
        L_0x00a9:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "Skip the tag entry since the number of components is invalid: "
            r14.append(r15)
            r14.append(r11)
            goto L_0x00c7
        L_0x00b7:
            r18 = r9
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Skip the tag entry since data format is invalid: "
            r8.append(r9)
            r8.append(r10)
        L_0x00c6:
            r8 = r6
        L_0x00c7:
            r14 = 0
        L_0x00c8:
            if (r14 != 0) goto L_0x00d3
            r1.g(r12)
            r17 = r3
            r20 = r5
            goto L_0x026d
        L_0x00d3:
            r14 = 4
            int r14 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            java.lang.String r15 = "Compression"
            if (r14 <= 0) goto L_0x0178
            int r14 = r22.readInt()
            int r6 = r0.f14573c
            r7 = 7
            if (r6 != r7) goto L_0x0141
            java.lang.String r6 = r4.f14592b
            java.lang.String r7 = "MakerNote"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x00f1
            r0.f14583m = r14
            goto L_0x013b
        L_0x00f1:
            r6 = 6
            if (r2 != r6) goto L_0x013b
            java.lang.String r7 = r4.f14592b
            java.lang.String r6 = "ThumbnailImage"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x013b
            r0.f14584n = r14
            r0.f14585o = r11
            java.nio.ByteOrder r6 = r0.f14576f
            r7 = 6
            w1.a$c r6 = w1.a.c.m(r7, r6)
            int r7 = r0.f14584n
            r17 = r3
            long r2 = (long) r7
            java.nio.ByteOrder r7 = r0.f14576f
            w1.a$c r2 = w1.a.c.i(r2, r7)
            int r3 = r0.f14585o
            r19 = r10
            r7 = r11
            long r10 = (long) r3
            java.nio.ByteOrder r3 = r0.f14576f
            w1.a$c r3 = w1.a.c.i(r10, r3)
            java.util.HashMap<java.lang.String, w1.a$c>[] r10 = r0.f14574d
            r11 = 4
            r10 = r10[r11]
            r10.put(r15, r6)
            java.util.HashMap<java.lang.String, w1.a$c>[] r6 = r0.f14574d
            r6 = r6[r11]
            java.lang.String r10 = "JPEGInterchangeFormat"
            r6.put(r10, r2)
            java.util.HashMap<java.lang.String, w1.a$c>[] r2 = r0.f14574d
            r2 = r2[r11]
            java.lang.String r6 = "JPEGInterchangeFormatLength"
            r2.put(r6, r3)
            goto L_0x0156
        L_0x013b:
            r17 = r3
            r19 = r10
            r7 = r11
            goto L_0x0156
        L_0x0141:
            r17 = r3
            r19 = r10
            r7 = r11
            r2 = 10
            if (r6 != r2) goto L_0x0156
            java.lang.String r2 = r4.f14592b
            java.lang.String r3 = "JpgFromRaw"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0156
            r0.f14586p = r14
        L_0x0156:
            long r2 = (long) r14
            long r10 = r2 + r8
            int r6 = r1.Q
            r20 = r5
            long r5 = (long) r6
            int r5 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r5 > 0) goto L_0x0166
            r1.g(r2)
            goto L_0x017f
        L_0x0166:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Skip the tag entry since data offset is invalid: "
            r2.append(r3)
            r2.append(r14)
        L_0x0173:
            r1.g(r12)
            goto L_0x026d
        L_0x0178:
            r17 = r3
            r20 = r5
            r19 = r10
            r7 = r11
        L_0x017f:
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r2 = F6
            java.lang.Integer r3 = java.lang.Integer.valueOf(r18)
            java.lang.Object r2 = r2.get(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            r3 = 8
            r5 = 3
            if (r2 == 0) goto L_0x0209
            r6 = -1
            r10 = r19
            if (r10 == r5) goto L_0x01b5
            r4 = 4
            if (r10 == r4) goto L_0x01b0
            if (r10 == r3) goto L_0x01ab
            r3 = 9
            if (r10 == r3) goto L_0x01a6
            r3 = 13
            if (r10 == r3) goto L_0x01a6
        L_0x01a3:
            r3 = 0
            goto L_0x01bb
        L_0x01a6:
            int r3 = r22.readInt()
            goto L_0x01b9
        L_0x01ab:
            short r3 = r22.readShort()
            goto L_0x01b9
        L_0x01b0:
            long r6 = r22.f()
            goto L_0x01a3
        L_0x01b5:
            int r3 = r22.readUnsignedShort()
        L_0x01b9:
            long r6 = (long) r3
            goto L_0x01a3
        L_0x01bb:
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x01fa
            int r3 = r1.Q
            long r3 = (long) r3
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x01fa
            java.util.Set<java.lang.Integer> r3 = r0.f14575e
            int r4 = (int) r6
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r3 = r3.contains(r4)
            if (r3 != 0) goto L_0x01de
            r1.g(r6)
            int r2 = r2.intValue()
            r0.T(r1, r2)
            goto L_0x0173
        L_0x01de:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Skip jump into the IFD since it has already been read: IfdType "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = " (at "
            r3.append(r2)
            r3.append(r6)
            java.lang.String r2 = ")"
            r3.append(r2)
            goto L_0x0173
        L_0x01fa:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Skip jump into the IFD since its offset is invalid: "
            r2.append(r3)
            r2.append(r6)
            goto L_0x0173
        L_0x0209:
            r10 = r19
            int r2 = (int) r8
            byte[] r2 = new byte[r2]
            r1.readFully(r2)
            w1.a$c r6 = new w1.a$c
            r6.<init>(r10, r7, r2)
            java.util.HashMap<java.lang.String, w1.a$c>[] r2 = r0.f14574d
            r2 = r2[r23]
            java.lang.String r7 = r4.f14592b
            r2.put(r7, r6)
            java.lang.String r2 = r4.f14592b
            java.lang.String r7 = "DNGVersion"
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x022b
            r0.f14573c = r5
        L_0x022b:
            java.lang.String r2 = r4.f14592b
            java.lang.String r5 = "Make"
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L_0x023f
            java.lang.String r2 = r4.f14592b
            java.lang.String r5 = "Model"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x024d
        L_0x023f:
            java.nio.ByteOrder r2 = r0.f14576f
            java.lang.String r2 = r6.q(r2)
            java.lang.String r5 = "PENTAX"
            boolean r2 = r2.contains(r5)
            if (r2 != 0) goto L_0x0260
        L_0x024d:
            java.lang.String r2 = r4.f14592b
            boolean r2 = r15.equals(r2)
            if (r2 == 0) goto L_0x0262
            java.nio.ByteOrder r2 = r0.f14576f
            int r2 = r6.p(r2)
            r4 = 65535(0xffff, float:9.1834E-41)
            if (r2 != r4) goto L_0x0262
        L_0x0260:
            r0.f14573c = r3
        L_0x0262:
            int r2 = r22.c()
            long r2 = (long) r2
            int r2 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r2 == 0) goto L_0x026d
            goto L_0x0173
        L_0x026d:
            int r5 = r20 + 1
            short r5 = (short) r5
            r2 = r23
            r3 = r17
            goto L_0x002c
        L_0x0276:
            int r2 = r22.c()
            r3 = 4
            int r2 = r2 + r3
            int r3 = r1.Q
            if (r2 > r3) goto L_0x02ce
            int r2 = r22.readInt()
            long r3 = (long) r2
            r5 = 0
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x02c1
            int r5 = r1.Q
            if (r2 >= r5) goto L_0x02c1
            java.util.Set<java.lang.Integer> r5 = r0.f14575e
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            boolean r5 = r5.contains(r6)
            if (r5 != 0) goto L_0x02b9
            r1.g(r3)
            java.util.HashMap<java.lang.String, w1.a$c>[] r2 = r0.f14574d
            r3 = 4
            r2 = r2[r3]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x02ad
        L_0x02a9:
            r0.T(r1, r3)
            goto L_0x02ce
        L_0x02ad:
            java.util.HashMap<java.lang.String, w1.a$c>[] r2 = r0.f14574d
            r3 = 5
            r2 = r2[r3]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x02ce
            goto L_0x02a9
        L_0x02b9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since re-reading an IFD may cause an infinite loop: "
            goto L_0x02c8
        L_0x02c1:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since a wrong offset may cause an infinite loop: "
        L_0x02c8:
            r1.append(r3)
            r1.append(r2)
        L_0x02ce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.a.T(w1.a$a, int):void");
    }

    public final void U(String str) {
        for (int i10 = 0; i10 < f14562y6.length; i10++) {
            this.f14574d[i10].remove(str);
        }
    }

    public void V() {
        b0(f14555y, Integer.toString(1));
    }

    public final void W(C0234a aVar, int i10) throws IOException {
        c cVar;
        c cVar2 = this.f14574d[i10].get(f14523u);
        c cVar3 = this.f14574d[i10].get(f14515t);
        if ((cVar2 == null || cVar3 == null) && (cVar = this.f14574d[i10].get(J)) != null) {
            p(aVar, cVar.p(this.f14576f), i10);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004c, code lost:
        if (r0 < 0) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0025, code lost:
        if (r0 < 0) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void X(int r7) {
        /*
            r6 = this;
            int r0 = r7 % 90
            if (r0 != 0) goto L_0x0057
            r0 = 1
            java.lang.String r1 = "Orientation"
            int r0 = r6.l(r1, r0)
            java.util.List<java.lang.Integer> r2 = G2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            boolean r3 = r2.contains(r3)
            r4 = 0
            r5 = 4
            if (r3 == 0) goto L_0x0034
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r0 = r2.indexOf(r0)
            int r7 = r7 / 90
            int r0 = r0 + r7
            int r0 = r0 % r5
            if (r0 >= 0) goto L_0x0028
        L_0x0027:
            r4 = r5
        L_0x0028:
            int r0 = r0 + r4
            java.lang.Object r7 = r2.get(r0)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r4 = r7.intValue()
            goto L_0x004f
        L_0x0034:
            java.util.List<java.lang.Integer> r2 = H2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            boolean r3 = r2.contains(r3)
            if (r3 == 0) goto L_0x004f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r0 = r2.indexOf(r0)
            int r7 = r7 / 90
            int r0 = r0 + r7
            int r0 = r0 % r5
            if (r0 >= 0) goto L_0x0028
            goto L_0x0027
        L_0x004f:
            java.lang.String r7 = java.lang.Integer.toString(r4)
            r6.b0(r1, r7)
            return
        L_0x0057:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "degree should be a multiple of 90"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.a.X(int):void");
    }

    public void Y() throws IOException {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        Throwable th2;
        if (!this.f14587q || this.f14573c != 4) {
            throw new IOException("ExifInterface only supports saving attributes on JPEG formats.");
        } else if (this.f14571a != null) {
            this.f14580j = y();
            File file = new File(this.f14571a + ".tmp");
            if (new File(this.f14571a).renameTo(file)) {
                try {
                    fileInputStream = new FileInputStream(file);
                    try {
                        fileOutputStream = new FileOutputStream(this.f14571a);
                    } catch (Throwable th3) {
                        Throwable th4 = th3;
                        fileOutputStream = null;
                        th2 = th4;
                        b(fileInputStream);
                        b(fileOutputStream);
                        file.delete();
                        throw th2;
                    }
                    try {
                        Z(fileInputStream, fileOutputStream);
                        b(fileInputStream);
                        b(fileOutputStream);
                        file.delete();
                        this.f14580j = null;
                    } catch (Throwable th5) {
                        th2 = th5;
                        b(fileInputStream);
                        b(fileOutputStream);
                        file.delete();
                        throw th2;
                    }
                } catch (Throwable th6) {
                    fileOutputStream = null;
                    th2 = th6;
                    fileInputStream = null;
                    b(fileInputStream);
                    b(fileOutputStream);
                    file.delete();
                    throw th2;
                }
            } else {
                throw new IOException("Could not rename to " + file.getAbsolutePath());
            }
        } else {
            throw new IOException("ExifInterface does not support saving attributes for the current input.");
        }
    }

    public final void Z(InputStream inputStream, OutputStream outputStream) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        b bVar = new b(outputStream, ByteOrder.BIG_ENDIAN);
        if (dataInputStream.readByte() == -1) {
            bVar.f(-1);
            if (dataInputStream.readByte() == -40) {
                bVar.f(-40);
                bVar.f(-1);
                bVar.f(-31);
                k0(bVar, 6);
                byte[] bArr = new byte[4096];
                while (dataInputStream.readByte() == -1) {
                    byte readByte = dataInputStream.readByte();
                    if (readByte == -39 || readByte == -38) {
                        bVar.f(-1);
                        bVar.f(readByte);
                        f(dataInputStream, bVar);
                        return;
                    } else if (readByte != -31) {
                        bVar.f(-1);
                        bVar.f(readByte);
                        int readUnsignedShort = dataInputStream.readUnsignedShort();
                        bVar.k(readUnsignedShort);
                        int i10 = readUnsignedShort - 2;
                        if (i10 >= 0) {
                            while (i10 > 0) {
                                int read = dataInputStream.read(bArr, 0, Math.min(i10, 4096));
                                if (read < 0) {
                                    break;
                                }
                                bVar.write(bArr, 0, read);
                                i10 -= read;
                            }
                        } else {
                            throw new IOException("Invalid length");
                        }
                    } else {
                        int readUnsignedShort2 = dataInputStream.readUnsignedShort() - 2;
                        if (readUnsignedShort2 >= 0) {
                            byte[] bArr2 = new byte[6];
                            if (readUnsignedShort2 >= 6) {
                                if (dataInputStream.read(bArr2) != 6) {
                                    throw new IOException("Invalid exif");
                                } else if (Arrays.equals(bArr2, H6)) {
                                    int i11 = readUnsignedShort2 - 6;
                                    if (dataInputStream.skipBytes(i11) != i11) {
                                        throw new IOException("Invalid length");
                                    }
                                }
                            }
                            bVar.f(-1);
                            bVar.f(readByte);
                            bVar.k(readUnsignedShort2 + 2);
                            if (readUnsignedShort2 >= 6) {
                                readUnsignedShort2 -= 6;
                                bVar.write(bArr2);
                            }
                            while (readUnsignedShort2 > 0) {
                                int read2 = dataInputStream.read(bArr, 0, Math.min(readUnsignedShort2, 4096));
                                if (read2 < 0) {
                                    break;
                                }
                                bVar.write(bArr, 0, read2);
                                readUnsignedShort2 -= read2;
                            }
                        } else {
                            throw new IOException("Invalid length");
                        }
                    }
                }
                throw new IOException("Invalid marker");
            }
            throw new IOException("Invalid marker");
        }
        throw new IOException("Invalid marker");
    }

    public final void a() {
        String j10 = j(f14429i0);
        if (j10 != null && j(Q) == null) {
            this.f14574d[0].put(Q, c.h(j10));
        }
        if (j(f14515t) == null) {
            this.f14574d[0].put(f14515t, c.i(0, this.f14576f));
        }
        if (j(f14523u) == null) {
            this.f14574d[0].put(f14523u, c.i(0, this.f14576f));
        }
        if (j(f14555y) == null) {
            this.f14574d[0].put(f14555y, c.i(0, this.f14576f));
        }
        if (j(H0) == null) {
            this.f14574d[1].put(H0, c.i(0, this.f14576f));
        }
    }

    public void a0(double d10) {
        String str = d10 >= 0.0d ? "0" : "1";
        b0(f14533v1, new f(Math.abs(d10)).toString());
        b0(f14525u1, str);
    }

    public void b0(@m0 String str, @o0 String str2) {
        d dVar;
        int i10;
        c cVar;
        HashMap<String, c> hashMap;
        String str3;
        StringBuilder sb2;
        String str4 = str2;
        String str5 = str;
        String str6 = f14500r0.equals(str5) ? f14508s0 : str5;
        int i11 = 2;
        int i12 = 1;
        if (str4 != null && E6.contains(str6)) {
            if (str6.equals(f14541w1)) {
                Matcher matcher = f14484o7.matcher(str4);
                if (!matcher.find()) {
                    sb2 = new StringBuilder();
                } else {
                    str4 = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
                }
            } else {
                try {
                    str4 = new f(Double.parseDouble(str2)).toString();
                } catch (NumberFormatException unused) {
                    sb2 = new StringBuilder();
                }
            }
            sb2.append("Invalid value for ");
            sb2.append(str6);
            sb2.append(" : ");
            sb2.append(str4);
            return;
        }
        int i13 = 0;
        while (i13 < f14562y6.length) {
            if ((i13 != 4 || this.f14577g) && (dVar = D6[i13].get(str6)) != null) {
                if (str4 == null) {
                    this.f14574d[i13].remove(str6);
                } else {
                    Pair<Integer, Integer> C7 = C(str4);
                    if (dVar.f14593c == ((Integer) C7.first).intValue() || dVar.f14593c == ((Integer) C7.second).intValue()) {
                        i10 = dVar.f14593c;
                    } else {
                        int i14 = dVar.f14594d;
                        if (i14 == -1 || !(i14 == ((Integer) C7.first).intValue() || dVar.f14594d == ((Integer) C7.second).intValue())) {
                            int i15 = dVar.f14593c;
                            if (i15 == i12 || i15 == 7 || i15 == i11) {
                                i10 = i15;
                            } else {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("Given tag (");
                                sb3.append(str6);
                                sb3.append(") value didn't match with one of expected ");
                                sb3.append("formats: ");
                                String[] strArr = f14379b6;
                                sb3.append(strArr[dVar.f14593c]);
                                String str7 = "";
                                if (dVar.f14594d == -1) {
                                    str3 = str7;
                                } else {
                                    str3 = ", " + strArr[dVar.f14594d];
                                }
                                sb3.append(str3);
                                sb3.append(" (guess: ");
                                sb3.append(strArr[((Integer) C7.first).intValue()]);
                                if (((Integer) C7.second).intValue() != -1) {
                                    str7 = ", " + strArr[((Integer) C7.second).intValue()];
                                }
                                sb3.append(str7);
                                sb3.append(")");
                            }
                        } else {
                            i10 = dVar.f14594d;
                        }
                    }
                    switch (i10) {
                        case 1:
                            hashMap = this.f14574d[i13];
                            cVar = c.a(str4);
                            break;
                        case 2:
                        case 7:
                            hashMap = this.f14574d[i13];
                            cVar = c.h(str4);
                            break;
                        case 3:
                            String[] split = str4.split(",", -1);
                            int[] iArr = new int[split.length];
                            for (int i16 = 0; i16 < split.length; i16++) {
                                iArr[i16] = Integer.parseInt(split[i16]);
                            }
                            hashMap = this.f14574d[i13];
                            cVar = c.n(iArr, this.f14576f);
                            break;
                        case 4:
                            String[] split2 = str4.split(",", -1);
                            long[] jArr = new long[split2.length];
                            for (int i17 = 0; i17 < split2.length; i17++) {
                                jArr[i17] = Long.parseLong(split2[i17]);
                            }
                            hashMap = this.f14574d[i13];
                            cVar = c.j(jArr, this.f14576f);
                            break;
                        case 5:
                            String[] split3 = str4.split(",", -1);
                            f[] fVarArr = new f[split3.length];
                            for (int i18 = 0; i18 < split3.length; i18++) {
                                String[] split4 = split3[i18].split("/", -1);
                                fVarArr[i18] = new f((long) Double.parseDouble(split4[0]), (long) Double.parseDouble(split4[1]));
                            }
                            hashMap = this.f14574d[i13];
                            cVar = c.l(fVarArr, this.f14576f);
                            break;
                        case 9:
                            String[] split5 = str4.split(",", -1);
                            int[] iArr2 = new int[split5.length];
                            for (int i19 = 0; i19 < split5.length; i19++) {
                                iArr2[i19] = Integer.parseInt(split5[i19]);
                            }
                            hashMap = this.f14574d[i13];
                            cVar = c.e(iArr2, this.f14576f);
                            break;
                        case 10:
                            String[] split6 = str4.split(",", -1);
                            f[] fVarArr2 = new f[split6.length];
                            int i20 = 0;
                            while (i20 < split6.length) {
                                String[] split7 = split6[i20].split("/", -1);
                                fVarArr2[i20] = new f((long) Double.parseDouble(split7[0]), (long) Double.parseDouble(split7[i12]));
                                i20++;
                                i12 = 1;
                            }
                            hashMap = this.f14574d[i13];
                            cVar = c.g(fVarArr2, this.f14576f);
                            break;
                        case 12:
                            String[] split8 = str4.split(",", -1);
                            double[] dArr = new double[split8.length];
                            for (int i21 = 0; i21 < split8.length; i21++) {
                                dArr[i21] = Double.parseDouble(split8[i21]);
                            }
                            this.f14574d[i13].put(str6, c.c(dArr, this.f14576f));
                            continue;
                        default:
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("Data format isn't one of expected formats: ");
                            sb4.append(i10);
                            continue;
                    }
                    hashMap.put(str6, cVar);
                }
            }
            i13++;
            i11 = 2;
            i12 = 1;
        }
    }

    public final String c(double d10) {
        long j10 = (long) d10;
        double d11 = d10 - ((double) j10);
        long j11 = (long) (d11 * 60.0d);
        long round = Math.round((d11 - (((double) j11) / 60.0d)) * 3600.0d * 1.0E7d);
        return j10 + "/1," + j11 + "/1," + round + "/10000000";
    }

    @x0({x0.a.LIBRARY})
    public void c0(long j10) {
        b0(Q, J5.format(new Date(j10)));
        b0(f14445k0, Long.toString(j10 % 1000));
    }

    public void d0(Location location) {
        if (location != null) {
            b0(Q1, location.getProvider());
            e0(location.getLatitude(), location.getLongitude());
            a0(location.getAltitude());
            b0(B1, "K");
            b0(C1, new f((double) ((location.getSpeed() * ((float) TimeUnit.HOURS.toSeconds(1))) / 1000.0f)).toString());
            String[] split = J5.format(new Date(location.getTime())).split("\\s+", -1);
            b0(S1, split[0]);
            b0(f14541w1, split[1]);
        }
    }

    public void e0(double d10, double d11) {
        if (d10 < -90.0d || d10 > 90.0d || Double.isNaN(d10)) {
            throw new IllegalArgumentException("Latitude value " + d10 + " is not valid.");
        } else if (d11 < -180.0d || d11 > 180.0d || Double.isNaN(d11)) {
            throw new IllegalArgumentException("Longitude value " + d11 + " is not valid.");
        } else {
            b0(f14493q1, d10 >= 0.0d ? "N" : L4);
            b0(f14501r1, c(Math.abs(d10)));
            b0(f14509s1, d11 >= 0.0d ? M4 : N4);
            b0(f14517t1, c(Math.abs(d11)));
        }
    }

    public final void f0(C0234a aVar) throws IOException {
        HashMap<String, c> hashMap = this.f14574d[4];
        c cVar = hashMap.get(f14539w);
        if (cVar != null) {
            int p10 = cVar.p(this.f14576f);
            this.f14581k = p10;
            if (p10 != 1) {
                if (p10 != 6) {
                    if (p10 != 7) {
                        return;
                    }
                }
            }
            if (L(hashMap)) {
                E(aVar, hashMap);
                return;
            }
            return;
        }
        this.f14581k = 6;
        D(aVar, hashMap);
    }

    public void g() {
        int i10 = 1;
        switch (l(f14555y, 1)) {
            case 1:
                i10 = 2;
                break;
            case 2:
                break;
            case 3:
                i10 = 4;
                break;
            case 4:
                i10 = 3;
                break;
            case 5:
                i10 = 6;
                break;
            case 6:
                i10 = 5;
                break;
            case 7:
                i10 = 8;
                break;
            case 8:
                i10 = 7;
                break;
            default:
                i10 = 0;
                break;
        }
        b0(f14555y, Integer.toString(i10));
    }

    public final void g0(int i10, int i11) throws IOException {
        if (!this.f14574d[i10].isEmpty() && !this.f14574d[i11].isEmpty()) {
            c cVar = this.f14574d[i10].get(f14523u);
            c cVar2 = this.f14574d[i10].get(f14515t);
            c cVar3 = this.f14574d[i11].get(f14523u);
            c cVar4 = this.f14574d[i11].get(f14515t);
            if (cVar != null && cVar2 != null && cVar3 != null && cVar4 != null) {
                int p10 = cVar.p(this.f14576f);
                int p11 = cVar2.p(this.f14576f);
                int p12 = cVar3.p(this.f14576f);
                int p13 = cVar4.p(this.f14576f);
                if (p10 < p12 && p11 < p13) {
                    HashMap<String, c>[] hashMapArr = this.f14574d;
                    HashMap<String, c> hashMap = hashMapArr[i10];
                    hashMapArr[i10] = hashMapArr[i11];
                    hashMapArr[i11] = hashMap;
                }
            }
        }
    }

    public void h() {
        int i10 = 1;
        switch (l(f14555y, 1)) {
            case 1:
                i10 = 4;
                break;
            case 2:
                i10 = 3;
                break;
            case 3:
                i10 = 2;
                break;
            case 4:
                break;
            case 5:
                i10 = 8;
                break;
            case 6:
                i10 = 7;
                break;
            case 7:
                i10 = 6;
                break;
            case 8:
                i10 = 5;
                break;
            default:
                i10 = 0;
                break;
        }
        b0(f14555y, Integer.toString(i10));
    }

    public final boolean h0(String str, c cVar) {
        boolean z10 = false;
        for (int i10 = 0; i10 < f14562y6.length; i10++) {
            if (this.f14574d[i10].containsKey(str)) {
                this.f14574d[i10].put(str, cVar);
                z10 = true;
            }
        }
        return z10;
    }

    public double i(double d10) {
        double k10 = k(f14533v1, -1.0d);
        int i10 = -1;
        int l10 = l(f14525u1, -1);
        if (k10 < 0.0d || l10 < 0) {
            return d10;
        }
        if (l10 != 1) {
            i10 = 1;
        }
        return k10 * ((double) i10);
    }

    public final void i0(C0234a aVar, int i10) throws IOException {
        c cVar;
        c cVar2;
        StringBuilder sb2;
        String arrays;
        c cVar3 = this.f14574d[i10].get(Z1);
        c cVar4 = this.f14574d[i10].get(f14423h2);
        c cVar5 = this.f14574d[i10].get(f14407f2);
        c cVar6 = this.f14574d[i10].get(f14399e2);
        c cVar7 = this.f14574d[i10].get(f14415g2);
        if (cVar3 != null) {
            if (cVar3.f14588a == 5) {
                f[] fVarArr = (f[]) cVar3.r(this.f14576f);
                if (fVarArr == null || fVarArr.length != 2) {
                    sb2 = new StringBuilder();
                    sb2.append("Invalid crop size values. cropSize=");
                    arrays = Arrays.toString(fVarArr);
                } else {
                    cVar2 = c.k(fVarArr[0], this.f14576f);
                    cVar = c.k(fVarArr[1], this.f14576f);
                    this.f14574d[i10].put(f14515t, cVar2);
                    this.f14574d[i10].put(f14523u, cVar);
                    return;
                }
            } else {
                int[] iArr = (int[]) cVar3.r(this.f14576f);
                if (iArr == null || iArr.length != 2) {
                    sb2 = new StringBuilder();
                    sb2.append("Invalid crop size values. cropSize=");
                    arrays = Arrays.toString(iArr);
                } else {
                    cVar2 = c.m(iArr[0], this.f14576f);
                    cVar = c.m(iArr[1], this.f14576f);
                    this.f14574d[i10].put(f14515t, cVar2);
                    this.f14574d[i10].put(f14523u, cVar);
                    return;
                }
            }
            sb2.append(arrays);
        } else if (cVar4 == null || cVar5 == null || cVar6 == null || cVar7 == null) {
            W(aVar, i10);
        } else {
            int p10 = cVar4.p(this.f14576f);
            int p11 = cVar6.p(this.f14576f);
            int p12 = cVar7.p(this.f14576f);
            int p13 = cVar5.p(this.f14576f);
            if (p11 > p10 && p12 > p13) {
                c m10 = c.m(p11 - p10, this.f14576f);
                c m11 = c.m(p12 - p13, this.f14576f);
                this.f14574d[i10].put(f14523u, m10);
                this.f14574d[i10].put(f14515t, m11);
            }
        }
    }

    @o0
    public String j(@m0 String str) {
        c n10 = n(str);
        if (n10 != null) {
            if (!E6.contains(str)) {
                return n10.q(this.f14576f);
            }
            if (str.equals(f14541w1)) {
                int i10 = n10.f14588a;
                if (i10 == 5 || i10 == 10) {
                    f[] fVarArr = (f[]) n10.r(this.f14576f);
                    if (fVarArr == null || fVarArr.length != 3) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Invalid GPS Timestamp array. array=");
                        sb2.append(Arrays.toString(fVarArr));
                        return null;
                    }
                    f fVar = fVarArr[0];
                    f fVar2 = fVarArr[1];
                    f fVar3 = fVarArr[2];
                    return String.format("%02d:%02d:%02d", new Object[]{Integer.valueOf((int) (((float) fVar.f14595a) / ((float) fVar.f14596b))), Integer.valueOf((int) (((float) fVar2.f14595a) / ((float) fVar2.f14596b))), Integer.valueOf((int) (((float) fVar3.f14595a) / ((float) fVar3.f14596b)))});
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("GPS Timestamp format is not rational. format=");
                sb3.append(n10.f14588a);
                return null;
            }
            try {
                return Double.toString(n10.o(this.f14576f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final void j0(InputStream inputStream) throws IOException {
        g0(0, 5);
        g0(0, 4);
        g0(5, 4);
        c cVar = this.f14574d[1].get(f14373b0);
        c cVar2 = this.f14574d[1].get(f14381c0);
        if (!(cVar == null || cVar2 == null)) {
            this.f14574d[0].put(f14515t, cVar);
            this.f14574d[0].put(f14523u, cVar2);
        }
        if (this.f14574d[4].isEmpty() && M(this.f14574d[5])) {
            HashMap<String, c>[] hashMapArr = this.f14574d;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        M(this.f14574d[4]);
    }

    public double k(@m0 String str, double d10) {
        c n10 = n(str);
        if (n10 == null) {
            return d10;
        }
        try {
            return n10.o(this.f14576f);
        } catch (NumberFormatException unused) {
            return d10;
        }
    }

    public final int k0(b bVar, int i10) throws IOException {
        b bVar2 = bVar;
        d[][] dVarArr = f14562y6;
        int[] iArr = new int[dVarArr.length];
        int[] iArr2 = new int[dVarArr.length];
        for (d dVar : f14570z6) {
            U(dVar.f14592b);
        }
        U(A6.f14592b);
        U(B6.f14592b);
        for (int i11 = 0; i11 < f14562y6.length; i11++) {
            for (Object obj : this.f14574d[i11].entrySet().toArray()) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getValue() == null) {
                    this.f14574d[i11].remove(entry.getKey());
                }
            }
        }
        if (!this.f14574d[1].isEmpty()) {
            this.f14574d[0].put(f14570z6[1].f14592b, c.i(0, this.f14576f));
        }
        if (!this.f14574d[2].isEmpty()) {
            this.f14574d[0].put(f14570z6[2].f14592b, c.i(0, this.f14576f));
        }
        if (!this.f14574d[3].isEmpty()) {
            this.f14574d[1].put(f14570z6[3].f14592b, c.i(0, this.f14576f));
        }
        if (this.f14577g) {
            this.f14574d[4].put(A6.f14592b, c.i(0, this.f14576f));
            this.f14574d[4].put(B6.f14592b, c.i((long) this.f14579i, this.f14576f));
        }
        for (int i12 = 0; i12 < f14562y6.length; i12++) {
            int i13 = 0;
            for (Map.Entry<String, c> value : this.f14574d[i12].entrySet()) {
                int s10 = ((c) value.getValue()).s();
                if (s10 > 4) {
                    i13 += s10;
                }
            }
            iArr2[i12] = iArr2[i12] + i13;
        }
        int i14 = 8;
        for (int i15 = 0; i15 < f14562y6.length; i15++) {
            if (!this.f14574d[i15].isEmpty()) {
                iArr[i15] = i14;
                i14 += (this.f14574d[i15].size() * 12) + 2 + 4 + iArr2[i15];
            }
        }
        if (this.f14577g) {
            this.f14574d[4].put(A6.f14592b, c.i((long) i14, this.f14576f));
            this.f14578h = i10 + i14;
            i14 += this.f14579i;
        }
        int i16 = i14 + 8;
        if (!this.f14574d[1].isEmpty()) {
            this.f14574d[0].put(f14570z6[1].f14592b, c.i((long) iArr[1], this.f14576f));
        }
        if (!this.f14574d[2].isEmpty()) {
            this.f14574d[0].put(f14570z6[2].f14592b, c.i((long) iArr[2], this.f14576f));
        }
        if (!this.f14574d[3].isEmpty()) {
            this.f14574d[1].put(f14570z6[3].f14592b, c.i((long) iArr[3], this.f14576f));
        }
        bVar2.k(i16);
        bVar2.write(H6);
        bVar2.h(this.f14576f == ByteOrder.BIG_ENDIAN ? L5 : K5);
        bVar2.c(this.f14576f);
        bVar2.k(42);
        bVar2.i(8);
        for (int i17 = 0; i17 < f14562y6.length; i17++) {
            if (!this.f14574d[i17].isEmpty()) {
                bVar2.k(this.f14574d[i17].size());
                int size = iArr[i17] + 2 + (this.f14574d[i17].size() * 12) + 4;
                for (Map.Entry next : this.f14574d[i17].entrySet()) {
                    int i18 = D6[i17].get(next.getKey()).f14591a;
                    c cVar = (c) next.getValue();
                    int s11 = cVar.s();
                    bVar2.k(i18);
                    bVar2.k(cVar.f14588a);
                    bVar2.g(cVar.f14589b);
                    if (s11 > 4) {
                        bVar2.i((long) size);
                        size += s11;
                    } else {
                        bVar2.write(cVar.f14590c);
                        if (s11 < 4) {
                            while (s11 < 4) {
                                bVar2.f(0);
                                s11++;
                            }
                        }
                    }
                }
                if (i17 != 0 || this.f14574d[4].isEmpty()) {
                    bVar2.i(0);
                } else {
                    bVar2.i((long) iArr[4]);
                }
                for (Map.Entry<String, c> value2 : this.f14574d[i17].entrySet()) {
                    byte[] bArr = ((c) value2.getValue()).f14590c;
                    if (bArr.length > 4) {
                        bVar2.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.f14577g) {
            bVar2.write(A());
        }
        bVar2.c(ByteOrder.BIG_ENDIAN);
        return i16;
    }

    public int l(@m0 String str, int i10) {
        c n10 = n(str);
        if (n10 == null) {
            return i10;
        }
        try {
            return n10.p(this.f14576f);
        } catch (NumberFormatException unused) {
            return i10;
        }
    }

    @x0({x0.a.LIBRARY})
    public long m() {
        String j10 = j(Q);
        if (j10 != null && f14476n7.matcher(j10).matches()) {
            try {
                Date parse = J5.parse(j10, new ParsePosition(0));
                if (parse == null) {
                    return -1;
                }
                long time = parse.getTime();
                String j11 = j(f14445k0);
                if (j11 == null) {
                    return time;
                }
                try {
                    long parseLong = Long.parseLong(j11);
                    while (parseLong > 1000) {
                        parseLong /= 10;
                    }
                    return time + parseLong;
                } catch (NumberFormatException unused) {
                    return time;
                }
            } catch (IllegalArgumentException unused2) {
            }
        }
        return -1;
    }

    @o0
    public final c n(@m0 String str) {
        if (f14500r0.equals(str)) {
            str = f14508s0;
        }
        for (int i10 = 0; i10 < f14562y6.length; i10++) {
            c cVar = this.f14574d[i10].get(str);
            if (cVar != null) {
                return cVar;
            }
        }
        return null;
    }

    @x0({x0.a.LIBRARY})
    public long o() {
        String j10 = j(S1);
        String j11 = j(f14541w1);
        if (!(j10 == null || j11 == null)) {
            Pattern pattern = f14476n7;
            if (pattern.matcher(j10).matches() || pattern.matcher(j11).matches()) {
                try {
                    Date parse = J5.parse(j10 + p7.f.f11698i + j11, new ParsePosition(0));
                    if (parse == null) {
                        return -1;
                    }
                    return parse.getTime();
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        return -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0088 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00f7 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void p(w1.a.C0234a r10, int r11, int r12) throws java.io.IOException {
        /*
            r9 = this;
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r10.h(r0)
            long r0 = (long) r11
            r10.g(r0)
            byte r0 = r10.readByte()
            java.lang.String r1 = "Invalid marker: "
            r2 = -1
            if (r0 != r2) goto L_0x0153
            r3 = 1
            int r11 = r11 + r3
            byte r4 = r10.readByte()
            r5 = -40
            if (r4 != r5) goto L_0x0138
            int r11 = r11 + r3
        L_0x001d:
            byte r0 = r10.readByte()
            if (r0 != r2) goto L_0x011b
            int r11 = r11 + r3
            byte r0 = r10.readByte()
            int r11 = r11 + r3
            r1 = -39
            if (r0 == r1) goto L_0x0115
            r1 = -38
            if (r0 != r1) goto L_0x0033
            goto L_0x0115
        L_0x0033:
            int r1 = r10.readUnsignedShort()
            int r1 = r1 + -2
            int r11 = r11 + 2
            java.lang.String r4 = "Invalid length"
            if (r1 < 0) goto L_0x010f
            r5 = -31
            r6 = 0
            java.lang.String r7 = "Invalid exif"
            if (r0 == r5) goto L_0x00ba
            r5 = -2
            if (r0 == r5) goto L_0x0090
            switch(r0) {
                case -64: goto L_0x0057;
                case -63: goto L_0x0057;
                case -62: goto L_0x0057;
                case -61: goto L_0x0057;
                default: goto L_0x004c;
            }
        L_0x004c:
            switch(r0) {
                case -59: goto L_0x0057;
                case -58: goto L_0x0057;
                case -57: goto L_0x0057;
                default: goto L_0x004f;
            }
        L_0x004f:
            switch(r0) {
                case -55: goto L_0x0057;
                case -54: goto L_0x0057;
                case -53: goto L_0x0057;
                default: goto L_0x0052;
            }
        L_0x0052:
            switch(r0) {
                case -51: goto L_0x0057;
                case -50: goto L_0x0057;
                case -49: goto L_0x0057;
                default: goto L_0x0055;
            }
        L_0x0055:
            goto L_0x00e4
        L_0x0057:
            int r0 = r10.skipBytes(r3)
            if (r0 != r3) goto L_0x0088
            java.util.HashMap<java.lang.String, w1.a$c>[] r0 = r9.f14574d
            r0 = r0[r12]
            int r5 = r10.readUnsignedShort()
            long r5 = (long) r5
            java.nio.ByteOrder r7 = r9.f14576f
            w1.a$c r5 = w1.a.c.i(r5, r7)
            java.lang.String r6 = "ImageLength"
            r0.put(r6, r5)
            java.util.HashMap<java.lang.String, w1.a$c>[] r0 = r9.f14574d
            r0 = r0[r12]
            int r5 = r10.readUnsignedShort()
            long r5 = (long) r5
            java.nio.ByteOrder r7 = r9.f14576f
            w1.a$c r5 = w1.a.c.i(r5, r7)
            java.lang.String r6 = "ImageWidth"
            r0.put(r6, r5)
            int r1 = r1 + -5
            goto L_0x00e4
        L_0x0088:
            java.io.IOException r10 = new java.io.IOException
            java.lang.String r11 = "Invalid SOFx"
            r10.<init>(r11)
            throw r10
        L_0x0090:
            byte[] r0 = new byte[r1]
            int r5 = r10.read(r0)
            if (r5 != r1) goto L_0x00b4
            java.lang.String r1 = "UserComment"
            java.lang.String r5 = r9.j(r1)
            if (r5 != 0) goto L_0x00b2
            java.util.HashMap<java.lang.String, w1.a$c>[] r5 = r9.f14574d
            r5 = r5[r3]
            java.lang.String r7 = new java.lang.String
            java.nio.charset.Charset r8 = G6
            r7.<init>(r0, r8)
            w1.a$c r0 = w1.a.c.h(r7)
            r5.put(r1, r0)
        L_0x00b2:
            r1 = r6
            goto L_0x00e4
        L_0x00b4:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r7)
            throw r10
        L_0x00ba:
            r0 = 6
            if (r1 >= r0) goto L_0x00be
            goto L_0x00e4
        L_0x00be:
            byte[] r5 = new byte[r0]
            int r8 = r10.read(r5)
            if (r8 != r0) goto L_0x0109
            int r11 = r11 + 6
            int r1 = r1 + -6
            byte[] r0 = H6
            boolean r0 = java.util.Arrays.equals(r5, r0)
            if (r0 != 0) goto L_0x00d3
            goto L_0x00e4
        L_0x00d3:
            if (r1 <= 0) goto L_0x0103
            r9.f14582l = r11
            byte[] r0 = new byte[r1]
            int r5 = r10.read(r0)
            if (r5 != r1) goto L_0x00fd
            int r11 = r11 + r1
            r9.S(r0, r12)
            goto L_0x00b2
        L_0x00e4:
            if (r1 < 0) goto L_0x00f7
            int r0 = r10.skipBytes(r1)
            if (r0 != r1) goto L_0x00ef
            int r11 = r11 + r1
            goto L_0x001d
        L_0x00ef:
            java.io.IOException r10 = new java.io.IOException
            java.lang.String r11 = "Invalid JPEG segment"
            r10.<init>(r11)
            throw r10
        L_0x00f7:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r4)
            throw r10
        L_0x00fd:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r7)
            throw r10
        L_0x0103:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r7)
            throw r10
        L_0x0109:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r7)
            throw r10
        L_0x010f:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r4)
            throw r10
        L_0x0115:
            java.nio.ByteOrder r11 = r9.f14576f
            r10.h(r11)
            return
        L_0x011b:
            java.io.IOException r10 = new java.io.IOException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Invalid marker:"
            r11.append(r12)
            r12 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r12 = java.lang.Integer.toHexString(r12)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L_0x0138:
            java.io.IOException r10 = new java.io.IOException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r1)
            r12 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r12 = java.lang.Integer.toHexString(r12)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L_0x0153:
            java.io.IOException r10 = new java.io.IOException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r1)
            r12 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r12 = java.lang.Integer.toHexString(r12)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.a.p(w1.a$a, int, int):void");
    }

    @Deprecated
    public boolean q(float[] fArr) {
        double[] r10 = r();
        if (r10 == null) {
            return false;
        }
        fArr[0] = (float) r10[0];
        fArr[1] = (float) r10[1];
        return true;
    }

    @o0
    public double[] r() {
        String j10 = j(f14501r1);
        String j11 = j(f14493q1);
        String j12 = j(f14517t1);
        String j13 = j(f14509s1);
        if (j10 == null || j11 == null || j12 == null || j13 == null) {
            return null;
        }
        try {
            return new double[]{d(j10, j11), d(j12, j13)};
        } catch (IllegalArgumentException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Latitude/longitude values are not parseable. ");
            sb2.append(String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", new Object[]{j10, j11, j12, j13}));
            return null;
        }
    }

    public final int s(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (H(bArr)) {
            return 4;
        }
        if (J(bArr)) {
            return 9;
        }
        if (I(bArr)) {
            return 7;
        }
        return K(bArr) ? 10 : 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t(w1.a.C0234a r6) throws java.io.IOException {
        /*
            r5 = this;
            r5.v(r6)
            java.util.HashMap<java.lang.String, w1.a$c>[] r6 = r5.f14574d
            r0 = 1
            r6 = r6[r0]
            java.lang.String r1 = "MakerNote"
            java.lang.Object r6 = r6.get(r1)
            w1.a$c r6 = (w1.a.c) r6
            if (r6 == 0) goto L_0x00e4
            w1.a$a r1 = new w1.a$a
            byte[] r6 = r6.f14590c
            r1.<init>((byte[]) r6)
            java.nio.ByteOrder r6 = r5.f14576f
            r1.h(r6)
            byte[] r6 = C5
            int r2 = r6.length
            byte[] r2 = new byte[r2]
            r1.readFully(r2)
            r3 = 0
            r1.g(r3)
            byte[] r3 = D5
            int r4 = r3.length
            byte[] r4 = new byte[r4]
            r1.readFully(r4)
            boolean r6 = java.util.Arrays.equals(r2, r6)
            if (r6 == 0) goto L_0x003f
            r2 = 8
        L_0x003b:
            r1.g(r2)
            goto L_0x0048
        L_0x003f:
            boolean r6 = java.util.Arrays.equals(r4, r3)
            if (r6 == 0) goto L_0x0048
            r2 = 12
            goto L_0x003b
        L_0x0048:
            r6 = 6
            r5.T(r1, r6)
            java.util.HashMap<java.lang.String, w1.a$c>[] r6 = r5.f14574d
            r1 = 7
            r6 = r6[r1]
            java.lang.String r2 = "PreviewImageStart"
            java.lang.Object r6 = r6.get(r2)
            w1.a$c r6 = (w1.a.c) r6
            java.util.HashMap<java.lang.String, w1.a$c>[] r2 = r5.f14574d
            r1 = r2[r1]
            java.lang.String r2 = "PreviewImageLength"
            java.lang.Object r1 = r1.get(r2)
            w1.a$c r1 = (w1.a.c) r1
            if (r6 == 0) goto L_0x007c
            if (r1 == 0) goto L_0x007c
            java.util.HashMap<java.lang.String, w1.a$c>[] r2 = r5.f14574d
            r3 = 5
            r2 = r2[r3]
            java.lang.String r4 = "JPEGInterchangeFormat"
            r2.put(r4, r6)
            java.util.HashMap<java.lang.String, w1.a$c>[] r6 = r5.f14574d
            r6 = r6[r3]
            java.lang.String r2 = "JPEGInterchangeFormatLength"
            r6.put(r2, r1)
        L_0x007c:
            java.util.HashMap<java.lang.String, w1.a$c>[] r6 = r5.f14574d
            r1 = 8
            r6 = r6[r1]
            java.lang.String r1 = "AspectFrame"
            java.lang.Object r6 = r6.get(r1)
            w1.a$c r6 = (w1.a.c) r6
            if (r6 == 0) goto L_0x00e4
            java.nio.ByteOrder r1 = r5.f14576f
            java.lang.Object r6 = r6.r(r1)
            int[] r6 = (int[]) r6
            if (r6 == 0) goto L_0x00d3
            int r1 = r6.length
            r2 = 4
            if (r1 == r2) goto L_0x009b
            goto L_0x00d3
        L_0x009b:
            r1 = 2
            r1 = r6[r1]
            r2 = 0
            r3 = r6[r2]
            if (r1 <= r3) goto L_0x00e4
            r4 = 3
            r4 = r6[r4]
            r6 = r6[r0]
            if (r4 <= r6) goto L_0x00e4
            int r1 = r1 - r3
            int r1 = r1 + r0
            int r4 = r4 - r6
            int r4 = r4 + r0
            if (r1 >= r4) goto L_0x00b4
            int r1 = r1 + r4
            int r4 = r1 - r4
            int r1 = r1 - r4
        L_0x00b4:
            java.nio.ByteOrder r6 = r5.f14576f
            w1.a$c r6 = w1.a.c.m(r1, r6)
            java.nio.ByteOrder r0 = r5.f14576f
            w1.a$c r0 = w1.a.c.m(r4, r0)
            java.util.HashMap<java.lang.String, w1.a$c>[] r1 = r5.f14574d
            r1 = r1[r2]
            java.lang.String r3 = "ImageWidth"
            r1.put(r3, r6)
            java.util.HashMap<java.lang.String, w1.a$c>[] r6 = r5.f14574d
            r6 = r6[r2]
            java.lang.String r1 = "ImageLength"
            r6.put(r1, r0)
            goto L_0x00e4
        L_0x00d3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid aspect frame values. frame="
            r0.append(r1)
            java.lang.String r6 = java.util.Arrays.toString(r6)
            r0.append(r6)
        L_0x00e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.a.t(w1.a$a):void");
    }

    public final void u(C0234a aVar) throws IOException {
        aVar.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        aVar.read(bArr);
        aVar.skipBytes(4);
        aVar.read(bArr2);
        int i10 = ByteBuffer.wrap(bArr).getInt();
        int i11 = ByteBuffer.wrap(bArr2).getInt();
        p(aVar, i10, 5);
        aVar.g((long) i11);
        aVar.h(ByteOrder.BIG_ENDIAN);
        int readInt = aVar.readInt();
        for (int i12 = 0; i12 < readInt; i12++) {
            int readUnsignedShort = aVar.readUnsignedShort();
            int readUnsignedShort2 = aVar.readUnsignedShort();
            if (readUnsignedShort == f14443j6.f14591a) {
                short readShort = aVar.readShort();
                short readShort2 = aVar.readShort();
                c m10 = c.m(readShort, this.f14576f);
                c m11 = c.m(readShort2, this.f14576f);
                this.f14574d[0].put(f14523u, m10);
                this.f14574d[0].put(f14515t, m11);
                return;
            }
            aVar.skipBytes(readUnsignedShort2);
        }
    }

    public final void v(C0234a aVar) throws IOException {
        c cVar;
        P(aVar, aVar.available());
        T(aVar, 0);
        i0(aVar, 0);
        i0(aVar, 5);
        i0(aVar, 4);
        j0(aVar);
        if (this.f14573c == 8 && (cVar = this.f14574d[1].get(f14405f0)) != null) {
            C0234a aVar2 = new C0234a(cVar.f14590c);
            aVar2.h(this.f14576f);
            aVar2.g(6);
            T(aVar2, 9);
            c cVar2 = this.f14574d[9].get(Z);
            if (cVar2 != null) {
                this.f14574d[1].put(Z, cVar2);
            }
        }
    }

    public int w() {
        switch (l(f14555y, 1)) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    public final void x(C0234a aVar) throws IOException {
        v(aVar);
        if (this.f14574d[0].get(f14439j2) != null) {
            p(aVar, this.f14586p, 5);
        }
        c cVar = this.f14574d[0].get(f14431i2);
        c cVar2 = this.f14574d[1].get(f14508s0);
        if (cVar != null && cVar2 == null) {
            this.f14574d[1].put(f14508s0, cVar);
        }
    }

    @o0
    public byte[] y() {
        int i10 = this.f14581k;
        if (i10 == 6 || i10 == 7) {
            return A();
        }
        return null;
    }

    @o0
    public Bitmap z() {
        if (!this.f14577g) {
            return null;
        }
        if (this.f14580j == null) {
            this.f14580j = A();
        }
        int i10 = this.f14581k;
        if (i10 == 6 || i10 == 7) {
            return BitmapFactory.decodeByteArray(this.f14580j, 0, this.f14579i);
        }
        if (i10 == 1) {
            int length = this.f14580j.length / 3;
            int[] iArr = new int[length];
            for (int i11 = 0; i11 < length; i11++) {
                byte[] bArr = this.f14580j;
                int i12 = i11 * 3;
                iArr[i11] = (bArr[i12] << 16) + 0 + (bArr[i12 + 1] << 8) + bArr[i12 + 2];
            }
            c cVar = this.f14574d[4].get(f14523u);
            c cVar2 = this.f14574d[4].get(f14515t);
            if (!(cVar == null || cVar2 == null)) {
                return Bitmap.createBitmap(iArr, cVar2.p(this.f14576f), cVar.p(this.f14576f), Bitmap.Config.ARGB_8888);
            }
        }
        return null;
    }
}
