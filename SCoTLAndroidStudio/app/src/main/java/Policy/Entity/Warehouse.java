package Policy.Entity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Warehouse
{
    private String m_id = null;
    private String m_stateName = null;
    private String m_cityName = null;
    private String m_streetName = null;
    private int m_number = 0;
    private String m_beginDate = null;
    private String m_endDate = null;
    private Person m_owner = null;

    public Warehouse() {}

    public Warehouse(String id)
    {
        m_id = new String(id);
    }

    public Warehouse
    (
        String id,
        String stateName,
        String cityName,
        String streetName,
        int number,
        String beginDate,
        String endDate,
        Person owner
    )
    {
        m_id = new String(id);
        m_stateName = new String(stateName);
        m_cityName = new String(cityName);
        m_streetName = new String(streetName);
        m_beginDate = new String(beginDate);
        if(endDate != null)
        {
            m_endDate = new String(endDate);
        }
        m_number = number;
        m_owner = new Person(owner);
    }

    public Warehouse(Warehouse toCopy)
    {
        m_id = toCopy.GetId();
        m_stateName = toCopy.GetStateName();
        m_cityName = toCopy.GetCityName();
        m_streetName = toCopy.GetStreetName();
        m_owner = new Person(toCopy.GetOwner());
        m_beginDate = toCopy.GetBeginDate();
        m_endDate = toCopy.GetEndDate();
        m_number = toCopy.m_number;
    }

    public String GetId() 
    {
        return m_id == null ? null : new String(m_id);
    }

    public String GetStateName() 
    {
        return m_stateName == null ? null : new String(m_stateName);
    }

    public String GetCityName()
    {
        return m_cityName == null ? null : new String(m_cityName);
    }

    public String GetStreetName() 
    {
        return m_streetName == null ? null : new String(m_streetName);
    }

    public String GetBeginDate()
    {
        return m_beginDate == null ? null : new String(m_beginDate);
    }

    public String GetEndDate()
    {
        return m_endDate == null ? null : new String(m_endDate);
    }

    public int GetNumber() 
    {
        return m_number;
    }

    public Person GetOwner() 
    {
        return m_owner == null ? null : new Person(m_owner);
    }

    public void SetStateName(String stateName)
    {
        m_stateName = String.copyValueOf(stateName.toCharArray());
    }

    public void SetCityName(String cityName)
    {
        m_cityName = String.copyValueOf(cityName.toCharArray());
    }

    public void SetStreetName(String streetName)
    {
        m_streetName = String.copyValueOf(streetName.toCharArray());
    }

    public void SetNumber(int number)
    {
        m_number = number;
    }

    public void SetOwner(Person owner)
    {
        if(m_owner == null)
        {
            m_owner = new Person(owner);
            return;
        }
        m_owner.CopyValuesOf(owner);
    }
    
    public void CopyAttributesOf(Warehouse toCopy)
    {
        m_id = toCopy.GetId();
        m_stateName = toCopy.GetStateName();
        m_streetName = toCopy.GetStreetName();
        m_streetName = toCopy.GetStreetName();

        m_number = toCopy.GetNumber();
        m_owner = toCopy.GetOwner();
    }

    @Override
    public boolean equals(Object o)
    {
        if(o == this)
        {
            return true;
        }

        if(o == null || o.getClass() != Warehouse.class)
        {
            return false;
        }

        Warehouse casted = (Warehouse) o;

        return casted.GetId().equals(m_id);
    }

    @Override
    public String toString()
    {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append("Warehouse ID: "+m_id+"\n");
        stringBuilder.append("State name: "+m_stateName+"\n");
        stringBuilder.append("City name: "+m_cityName+"\n");
        stringBuilder.append("Street name: "+m_streetName+"\n");
        stringBuilder.append("Number: "+m_number+"\n");
        stringBuilder.append("Begin date: "+m_beginDate+"\n");
        stringBuilder.append("End date: "+m_endDate+"\n");
        stringBuilder.append("Owner: \n"+m_owner+"\n");

        return stringBuilder.toString();
    }
}
