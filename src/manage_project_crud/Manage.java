package manage_project_crud;

public class Manage {
    private Product[] productList = new Product[100];

    public void showList() {
        for (int i = 0; i < productList.length; i++) {
            if (productList[i] != null) {
                System.out.println(productList[i].hienThi());
            } else {
                break;
            }
        }
    }
    public void add(Product product){
        for(int i = 0; i < productList.length; i++) {
            if(productList[i] == null){
                productList[i] = product;
                break;
            }
        }
    }
    public boolean deleteByID(int id){
        for (int i = 0; i < productList.length; i++) {
            if(productList[i] != null && productList[i].getId() == id){
                for (int j = i; j < productList.length - 1; j++) {
                    productList[j] = productList[j + 1];
                }
                productList[productList.length-1] = null;
                return true;
            }
        }
        return false;
    }
    public Product find(int id){
        for (int i = 0; i < productList.length; i++) {
            if (productList[i] != null && productList[i].getId() == id) {
                return productList[i];
            }
        }
            return null;
    }
}




