# WaterCooler Singleton Example

این پروژه نمونه‌ای از پیاده‌سازی الگوی **Singleton** در جاوا است. کلاس `WaterCooler` به عنوان یک نمونه یکتا (Single Instance) از آبسردکن عمل می‌کند و از این الگو برای اطمینان از وجود تنها یک نمونه از کلاس استفاده شده است.

## ویژگی‌های اصلی:

- **Thread-Safe Singleton**: پیاده‌سازی `WaterCooler` به صورت Thread-Safe با استفاده از روش **Double-Checked Locking** است که تضمین می‌کند تنها یک نمونه از `WaterCooler` در محیط‌های چند رشته‌ای ایجاد شود.
- **Serialization Safety**: با استفاده از متد `readResolve()`، از ایجاد نمونه‌های اضافی در هنگام deserialization جلوگیری می‌شود.
- **Reflection Safety**: در سازنده‌ی کلاس `WaterCooler`، اگر نمونه قبلاً ایجاد شده باشد، از ایجاد نمونه جدید با استفاده از Reflection جلوگیری می‌شود.

## ساختار پروژه:

1. **WaterCooler.java**:
    - پیاده‌سازی الگوی Singleton برای ایجاد تنها یک نمونه از کلاس `WaterCooler`.
    - حفاظت در برابر مسائل مربوط به Reflection و Serialization.

2. **Main.java**:
    - تست پیاده‌سازی Singleton با فراخوانی دو بار `getInstance()` و مقایسه نمونه‌ها.

## نحوه استفاده:

برای استفاده از این پروژه:

1. پروژه را دانلود کرده و آن را با IDE مورد نظر (مانند IntelliJ IDEA یا Eclipse) باز کنید.
2. کلاس `WaterCooler` در هنگام اولین فراخوانی `getInstance()` یک نمونه از `WaterCooler` را ایجاد می‌کند.
3. در فراخوانی‌های بعدی از `getInstance()` همان نمونه قبلی باز می‌گردد.

### مثال:

```java
public class Main {
    public static void main(String[] args) {

        WaterCooler cooler1 = WaterCooler.getInstance();
        cooler1.drinkWater();  // Drinking water from the water cooler.

        WaterCooler cooler2 = WaterCooler.getInstance();
        cooler2.drinkWater();  // Drinking water from the water cooler.

        // بررسی می‌کنیم که هر دو نمونه یکسان هستند
        System.out.println(cooler1 == cooler2);  // true
    }
}
