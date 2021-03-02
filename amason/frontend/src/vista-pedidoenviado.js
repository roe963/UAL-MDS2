import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-pedidoenviado`
 *
 * VistaPedidoenviado element.
 *
 * @customElement
 * @polymer
 */
class VistaPedidoenviado extends PolymerElement {

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
        return 'vista-pedidoenviado';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaPedidoenviado.is, VistaPedidoenviado);
