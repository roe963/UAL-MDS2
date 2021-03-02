import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-pedido`
 *
 * VistaPedido element.
 *
 * @customElement
 * @polymer
 */
class VistaPedido extends PolymerElement {

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
        return 'vista-pedido';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaPedido.is, VistaPedido);
