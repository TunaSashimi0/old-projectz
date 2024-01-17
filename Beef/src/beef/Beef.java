/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beef;

import java.util.Scanner;

/**
 *
 * @author Alex_
 */
public class Beef {
    static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    }
    int search(int a[])
{
    int l=0,r=n;
    while(l<r)
    {
        int mid=(l+r)/2;
        if(a[mid]>=k) r=mid;
        else l=mid+1;
    }
    return r;
}

}
