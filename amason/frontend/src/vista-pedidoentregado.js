import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-pedidoentregado`
 *
 * VistaPedidoentregado element.
 *
 * @customElement
 * @polymer
 */
class VistaPedidoentregado extends PolymerElement {

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
        return 'vista-pedidoentregado';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaPedidoentregado.is, VistaPedidoentregado);
