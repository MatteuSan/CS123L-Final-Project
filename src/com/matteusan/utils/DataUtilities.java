package com.matteusan.utils;

import com.matteusan.Block;
import com.matteusan.Lot;
import com.matteusan.houses.*;

/**
 * @author Matthew Hernandez
 */
public abstract class DataUtilities {
    public static Object[][] getData(Block[] blockList) {
        return new Object[][]{
                new Lot(1, blockList[0], 600, new Pueblo(), 1000000, 1).getLotData(),
                new Lot(2, blockList[0], 500, new Contemporary(), 4000000, 1).getLotData(),
                new Lot(3, blockList[0], 400, new Cottage(), 2000000, 1).getLotData(),
                new Lot(4, blockList[0], 300, new Cottage(), 8000000, 1).getLotData(),
                new Lot(5, blockList[0], 500, new Duplex(), 2000000, 1).getLotData(),
                new Lot(6, blockList[0], 200, new Duplex(), 7000000, 1).getLotData(),
                new Lot(7, blockList[0], 700, new Duplex(), 5000000, 1).getLotData(),
                new Lot(8, blockList[0], 700, new Cottage(), 3000000, 1).getLotData(),
                new Lot(9, blockList[0], 300, new Bungalow(), 6000000, 1).getLotData(),
                new Lot(10, blockList[0], 800, new Contemporary(), 9000000, 1).getLotData(),
                new Lot(11, blockList[0], 300, new Bungalow(), 4000000, 1).getLotData(),
                new Lot(12, blockList[0], 500, new Bungalow(), 8000000, 1).getLotData(),
                new Lot(13, blockList[0], 700, new Contemporary(), 5000000, 1).getLotData(),
                new Lot(14, blockList[0], 700, new Duplex(), 7000000, 1).getLotData(),
                new Lot(15, blockList[0], 500, new Cottage(), 9000000, 1).getLotData(),
                new Lot(16, blockList[0], 300, new Duplex(), 8000000, 1).getLotData(),
                new Lot(17, blockList[0], 200, new Victorian(), 2000000, 1).getLotData(),
                new Lot(18, blockList[0], 700, new Duplex(), 3000000, 1).getLotData(),
                new Lot(19, blockList[0], 700, new Victorian(), 6000000, 1).getLotData(),
                new Lot(20, blockList[0], 200, new Pueblo(), 8000000, 1).getLotData(),
                new Lot(21, blockList[1], 800, new Victorian(), 3000000, 1).getLotData(),
                new Lot(22, blockList[1], 400, new Victorian(), 2000000, 1).getLotData(),
                new Lot(23, blockList[1], 400, new Victorian(), 3000000, 1).getLotData(),
                new Lot(24, blockList[1], 300, new Bungalow(), 3000000, 1).getLotData(),
                new Lot(25, blockList[1], 600, new Bungalow(), 7000000, 1).getLotData(),
                new Lot(26, blockList[1], 800, new Victorian(), 6000000, 1).getLotData(),
                new Lot(27, blockList[1], 200, new Contemporary(), 3000000, 1).getLotData(),
                new Lot(28, blockList[1], 500, new Duplex(), 4000000, 1).getLotData(),
                new Lot(29, blockList[1], 600, new Cottage(), 5000000, 1).getLotData(),
                new Lot(30, blockList[1], 200, new Cottage(), 5000000, 1).getLotData(),
                new Lot(31, blockList[1], 300, new Bungalow(), 7000000, 1).getLotData(),
                new Lot(32, blockList[1], 500, new Contemporary(), 4000000, 1).getLotData(),
                new Lot(33, blockList[1], 400, new Cottage(), 5000000, 1).getLotData(),
                new Lot(34, blockList[1], 400, new Duplex(), 4000000, 1).getLotData(),
                new Lot(35, blockList[1], 200, new Victorian(), 5000000, 1).getLotData(),
                new Lot(36, blockList[1], 400, new Cottage(), 3000000, 1).getLotData(),
                new Lot(37, blockList[1], 100, new Pueblo(), 1000000, 1).getLotData(),
                new Lot(38, blockList[1], 700, new Cottage(), 8000000, 1).getLotData(),
                new Lot(39, blockList[1], 600, new Cottage(), 6000000, 1).getLotData(),
                new Lot(40, blockList[1], 300, new Victorian(), 5000000, 1).getLotData(),
                new Lot(41, blockList[2], 700, new Bungalow(), 8000000, 1).getLotData(),
                new Lot(42, blockList[2], 700, new Victorian(), 8000000, 1).getLotData(),
                new Lot(43, blockList[2], 600, new Victorian(), 4000000, 1).getLotData(),
                new Lot(44, blockList[2], 900, new Duplex(), 4000000, 1).getLotData(),
                new Lot(45, blockList[2], 600, new Duplex(), 3000000, 1).getLotData(),
                new Lot(46, blockList[2], 700, new Duplex(), 7000000, 1).getLotData(),
                new Lot(47, blockList[2], 800, new Cottage(), 6000000, 1).getLotData(),
                new Lot(48, blockList[2], 500, new Contemporary(), 8000000, 1).getLotData(),
                new Lot(49, blockList[2], 200, new Pueblo(), 3000000, 1).getLotData(),
                new Lot(50, blockList[2], 500, new Victorian(), 3000000, 1).getLotData(),
                new Lot(51, blockList[2], 800, new Pueblo(), 4000000, 1).getLotData(),
                new Lot(52, blockList[2], 500, new Victorian(), 9000000, 1).getLotData(),
                new Lot(53, blockList[2], 400, new Pueblo(), 6000000, 1).getLotData(),
                new Lot(54, blockList[2], 100, new Cottage(), 1000000, 1).getLotData(),
                new Lot(55, blockList[2], 300, new Bungalow(), 7000000, 1).getLotData(),
                new Lot(56, blockList[2], 800, new Bungalow(), 1000000, 1).getLotData(),
                new Lot(57, blockList[2], 200, new Cottage(), 4000000, 1).getLotData(),
                new Lot(58, blockList[2], 200, new Bungalow(), 9000000, 1).getLotData(),
                new Lot(59, blockList[2], 300, new Bungalow(), 4000000, 1).getLotData(),
                new Lot(60, blockList[2], 600, new Cottage(), 3000000, 1).getLotData(),
                new Lot(61, blockList[3], 800, new Duplex(), 5000000, 1).getLotData(),
                new Lot(62, blockList[3], 300, new Duplex(), 2000000, 1).getLotData(),
                new Lot(63, blockList[3], 600, new Duplex(), 7000000, 1).getLotData(),
                new Lot(64, blockList[3], 200, new Cottage(), 5000000, 1).getLotData(),
                new Lot(65, blockList[3], 200, new Bungalow(), 8000000, 1).getLotData(),
                new Lot(66, blockList[3], 800, new Bungalow(), 5000000, 1).getLotData(),
                new Lot(67, blockList[3], 600, new Pueblo(), 9000000, 1).getLotData(),
                new Lot(68, blockList[3], 500, new Contemporary(), 4000000, 1).getLotData(),
                new Lot(69, blockList[3], 700, new Cottage(), 7000000, 1).getLotData(),
                new Lot(70, blockList[3], 600, new Victorian(), 3000000, 1).getLotData(),
                new Lot(71, blockList[3], 100, new Cottage(), 6000000, 1).getLotData(),
                new Lot(72, blockList[3], 100, new Cottage(), 8000000, 1).getLotData(),
                new Lot(73, blockList[3], 500, new Bungalow(), 5000000, 1).getLotData(),
                new Lot(74, blockList[3], 200, new Victorian(), 7000000, 1).getLotData(),
                new Lot(75, blockList[3], 800, new Cottage(), 5000000, 1).getLotData(),
                new Lot(76, blockList[3], 800, new Victorian(), 6000000, 1).getLotData(),
                new Lot(77, blockList[3], 100, new Pueblo(), 3000000, 1).getLotData(),
                new Lot(78, blockList[3], 300, new Contemporary(), 9000000, 1).getLotData(),
                new Lot(79, blockList[3], 600, new Cottage(), 3000000, 1).getLotData(),
                new Lot(80, blockList[3], 400, new Cottage(), 7000000, 1).getLotData(),
                new Lot(81, blockList[4], 700, new Cottage(), 3000000, 1).getLotData(),
                new Lot(82, blockList[4], 800, new Duplex(), 4000000, 1).getLotData(),
                new Lot(83, blockList[4], 900, new Bungalow(), 4000000, 1).getLotData(),
                new Lot(84, blockList[4], 200, new Duplex(), 6000000, 1).getLotData(),
                new Lot(85, blockList[4], 800, new Bungalow(), 9000000, 1).getLotData(),
                new Lot(86, blockList[4], 400, new Bungalow(), 3000000, 1).getLotData(),
                new Lot(87, blockList[4], 600, new Duplex(), 5000000, 1).getLotData(),
                new Lot(88, blockList[4], 300, new Pueblo(), 1000000, 1).getLotData(),
                new Lot(89, blockList[4], 700, new Bungalow(), 8000000, 1).getLotData(),
                new Lot(90, blockList[4], 900, new Bungalow(), 6000000, 1).getLotData(),
                new Lot(91, blockList[4], 500, new Cottage(), 4000000, 1).getLotData(),
                new Lot(92, blockList[4], 600, new Contemporary(), 8000000, 1).getLotData(),
                new Lot(93, blockList[4], 400, new Bungalow(), 5000000, 1).getLotData(),
                new Lot(94, blockList[4], 800, new Victorian(), 8000000, 1).getLotData(),
                new Lot(95, blockList[4], 400, new Victorian(), 8000000, 1).getLotData(),
                new Lot(96, blockList[4], 600, new Bungalow(), 2000000, 1).getLotData(),
                new Lot(97, blockList[4], 200, new Contemporary(), 4000000, 1).getLotData(),
                new Lot(98, blockList[4], 400, new Pueblo(), 3000000, 1).getLotData(),
                new Lot(99, blockList[4], 700, new Bungalow(), 4000000, 1).getLotData(),
                new Lot(100, blockList[4], 300, new Pueblo(), 8000000, 1).getLotData(),
        };
    }
}