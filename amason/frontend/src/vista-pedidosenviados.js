import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-pedidosenviados`
 *
 * VistaPedidosenviados element.
 *
 * @customElement
 * @polymer
 */
class VistaPedidosenviados extends PolymerElement {

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
        return 'vista-pedidosenviados';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaPedidosenviados.is, VistaPedidosenviados);
