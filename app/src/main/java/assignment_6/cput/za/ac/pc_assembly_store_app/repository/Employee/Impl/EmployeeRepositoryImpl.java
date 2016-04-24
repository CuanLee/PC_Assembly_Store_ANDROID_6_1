package assignment_6.cput.za.ac.pc_assembly_store_app.repository.Employee.Impl;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.Set;

import assignment_6.cput.za.ac.pc_assembly_store_app.conf.database.DBConstants;
import assignment_6.cput.za.ac.pc_assembly_store_app.domain.Employee.Employee;
import assignment_6.cput.za.ac.pc_assembly_store_app.repository.Employee.EmployeeRepository;
import assignment_6.cput.za.ac.pc_assembly_store_app.repository.Repository;

/**
 * Created by CuanL on 19/04/2016.
 */
/*public class EmployeeRepositoryImpl extends SQLiteOpenHelper implements EmployeeRepository{
    public static final String TABLE_NAME = "hdd";
    private SQLiteDatabase db;

    public static final String COLUMN_ID = "id";
    public static final String COLUMN_USERNAME = "username";
    public static final String COLUMN_PASSWORD = "password";
    public static final String COLUMN_FIRSTNAME = "firstName";
    public static final String COLUMN_LASTNAME = "lastName";
    public static final String COLUMN_GENDER = "gender";
    public static final String COLUMN_CONTACT_DETAILS = "contactDetails";
    public static final String COLUMN_GEOGRAPHICAL_DETAILS = "geographicalDetails";
    public static final String COLUMN_ID_NUMBER = "idNumber";

    private static final String DATABASE_CREATE = " CREATE TABLE "
            + TABLE_NAME + "("
            + COLUMN_ID + " INTEGER  PRIMARY KEY AUTOINCREMENT, "
            + COLUMN_USERNAME + " TEXT  NOT NULL , "
            + COLUMN_PASSWORD + " TEXT  NOT NULL , "
            + COLUMN_FIRSTNAME + " TEXT  NOT NULL , "
            + COLUMN_LASTNAME + " TEXT  NOT NULL , "
            + COLUMN_GENDER + " TEXT  NOT NULL , "
            + COLUMN_CONTACT_DETAILS + " REAL  NULL , "
            + COLUMN_GEOGRAPHICAL_DETAILS + " REAL NULL , "
            + COLUMN_ID_NUMBER + " TEXT NOT NULL );";

    public EmployeeRepositoryImpl(Context context)
    {
        super(context, DBConstants.DATABASE_NAME, null, DBConstants.DATABASE_VERSION);
    }

    public void open() throws SQLException {
        db = this.getWritableDatabase();
    }

    public void close() {
        this.close();
    }

    @Override
    public Employee findById(Long aLong) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(
                TABLE_NAME,
                new String[]{
                        COLUMN_ID,
                        COLUMN_USERNAME,
                        COLUMN_PASSWORD,
                        COLUMN_FIRSTNAME,
                        COLUMN_LASTNAME,
                        COLUMN_GENDER,
                        COLUMN_CONTACT_DETAILS,
                        COLUMN_GEOGRAPHICAL_DETAILS,
                        COLUMN_ID_NUMBER,
                COLUMN_ID + " =? ",
                new String[]{String.valueOf(id)},
                null,
                null,
                null,
                null);
        if (cursor.moveToFirst()) {
            final Employee hdd = new Employee.Builder()
                    .id(cursor.getLong(cursor.getColumnIndex(COLUMN_ID)))
                    .username(cursor.getString(cursor.getColumnIndex(COLUMN_USERNAME)))
                    .password(cursor.getString(cursor.getColumnIndex(COLUMN_PASSWORD)))
                    .firstName(cursor.getString(cursor.getColumnIndex(COLUMN_FIRSTNAME)))
                    .lastName(cursor.getString(cursor.getColumnIndex(COLUMN_LASTNAME)))
                    .gender(cursor.getString(cursor.getColumnIndex(COLUMN_GENDER)))
                    .contactDetails(cursor.getBlob(cursor.getColumnIndex(COLUMN_CONTACT_DETAILS)))
                    .geographicalDetails(cursor.getString(cursor.getColumnIndex(COLUMN_GEOGRAPHICAL_DETAILS)))
                    .idNumber(cursor.getInt(cursor.getColumnIndex(COLUMN_ID_NUMBER)))
                    .build();

            return hdd;
        } else {
            return null;
        }
    }

    @Override
    public Employee save(Employee entity) {
        return null;
    }

    @Override
    public Employee update(Employee entity) {
        return null;
    }

    @Override
    public Employee delete(Employee entity) {
        return null;
    }

    @Override
    public Set<Employee> findAll() {
        return null;
    }

    @Override
    public int deleteAll() {
        return 0;
    }
}*/
