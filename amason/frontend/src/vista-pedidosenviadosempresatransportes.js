import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-pedidosenviadosempresatransportes`
 *
 * VistaPedidosenviadosempresatransportes element.
 *
 * @customElement
 * @polymer
 */
class VistaPedidosenviadosempresatransportes extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
        `;
    }

    static get is() {
        return 'vista-pedidosenviadosempresatransportes';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaPedidosenviadosempresatransportes.is, VistaPedidosenviadosempresatransportes);
