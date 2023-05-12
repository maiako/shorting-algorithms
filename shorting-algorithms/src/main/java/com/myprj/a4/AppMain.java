/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myprj.a4;

import com.myprj.a4.algorithm.BubbleSort;
import com.myprj.a4.algorithm.QuickSort;
import com.myprj.a4.domain.Tshirt;
import com.myprj.a4.domain.utils.CustomChainSizeComp;
import com.myprj.a4.domain.utils.CustomChainFabricComp;
import com.myprj.a4.domain.utils.CustomChainColorComp;
import com.myprj.a4.domain.utils.SortUtils;
import com.myprj.a4.domain.utils.TshirtColorComparator;
import com.myprj.a4.domain.utils.TshirtFabricComparator;
import com.myprj.a4.domain.utils.TshirtSizeComparator;
import com.myprj.a4.domain.utils.TshirtSortByAll;
import java.util.List;

/**
 *
 * @author Μ
 */
public class AppMain {

    public static void main(String[] args) {

        SortUtils su = new SortUtils();

        int tsnumber = 40;
        List<Tshirt> tshirtArrayList = su.createTshirtArrayList(tsnumber);

        System.out.println("List of random Tshirts");

        su.printTshirtArrayList(tshirtArrayList);
        System.out.println("\n");

        System.out.println("-----------------------------------------");

        System.out.println("Bubble Sort: Tshirt list sorted by color in ascending");
        BubbleSort myBubbleSortCA = new BubbleSort();

        myBubbleSortCA.sortTshirtArrayList(tshirtArrayList,
                new CustomChainColorComp(),
                1);
        su.printTshirtArrayList(tshirtArrayList);
        System.out.println("\n");

        System.out.println("Bubble Sort: Tshirt list sorted by color in descending");
        BubbleSort myBubbleSortCD = new BubbleSort();

        myBubbleSortCD.sortTshirtArrayList(tshirtArrayList,
                new CustomChainColorComp(),
                2);
        su.printTshirtArrayList(tshirtArrayList);
        System.out.println("\n");

        System.out.println("-----------------------------------------------");
        System.out.println("Bubble Sort: Tshirt list sorted by fabric in ascending");
        BubbleSort myBubbleSortTshirtFA = new BubbleSort();

        myBubbleSortTshirtFA.sortTshirtArrayList(tshirtArrayList,
                new CustomChainFabricComp(),
                1);
        su.printTshirtArrayList(tshirtArrayList);
        System.out.println("\n");

        System.out.println("Bubble Sort: Tshirt list sorted by fabric in descending");
        BubbleSort myBubbleSortTshirtFD = new BubbleSort();

        myBubbleSortTshirtFD.sortTshirtArrayList(tshirtArrayList,
                new CustomChainFabricComp(),
                2);
        su.printTshirtArrayList(tshirtArrayList);
        System.out.println("\n");

        System.out.println("---------------------------");
        System.out.println("Bubble Sort: Tshirt list sorted by size in ascending");
        BubbleSort myBubbleSortSA = new BubbleSort();

        myBubbleSortSA.sortTshirtArrayList(tshirtArrayList,
                new CustomChainSizeComp(),
                1);
        su.printTshirtArrayList(tshirtArrayList);
        System.out.println("\n");

        System.out.println("Bubble Sort: Tshirt list sorted by size in descending");
        BubbleSort myBubbleSortSD = new BubbleSort();

        myBubbleSortSD.sortTshirtArrayList(tshirtArrayList,
                new CustomChainSizeComp(),
                2);
        su.printTshirtArrayList(tshirtArrayList);
        System.out.println("\n");

        System.out.println("----------------------");
        System.out.println("Bubble Sort: Tshirt list sorted by color, fabric and size in ascending");
        BubbleSort myBubbleSortall = new BubbleSort();

        myBubbleSortall.sortTshirtArrayList(tshirtArrayList,
                new TshirtSortByAll(),
                1);
        su.printTshirtArrayList(tshirtArrayList);
        System.out.println("\n");

        System.out.println("Bubble Sort: Tshirt list sorted by color, fabric and size in descending");
        BubbleSort myBubbleSortallr = new BubbleSort();

        myBubbleSortallr.sortTshirtArrayList(tshirtArrayList,
                new TshirtSortByAll().reversed(),
                2);
        su.printTshirtArrayList(tshirtArrayList);
        System.out.println("\n");

        System.out.println("----------------------");

        System.out.println("Quicksort: Tshirt list sorted by color in ascending");
        QuickSort q = new QuickSort();
        TshirtColorComparator ccomp = new TshirtColorComparator();
        q.quicksort(tshirtArrayList, 0, 39, ccomp);
        su.printTshirtArrayList(tshirtArrayList);
        System.out.println("\n");

        System.out.println("Quicksort: Tshirt list sorted by color in descending");
        QuickSort q1 = new QuickSort();
        TshirtColorComparator ccomp1 = new TshirtColorComparator();
        q1.quicksort(tshirtArrayList, 0, 39, ccomp1.reversed());
        su.printTshirtArrayList(tshirtArrayList);
        System.out.println("\n");

        System.out.println("----------------------");
        System.out.println("Quicksort: Tshirt list sorted by fabric in ascending");
        QuickSort q2 = new QuickSort();
        TshirtFabricComparator fcomp = new TshirtFabricComparator();
        q2.quicksort(tshirtArrayList, 0, 39, fcomp);
        su.printTshirtArrayList(tshirtArrayList);
        System.out.println("\n");

        System.out.println("Quicksort: Tshirt list sorted by fabric in descending");
        QuickSort qf = new QuickSort();
        TshirtFabricComparator fcomp1 = new TshirtFabricComparator();
        qf.quicksort(tshirtArrayList, 0, 39, fcomp1.reversed());
        su.printTshirtArrayList(tshirtArrayList);
        System.out.println("\n");

        System.out.println("----------------------");
        System.out.println("Quicksort: Tshirt list sorted by size in ascending");
        QuickSort qs1 = new QuickSort();
        TshirtSizeComparator scomp = new TshirtSizeComparator();
        qs1.quicksort(tshirtArrayList, 0, 39, scomp);
        su.printTshirtArrayList(tshirtArrayList);
        System.out.println("\n");

        System.out.println("Quicksort: Tshirt list sorted by size in descending");
        QuickSort qs2 = new QuickSort();
        TshirtSizeComparator scomp1 = new TshirtSizeComparator();
        qs2.quicksort(tshirtArrayList, 0, 39, scomp1.reversed());
        su.printTshirtArrayList(tshirtArrayList);
        System.out.println("\n");

        System.out.println("----------------------");
        System.out.println("Quicksort: Tshirt list sorted by color, fabric and size in ascending");
        QuickSort qall = new QuickSort();
        TshirtSortByAll acomp = new TshirtSortByAll();
        qall.quicksort(tshirtArrayList, 0, 39, acomp);
        su.printTshirtArrayList(tshirtArrayList);
        System.out.println("\n");

        System.out.println("Quicksort: Tshirt list sorted by color, fabric and size in descending");
        QuickSort qall2 = new QuickSort();
        TshirtSortByAll acomp1 = new TshirtSortByAll();
        qall2.quicksort(tshirtArrayList, 0, 39, acomp1.reversed());
        su.printTshirtArrayList(tshirtArrayList);
        System.out.println("\n");

        System.out.println("----------------------");
    }

}
