# Sorting-Polygon

A Java application used to sort various ploygon by either their base area, height, or volume.

## Specifications

- Object-Oriented Design
- Implemented 5 sorting algorithmn
  - bubble, insertion, selection, merge, quick
- Documented complexity analysis in Javadoc

## Usage

File name F, the compare type and the sort type are provided as parameters (-f –t –s or -F –T –S ) via command line. The program must be order and case insensitive. For example, all examples below are valid inputs

```bash
java  -jar sort.jar –fpolygons1.dat –Tv –Sb 
java -jar sort.jar –ta –sQ –fpolygons4.dat 
java -jar sort.jar –tH –Fpolygons2.dat –sB 
```
where v is volume, h is height, a is base area, b is bubble, s is selection, i is insertion, m is merge, q is quick, and your implemented sort is z. 
