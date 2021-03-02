import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-tramitarpedido`
 *
 * VistaTramitarpedido element.
 *
 * @customElement
 * @polymer
 */
class VistaTramitarpedido extends PolymerElement {

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
        return 'vista-tramitarpedido';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaTramitarpedido.is, VistaTramitarpedido);
