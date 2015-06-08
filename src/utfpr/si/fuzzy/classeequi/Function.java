/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utfpr.si.fuzzy.classeequi;

/**
 *
 * @author henrique
 */
public interface Function<T, L> {
    public T getValueFor(L param);
}
