/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

/**
 *
 * @author S
 */
public class Edge {

    public Vertex destination;
    public int weight;

    public Edge() {
        destination = null;
        weight = 1;
    }

    public Edge(Vertex d, int w) {
        destination = d;
        weight = w;
    }

    public int getWeight() {
        return weight;
    }

    public Vertex getDestination() {
        return destination;
    }
}
