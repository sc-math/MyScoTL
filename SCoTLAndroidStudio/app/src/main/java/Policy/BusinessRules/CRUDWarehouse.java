package Policy.BusinessRules;

import Policy.Entity.Warehouse;

public class CRUDWarehouse 
{
    public static Warehouse[] GetWarehouses(boolean withPastRegister)
    {
        return DatabaseAccess.warehouseOperationsInterface.GetWarehouses(withPastRegister);
    }

    public static Warehouse[] GetWarehouses(String stateName, boolean withPastRegister)
    {
        return DatabaseAccess.warehouseOperationsInterface.GetWarehouses(stateName, withPastRegister);
    }

    public static Warehouse[] GetWarehouses(String stateName, String streetName)
    {
        return DatabaseAccess.warehouseOperationsInterface.GetWarehouses(stateName, streetName);
    }

    public static Warehouse[] GetWarehousesByOwnerCpf(String ownerCpf)
    {
        return DatabaseAccess.warehouseOperationsInterface.GetWarehousesByOwnerCpf(ownerCpf);
    }

    public static Warehouse[] GetWarehouse(String id, boolean withPastRegister)
    {
        return DatabaseAccess.warehouseOperationsInterface.GetWarehouse(id, withPastRegister);
    }

    public static Warehouse GetWarehouse(String stateName, String streetName, int number)
    {
        return DatabaseAccess.warehouseOperationsInterface.GetWarehouse(stateName, streetName, number);
    }

    public static Boolean TryRegisterWarehouse(Warehouse warehouse)
    {
        return DatabaseAccess.warehouseOperationsInterface.TryRegisterWarehouse(warehouse);
    }

    public static Boolean TryUpdateWarehouse(Warehouse warehouse)
    {
        return DatabaseAccess.warehouseOperationsInterface.TryUpdateWarehouse(warehouse);
    }
    
    public static Boolean TryRemoveWarehouse(String id)
    {
        return DatabaseAccess.warehouseOperationsInterface.TryRemoveWarehouse(id);
    }
}
